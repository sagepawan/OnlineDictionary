package com.pawan.sage.onlinedictionary.dictionary_details.data.remote

import com.pawan.sage.onlinedictionary.dictionary_details.data.remote.dto.WordDetailDto
import retrofit2.http.GET
import retrofit2.http.Path

interface DictionaryAPI {

    @GET("/api/v2/entries/en/{word}")
    suspend fun getWordMeaning(
        @Path("word") word : String
    ): List<WordDetailDto>
}