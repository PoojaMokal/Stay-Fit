package com.yashanand.stayfit.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.yashanand.stayfit.R
import com.yashanand.stayfit.models.YogaItem

class YogaAdapter( val yogaList: List<YogaItem>) : RecyclerView.Adapter<YogaAdapter.YogaViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): YogaViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.exercise_item,parent,false)
        return YogaViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: YogaViewHolder, position: Int) {
        val currentItem = yogaList[position]

        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2


    }

    override fun getItemCount() = yogaList.size

    class YogaViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.findViewById(R.id.image_view)
        val textView1 : TextView = itemView.findViewById(R.id.textview_1)
        val textView2 : TextView = itemView.findViewById(R.id.textview_2)
    }

}