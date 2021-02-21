package com.example.cusarei.fragment.log

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.cusarei.R
import com.example.cusarei.adapter.LogAdapter
import com.example.cusarei.model.DataItemPembelian
import com.example.cusarei.model.ResponsePembelian
import kotlinx.android.synthetic.main.fragment_log.*

/**
 * A simple [Fragment] subclass.
 */
class LogFragment : Fragment(), LogConstruct.View {

    private val presenter: LogPresenter = LogPresenter(this)
    private lateinit var logAdapter: LogAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_log, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        presenter.getAllLogData()
    }

    override fun isFailure(msg: String) {
        progress_layout.visibility = View.GONE
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    override fun isSuccess(msg: String) {
        progress_layout.visibility = View.GONE
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    override fun showData(data: List<DataItemPembelian?>?) {
        logAdapter = LogAdapter(data) {

        }
        rv_main.layoutManager = LinearLayoutManager(context)
        rv_main.adapter = logAdapter
    }

    override fun goToDetail() {
        TODO("Not yet implemented")
    }
}
