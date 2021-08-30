package com.cmd.cusarei.fragment.log

import com.cmd.cusarei.model.DataItemPembelian

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