package com.example.coroutines.data.network

import com.example.coroutines.data.network.model.Quote
import retrofit2.Response
import retrofit2.http.GET

interface QuoteApi {

    @GET("/random")
    suspend fun getQuote(): Response<Quote>

}
