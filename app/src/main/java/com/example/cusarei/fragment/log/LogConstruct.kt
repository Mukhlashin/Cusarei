package com.example.cusarei.fragment.log

import com.example.cusarei.model.DataItemPembelian

interface LogConstruct {
    interface View{
        fun isFailure(msg : String)
        fun isSuccess(msg : String)
        fun goToDetail()
        fun showData(data: List<DataItemPembelian?>?)
    }

    interface Presenter{
        fun getAllLogData()
    }
}