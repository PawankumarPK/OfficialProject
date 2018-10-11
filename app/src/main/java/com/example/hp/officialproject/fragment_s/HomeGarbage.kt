package com.example.hp.officialproject.fragment_s

import android.graphics.BitmapFactory
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hp.officialproject.Dto.Dto_Home_garbage
import com.example.hp.officialproject.R
import com.example.hp.officialproject.activity_s.MainActivity
import com.example.hp.officialproject.adapter_s.GarbageRecyclerViewAdapter
import kotlinx.android.synthetic.main.fragment_garbage.*
import java.util.*


/*
created by PAWAN KUMAR
*/


class HomeGarbage : BaseFragment() {

    private val homeGarbageList: ArrayList<Dto_Home_garbage> = ArrayList()
    private lateinit var adapter : GarbageRecyclerViewAdapter

    companion object {
        var position = 0
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_garbage,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        homeFragment = activity as MainActivity

        mHomeRecycler.layoutManager = LinearLayoutManager(homeFragment,LinearLayoutManager.VERTICAL,false)
        adapter = GarbageRecyclerViewAdapter(homeFragment,homeGarbageList,onGarbageClick )
        mHomeRecycler.adapter = adapter

        itemsArrayList()

    }

    private fun itemsArrayList(){
        homeGarbageList.add(Dto_Home_garbage(BitmapFactory.decodeResource(resources,R.drawable.other_garbage),"UP TO 10% OFF","Home and Kitchen","Dog supplies,Cat Supplies"))
        homeGarbageList.add(Dto_Home_garbage(BitmapFactory.decodeResource(resources,R.drawable.home_garbage),"UP TO 20% OFF","Beverages","Dog supplies,Cat Supplies"))
        homeGarbageList.add(Dto_Home_garbage(BitmapFactory.decodeResource(resources,R.drawable.plastic_garbage),"UP TO 30% OFF","Household needs","Dog supplies,Cat Supplies"))
        homeGarbageList.add(Dto_Home_garbage(BitmapFactory.decodeResource(resources,R.drawable.other_garbage),"UP TO 40% OFF","Personal Care","Dog supplies,Cat Supplies"))
        homeGarbageList.add(Dto_Home_garbage(BitmapFactory.decodeResource(resources,R.drawable.plastic_garbage),"UP TO 50% OFF","Breakfast &amp; Diary","Dog supplies,Cat Supplies"))
        homeGarbageList.add(Dto_Home_garbage(BitmapFactory.decodeResource(resources,R.drawable.home_garbage),"UP TO 60% OFF","Biscuit, Snacks &amp; Chocos","Dog supplies,Cat Supplies"))
        homeGarbageList.add(Dto_Home_garbage(BitmapFactory.decodeResource(resources,R.drawable.other_garbage),"UP TO 70% OFF","Baby &amp; Kids","Dog supplies,Cat Supplies"))
        homeGarbageList.add(Dto_Home_garbage(BitmapFactory.decodeResource(resources,R.drawable.plastic_garbage),"UP TO 80% OFF","Pet Care","Dog supplies,Cat Supplies"))
        homeGarbageList.add(Dto_Home_garbage(BitmapFactory.decodeResource(resources,R.drawable.other_garbage),"UP TO 90% OFF","Frozen Food","Dog supplies,Cat Supplies"))
        homeGarbageList.add(Dto_Home_garbage(BitmapFactory.decodeResource(resources,R.drawable.home_garbage),"UP TO 100% OFF","Vegetable &amp; Fruits","Dog supplies,Cat Supplies"))


    }

    private val onGarbageClick = object : GarbageRecyclerViewAdapter.onHomeGarbageCardViewClick{
        override fun onItemClick(pos: Dto_Home_garbage) {
            position = pos
        }


    }

}