package com.cmd.cusarei.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cmd.cusarei.R
import com.cmd.cusarei.model.DataItemPembelian
import kotlinx.android.synthetic.main.fragment_insert.view.*
import kotlinx.android.synthetic.main.log_item.view.*

class LogAdapter(
    private val items: List<DataItemPembelian?>?,
    private val listener: (DataItemPembelian) -> Unit
) : RecyclerView.Adapter<LogAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder =
        ViewHolder(
            LayoutInflater
                .from(parent.context)
                .inflate(
                    R.layout.log_item,
                    parent,
                    false
                )
        )

    override fun getItemCount(): Int = items?.size!!

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        items?.get(position)?.let { holder.bindItem(it, listener)
        }
    }

    class ViewHolder(private val containerView : View) : RecyclerView.ViewHolder(containerView) {
        fun bindItem(items: DataItemPembelian, listener: (DataItemPembelian) -> Unit) {
            containerView.tv_tanggal.text = items.tanggal
            containerView.tv_nama.text = items.nama
            containerView.tv_kuantitas.text = items.kuantitas
            containerView.tv_diskon.text = items.diskon
        }
    }
}