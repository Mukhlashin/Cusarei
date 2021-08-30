package com.cmd.cusarei.fragment.insert

interface InsertConstruct {
    interface View{
        fun showLoading()
        fun hideLoading()
        fun onFailure(msg : String)
        fun onSuccess(msg : String)
    }
    interface Presenter {
        fun pushData(tanggal : String, nama : String, kuantitas : String, harga : String, diskon : String)
    }
}