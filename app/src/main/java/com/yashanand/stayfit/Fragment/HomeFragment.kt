package com.yashanand.stayfit.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yashanand.stayfit.R
import com.yashanand.stayfit.YogaActivity
import kotlinx.android.synthetic.main.fragment_home.view.*


class HomeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val views =inflater.inflate(R.layout.fragment_home, container, false)

        views.yoga.setOnClickListener {

            val intent = Intent(activity, YogaActivity::class.java)
            startActivity(intent)
        }

        return views
    }



}