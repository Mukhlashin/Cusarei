package com.example.cusarei.network

import com.example.cusarei.model.DataItemPembelian
import com.example.cusarei.model.ResponsePembelian
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface BaseApiService {

    @GET("pembelian_get_all.php")
    fun getAllData() : Call<ResponsePembelian>

    @FormUrlEncoded
    @POST("insert_pembelian.php")
    fun pushDataRequest(
        @Field("date") tanggal: String?,
        @Field("name") nama: String?,
        @Field("qty") kuantitas: String?,
        @Field("price") harga: String?,
        @Field("discount") diskon: String?
    ): Call<DataItemPembelian>
}