package com.example.hp.officialproject.fragment_s

import android.os.Bundle
import android.support.v4.app.Fragment
import com.example.hp.officialproject.activity_s.MainActivity


/*
created by PAWAN KUMAR
*/


abstract class BaseFragment : Fragment() {

     lateinit var homeFragment: MainActivity
    //base fragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        homeFragment = activity as MainActivity
    }
}