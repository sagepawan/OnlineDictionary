package com.pawan.sage.onlinedictionary.dictionary_details.domain.model

data class WordInfo (
    val meanings: List<Meaning>,
    val origin: String,
    val phonetic: String,
    val word: String
)