package com.example.cusarei.fragment.insert

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.cusarei.R
import kotlinx.android.synthetic.main.fragment_insert.*
import kotlinx.android.synthetic.main.fragment_insert.view.*
import kotlinx.android.synthetic.main.fragment_log.*
import kotlinx.android.synthetic.main.fragment_log.progress_layout
import java.text.SimpleDateFormat
import java.util.*

/**
 * A simple [Fragment] subclass.
 */
class InsertFragment : Fragment(), InsertConstruct.View {

    private val presenter: InsertPresenter = InsertPresenter(this)

    private lateinit var nama : String
    private lateinit var kuantitas : String
    private lateinit var harga : String
    private lateinit var diskon : String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_insert, container, false)
        var currentDate: String = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Date())

        view.btn_kirim.setOnClickListener {
            nama = edt_nama.text.toString()
            kuantitas = edt_kuantitas.text.toString()
            harga = edt_harga.text.toString()
            diskon = edt_diskon.text.toString()
            showLoading()
            presenter.pushData(currentDate, nama, kuantitas, harga, diskon)
        }
        return view
    }

    override fun showLoading() {
        progress_layout.visibility = View.VISIBLE
    }

    override fun hideLoading() {
        progress_layout.visibility = View.GONE
    }

    override fun onFailure(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

    override fun onSuccess(msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
    }

}
