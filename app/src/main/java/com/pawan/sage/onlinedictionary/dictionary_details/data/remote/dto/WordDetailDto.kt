package com.pawan.sage.onlinedictionary.dictionary_details.data.remote.dto

import com.pawan.sage.onlinedictionary.dictionary_details.domain.model.WordInfo

data class WordDetailDto(
    val meanings: List<MeaningDto>,
    val origin: String,
    val phonetic: String,
    val phoneticDtos: List<PhoneticDto>,
    val word: String
) {
    fun toWordInfo(): WordInfo {
        return WordInfo(
            meanings = meanings.map { it.toMeaning() },
            origin = origin,
            phonetic = phonetic,
            word = word
        )
    }
}