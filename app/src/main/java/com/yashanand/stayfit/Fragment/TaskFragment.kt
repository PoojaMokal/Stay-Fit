package com.yashanand.stayfit.Fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.yashanand.stayfit.BmiCalculatorActivity
import com.yashanand.stayfit.R
import kotlinx.android.synthetic.main.fragment_task.view.*

class TaskFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val views =inflater.inflate(R.layout.fragment_task, container, false)

        views.bmi_calculator.setOnClickListener {

            val intent = Intent(activity, BmiCalculatorActivity::class.java)
            startActivity(intent)
        }

        return views
    }


}
