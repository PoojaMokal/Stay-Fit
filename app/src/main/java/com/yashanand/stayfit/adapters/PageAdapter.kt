package com.yashanand.stayfit.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.yashanand.stayfit.Fragment.ChatFragment
import com.yashanand.stayfit.Fragment.HomeFragment
import com.yashanand.stayfit.Fragment.NotificationFragment
import com.yashanand.stayfit.Fragment.TaskFragment

internal class PagerViewAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                HomeFragment()
            }
            1 -> {
                TaskFragment()
            }
            2 -> {
                ChatFragment()
            }3 -> {
                NotificationFragment()
            }
            else -> HomeFragment()
        }
    }

    override fun getCount(): Int {

        return 4
    }

}
