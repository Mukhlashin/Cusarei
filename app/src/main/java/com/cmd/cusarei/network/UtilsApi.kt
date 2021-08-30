package com.cmd.cusarei.network

import com.cmd.cusarei.BuildConfig

object UtilsApi {

    // Mendeklarasikan Interface BaseApiService
    fun getAPIService(): BaseApiService? {
        return RetrofitClient.getClient(BuildConfig.BASE_URL)?.create(BaseApiService::class.java)
    }
}