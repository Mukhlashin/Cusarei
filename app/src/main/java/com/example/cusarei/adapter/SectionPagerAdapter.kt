package com.example.cusarei.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.cusarei.R
import com.example.cusarei.fragment.insert.InsertFragment
import com.example.cusarei.fragment.log.LogFragment

class SectionPagerAdapter(private val context: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val PAGE_TITLES = arrayOf(
        R.string.insert_data,
        R.string.log
    )

    val page = listOf(
        InsertFragment(),
        LogFragment()
    )

    override fun getItem(position: Int): Fragment {
        return page[position]
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return context.resources.getString(PAGE_TITLES[position])
    }
}