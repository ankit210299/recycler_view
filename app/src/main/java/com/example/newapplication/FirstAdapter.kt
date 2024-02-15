package com.example.newapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class FirstAdapter(var mList: List<ViewInfo>, var context: Context) :
    RecyclerView.Adapter<FirstAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)

    }

    override fun getItemCount(): Int {
        return mList.size
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val dataList = mList[position]
        holder.first_txt?.text = dataList.txt
        holder.img?.let { Glide.with(context).load(dataList.imag).centerCrop().into(it) }
        holder.itemView.setOnClickListener {
            Toast.makeText(context, "" + dataList.txt, Toast.LENGTH_SHORT).show()
        }
    }

    class MyViewHolder(item: View) : RecyclerView.ViewHolder(item) {
        var first_txt: TextView? = item.findViewById(R.id.first_txt)
        var img: ImageView? = item.findViewById(R.id.img_info)

    }
}


