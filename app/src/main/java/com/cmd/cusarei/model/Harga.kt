package com.cmd.cusarei.model

import com.google.gson.annotations.SerializedName

data class ResponseHarga(

	@field:SerializedName("msg")
	val msg: String? = null,

	@field:SerializedName("data")
	val data: List<DataItemHarga?>? = null,

	@field:SerializedName("status")
	val status: String? = null
)

data class DataItemHarga(

	@field:SerializedName("price")
	val price: String? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: String? = null,

	@field:SerializedName("last_price")
	val lastPrice: String? = null
)
