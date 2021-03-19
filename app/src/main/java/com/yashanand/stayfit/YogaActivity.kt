package com.yashanand.stayfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.yashanand.stayfit.adapters.YogaAdapter
import com.yashanand.stayfit.models.YogaItem
import kotlinx.android.synthetic.main.activity_yoga.*

class YogaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yoga)

        val yogaList = ArrayList<YogaItem>()

        yogaList.add(YogaItem(R.drawable.logo,"Title","9 mins"))
        yogaList.add(YogaItem(R.drawable.logo,"Title","9 mins"))
        yogaList.add(YogaItem(R.drawable.logo,"Title","9 mins"))
        yogaList.add(YogaItem(R.drawable.logo,"Title","9 mins"))

        val yogaAdapter = YogaAdapter(yogaList)

        recyler_view.layoutManager = LinearLayoutManager(this)
        recyler_view.adapter = yogaAdapter



    }

}


