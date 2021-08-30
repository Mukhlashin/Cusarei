package com.cmd.cusarei.model

import com.google.gson.annotations.SerializedName

data class ResponsePembelian(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("data")
	val data: List<DataItemPembelian?>? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class DataItemPembelian(

	@field:SerializedName("kuantitas")
	val kuantitas: String? = null,

	@field:SerializedName("nama")
	val nama: String? = null,

	@field:SerializedName("harga")
	val harga: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("tanggal")
	val tanggal: String? = null,

	@field:SerializedName("diskon")
	val diskon: String? = null
)
