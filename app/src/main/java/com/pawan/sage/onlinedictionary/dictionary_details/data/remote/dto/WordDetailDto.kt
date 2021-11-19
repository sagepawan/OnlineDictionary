package com.pawan.sage.onlinedictionary.dictionary_details.data.remote.dto

data class WordDetailDto(
    val meaningDtos: List<MeaningDto>,
    val origin: String,
    val phonetic: String,
    val phoneticDtos: List<PhoneticDto>,
    val word: String
)