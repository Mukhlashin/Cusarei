package com.cmd.cusarei.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cmd.cusarei.R
import com.cmd.cusarei.model.DataItemHarga
import com.cmd.cusarei.model.DataItemPembelian
import kotlinx.android.synthetic.main.price_item.view.*

class PriceAdapter(
    private val items: List<DataItemHarga?>?,
    private val listener: (DataItemHarga) -> Unit
) : RecyclerView.Adapter<PriceAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(
                    R.layout.price_item,
                    parent,
                    false)
        )

    override fun getItemCount(): Int = items?.size!!

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        items?.get(position)?.let { holder.bindItem(it, listener)
        }
    }

    class ViewHolder(private val containerView : View) : RecyclerView.ViewHolder(containerView) {
        fun bindItem(items: DataItemHarga, listener: (DataItemHarga) -> Unit) {
            containerView.tv_nama.text = items.name
            containerView.tv_harga.text = items.price
            containerView.tv_harga_last.text = items.lastPrice
        }
    }
}