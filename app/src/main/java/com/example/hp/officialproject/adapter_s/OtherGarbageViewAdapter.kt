package com.example.hp.officialproject.adapter_s

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hp.officialproject.Dto.Dto_Home_garbage
import com.example.hp.officialproject.R
import kotlinx.android.synthetic.main.waste_garbage_view_holder.view.*


/*
created by PAWAN KUMAR
*/


class OtherGarbageViewAdapter(private val context: Context, private val list : ArrayList<Dto_Home_garbage>) : RecyclerView.Adapter<OtherGarbageViewAdapter.viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(LayoutInflater.from(context).inflate(R.layout.waste_garbage_view_holder,parent,false))

    }

    override fun getItemCount(): Int {

        return list.size
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        holder.bindItems(list[position])
    }

    inner class viewHolder(view : View): RecyclerView.ViewHolder(view) {

        fun bindItems(data : Dto_Home_garbage){

            itemView.mWasteImageView.setImageBitmap(data.dtoImage)
            itemView.mWasteOffTextview.text = data.dtoTextviewForOff
            itemView.mWasteItemsTextView.text = data.dtoTextViewItems
            itemView.mWasteItemsDescTextView.text = data.dtoTextviewDecription

        }
    }
}