package com.example.hp.officialproject.fragment_s

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.hp.officialproject.R
import kotlinx.android.synthetic.main.fragment_home.*


/*
created by PAWAN KUMAR
*/


class HomeFragment : BaseFragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mGarbageRelativeLayout.setOnClickListener { onClickHomeGarbage() }
        mWasteRelativeLayout.setOnClickListener { onClickWasteGarbage() }
        mOtherRelativeLayout.setOnClickListener { onClickOtheromeGarbage() }
    }

    private fun onClickHomeGarbage() {
        fragmentManager!!.beginTransaction().addToBackStack(null).replace(R.id.container_frame, HomeGarbage()).commit()
    }

    private fun onClickWasteGarbage() {
        fragmentManager!!.beginTransaction().addToBackStack(null).replace(R.id.container_frame, WasteGarbage()).commit()
    }

    private fun onClickOtheromeGarbage() {
        fragmentManager!!.beginTransaction().addToBackStack(null).replace(R.id.container_frame, OthersGarbage()).commit()
    }
}