package com.pawan.sage.onlinedictionary.dictionary_details.data.remote.dto

import com.pawan.sage.onlinedictionary.dictionary_details.domain.model.Meaning

data class MeaningDto(
    val definitionDtos: List<DefinitionDto>,
    val partOfSpeech: String
) {
    fun toMeaning(): Meaning {
        return Meaning(
            definitionDtos = definitionDtos.map { it.definition },
            partOfSpeech = partOfSpeech
        )
    }
}