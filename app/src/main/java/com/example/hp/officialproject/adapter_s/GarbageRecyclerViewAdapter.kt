package com.example.hp.officialproject.adapter_s

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hp.officialproject.Dto.Dto_Home_garbage
import com.example.hp.officialproject.R
import kotlinx.android.synthetic.main.home_garbage_view_holder.view.*


/*
created by PAWAN KUMAR
*/


class GarbageRecyclerViewAdapter(private val context: Context, private val list: ArrayList<Dto_Home_garbage>,private val itemClickCardview :onHomeGarbageCardViewClick ) : RecyclerView.Adapter<GarbageRecyclerViewAdapter.viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
      return viewHolder(LayoutInflater.from(context).inflate(R.layout.home_garbage_view_holder,parent,false))
    }

    override fun getItemCount(): Int {

        return list.size

    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        holder.bindItems(list[position])
    }

    interface onHomeGarbageCardViewClick{
        fun onItemClick(pos : Dto_Home_garbage)
    }

    inner class viewHolder(view: View): RecyclerView.ViewHolder(view) {

        fun bindItems(data : Dto_Home_garbage){

            itemView.mHomeImageView.setImageBitmap(data.dtoImage)
            itemView.mHomeOffTextview.text = data.dtoTextviewForOff
            itemView.mHomeItemsTextView.text = data.dtoTextViewItems
            itemView.mHomeItemsDescTextView.text = data.dtoTextviewDecription

            itemView.mCardViewHomeGarbage.setOnClickListener { itemClick(data) }

        }
        private fun itemClick(pos: Dto_Home_garbage){
             itemClickCardview.onItemClick(pos)
        }

    }
}

//http://androidtechpoint.blogspot.com/2017/09/android-recycler-view-example-with-kotlin.html