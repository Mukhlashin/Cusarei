package com.cmd.cusarei.fragment.price

import com.cmd.cusarei.model.DataItemHarga

interface PriceConstruct {
    interface View{
        fun isFailure(msg : String)
        fun isSuccess(msg : String)
        fun showData(data: List<DataItemHarga?>?)
    }

    interface Presenter{
        fun getAllPrice()
    }
}