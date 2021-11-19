package com.pawan.sage.onlinedictionary.dictionary_details.data.remote.dto

data class MeaningDto(
    val definitionDtos: List<DefinitionDto>,
    val partOfSpeech: String
)