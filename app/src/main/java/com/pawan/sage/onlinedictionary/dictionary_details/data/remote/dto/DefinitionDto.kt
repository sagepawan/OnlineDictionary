package com.pawan.sage.onlinedictionary.dictionary_details.data.remote.dto

import com.pawan.sage.onlinedictionary.dictionary_details.domain.model.Definition

data class DefinitionDto(
    val antonyms: List<String>,
    val definition: String,
    val example: String,
    val synonyms: List<String>
) {
    //creating mapping function for local db
    fun toDefinition():Definition {
        return Definition(
            antonyms = antonyms,
            definition = definition,
            example = example,
            synonyms = synonyms
        )
    }
}