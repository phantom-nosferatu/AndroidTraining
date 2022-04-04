package com.example.coroutines.data.network

import com.example.coroutines.data.network.model.Quote
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch
import retrofit2.Response


class QuoteRepository {

    suspend fun getQuote(): Response<Quote> {

        return RetrofitInstance.api.getQuote()
    }

}