package com.pawan.sage.onlinedictionary.dictionary_details.data.remote.dto

data class DefinitionDto(
    val antonyms: List<String>,
    val definition: String,
    val example: String,
    val synonyms: List<Any>
)