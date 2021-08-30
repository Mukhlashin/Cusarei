package com.cmd.cusarei.fragment.price

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.cmd.cusarei.R
import com.cmd.cusarei.adapter.LogAdapter
import com.cmd.cusarei.adapter.PriceAdapter
import com.cmd.cusarei.fragment.log.LogPresenter
import com.cmd.cusarei.model.DataItemHarga
import kotlinx.android.synthetic.main.fragment_log.*

class PriceFragment : Fragment(), PriceConstruct.View {

    private val presenter: PricePresenter = PricePresenter(this)
    private lateinit var priceAdapter: PriceAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_price, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.getAllPrice()
    }

    override fun isFailure(msg: String) {
        progress_layout.visibility = View.GONE
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    override fun isSuccess(msg: String) {
        progress_layout.visibility = View.GONE
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    override fun showData(data: List<DataItemHarga?>?) {
        priceAdapter = PriceAdapter(data) {

        }
        rv_main.layoutManager = LinearLayoutManager(context)
        rv_main.adapter = priceAdapter
    }
}