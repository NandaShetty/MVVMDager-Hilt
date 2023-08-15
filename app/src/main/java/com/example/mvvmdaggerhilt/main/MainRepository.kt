package com.example.mvvmdaggerhilt.main

import com.example.mvvmdaggerhilt.data.model.CurrencyResponse
import com.example.mvvmdaggerhilt.util.Resource


interface MainRepository {

    suspend fun getRates(base: String): Resource<CurrencyResponse>
}
