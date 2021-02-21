package com.example.cusarei

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.cusarei.adapter.SectionPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sectionPagerAdapter = SectionPagerAdapter(this, supportFragmentManager)
        vp_main.adapter = sectionPagerAdapter
        tab_detail.setupWithViewPager(vp_main)
    }
}
