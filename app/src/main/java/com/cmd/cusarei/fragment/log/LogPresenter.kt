package com.cmd.cusarei.fragment.log

import com.cmd.cusarei.model.ResponsePembelian
import com.cmd.cusarei.network.BaseApiService
import com.cmd.cusarei.network.UtilsApi
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class LogPresenter(val view: LogConstruct.View) : LogConstruct.Presenter {

    var mApiService: BaseApiService = UtilsApi.getAPIService()!!

    override fun getAllLogData() {
        mApiService.getAllData()
            .enqueue(object : Callback<ResponsePembelian>{
                override fun onFailure(call: Call<ResponsePembelian>, t: Throwable) {
                    view.isFailure(t.localizedMessage)
                }

                override fun onResponse(
                    call: Call<ResponsePembelian>,
                    response: Response<ResponsePembelian>
                ) {
                    view.isSuccess(response.message())
                    view.showData(response.body()?.data)
                }
            })
    }
}