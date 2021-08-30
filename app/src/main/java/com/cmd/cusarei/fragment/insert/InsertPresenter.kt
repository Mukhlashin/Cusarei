package com.cmd.cusarei.fragment.insert

import com.cmd.cusarei.model.DataItemPembelian
import com.cmd.cusarei.network.BaseApiService
import com.cmd.cusarei.network.UtilsApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class InsertPresenter(val view: InsertConstruct.View) : InsertConstruct.Presenter {

    var mApiService: BaseApiService = UtilsApi.getAPIService()!!

    override fun pushData(tanggal : String, nama: String, kuantitas: String, harga: String, diskon: String) {
        mApiService.pushDataRequest(tanggal, nama, kuantitas, harga, diskon)
            .enqueue(object : Callback<DataItemPembelian>{
                override fun onFailure(call: Call<DataItemPembelian>, t: Throwable) {
                    view.onFailure(t.localizedMessage)
                    view.hideLoading()
                }

                override fun onResponse(
                    call: Call<DataItemPembelian>,
                    response: Response<DataItemPembelian>
                ) {
                    view.onSuccess(response.message())
                    view.hideLoading()
                }

            })
    }
}