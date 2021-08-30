package com.cmd.cusarei.fragment.price

import com.cmd.cusarei.model.ResponseHarga
import com.cmd.cusarei.network.BaseApiService
import com.cmd.cusarei.network.UtilsApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class PricePresenter(val view: PriceConstruct.View) : PriceConstruct.Presenter {

    var mApiService: BaseApiService = UtilsApi.getAPIService()!!

    override fun getAllPrice() {
        mApiService.getAllHarga()
            .enqueue(object : Callback<ResponseHarga>{
                override fun onResponse(
                    call: Call<ResponseHarga>,
                    response: Response<ResponseHarga>
                ) {
                    view.isSuccess(response.message())
                    view.showData(response.body()?.data)
                }

                override fun onFailure(call: Call<ResponseHarga>, t: Throwable) {
                    view.isFailure(t.localizedMessage)
                }

            })
    }
}