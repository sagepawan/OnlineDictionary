package com.pawan.sage.onlinedictionary.dictionary_details.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.pawan.sage.onlinedictionary.dictionary_details.domain.model.Meaning
import com.pawan.sage.onlinedictionary.dictionary_details.domain.model.WordInfo

@Entity
data class WordInfoEntity(
    val word: String,
    val phonetic: String,
    val origin: String,
    val meanings: List<Meaning>,
    @PrimaryKey val id: Int? = null
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings,
            word = word,
            phonetic = phonetic,
            origin = origin
        )
    }
}
