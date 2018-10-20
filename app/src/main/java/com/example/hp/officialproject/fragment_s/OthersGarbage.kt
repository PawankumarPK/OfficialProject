package com.example.hp.officialproject.fragment_s

import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hp.officialproject.Dto.Dto_Home_garbage
import com.example.hp.officialproject.R
import com.example.hp.officialproject.adapter_s.OtherGarbageViewAdapter
import kotlinx.android.synthetic.main.fragment_others.*


/*
created by PAWAN KUMAR
*/


class OthersGarbage : BaseFragment() {

    private lateinit var adapter: OtherGarbageViewAdapter
    private val wasteGarbageList : ArrayList<Dto_Home_garbage> = ArrayList()


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_others,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mOtherRecyclerview.layoutManager = LinearLayoutManager(homeFragment, LinearLayoutManager.VERTICAL, false)
        adapter = OtherGarbageViewAdapter(homeFragment,wasteGarbageList)
        mOtherRecyclerview.adapter = adapter
        wasteGarbageArrayList()
    }

    private fun wasteGarbageArrayList(){

        wasteGarbageList.add(Dto_Home_garbage(BitmapFactory.decodeResource(resources,R.drawable.plastic_garbage),"OFF UPTO 60%","This is first garbage","Garbege is more usefulll"))
        wasteGarbageList.add(Dto_Home_garbage(BitmapFactory.decodeResource(resources,R.drawable.plastic_garbage),"OFF UPTO 60%","This is first garbage","Garbege is more usefulll"))
        wasteGarbageList.add(Dto_Home_garbage(BitmapFactory.decodeResource(resources,R.drawable.plastic_garbage),"OFF UPTO 60%","This is first garbage","Garbege is more usefulll"))
        wasteGarbageList.add(Dto_Home_garbage(BitmapFactory.decodeResource(resources,R.drawable.plastic_garbage),"OFF UPTO 60%","This is first garbage","Garbege is more usefulll"))


        //working on Project
    }
}