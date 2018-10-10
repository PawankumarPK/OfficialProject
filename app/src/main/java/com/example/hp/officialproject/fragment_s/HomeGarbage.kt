package com.example.hp.officialproject.fragment_s

import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hp.officialproject.Dto.Home_garbage
import com.example.hp.officialproject.R
import com.example.hp.officialproject.activity_s.MainActivity
import com.example.hp.officialproject.adapter_s.GarbageRecyclerViewAdapter
import kotlinx.android.synthetic.main.fragment_garbage.*


/*
created by PAWAN KUMAR
*/


class HomeGarbage : BaseFragment() {

    private val homeGarbageList: ArrayList<Home_garbage> = ArrayList()
    private lateinit var adapter : GarbageRecyclerViewAdapter

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_garbage,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        homeFragment = activity as MainActivity

        mHomeRecycler.layoutManager = LinearLayoutManager(homeFragment,LinearLayoutManager.VERTICAL,false)
        adapter = GarbageRecyclerViewAdapter(homeFragment,homeGarbageList)
        mHomeRecycler.adapter = adapter

    }

    private fun homeGarbageArrayList(){

        val arrayList = resources.getStringArray(R.array.discount_off)
        for (i in 0..arrayList.lastIndex){
            homeGarbageList.add(arrayList[i])
        }
    }





}