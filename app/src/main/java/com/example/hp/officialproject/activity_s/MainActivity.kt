package com.example.hp.officialproject.activity_s

import android.content.Context
import android.os.Bundle
import android.support.design.internal.NavigationMenuView
import android.support.design.widget.NavigationView
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.widget.DividerItemDecoration
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.example.hp.officialproject.R
import com.example.hp.officialproject.fragment_s.HomeFragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.app_bar_navigation_drawer.*

class MainActivity : BaseActivity(), NavigationView.OnNavigationItemSelectedListener {
    lateinit var inputManager: InputMethodManager

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
        }
        return true
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputManager = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        val toggle = ActionBarDrawerToggle(
                this, drawer_layout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer_layout.addDrawerListener(toggle)
        toggle.syncState()
        nav_view.setNavigationItemSelectedListener(this)
        val navMenuView = nav_view.getChildAt(0) as NavigationMenuView
        navMenuView.addItemDecoration(DividerItemDecoration(this, DividerItemDecoration.VERTICAL))
        supportFragmentManager.beginTransaction().replace(R.id.container_frame, HomeFragment(), "FragmentMain").commit()
        //logout.setOnClickListener { exitApp(true) }

        drawer_layout.addDrawerListener(drawerListener)
    }


    private val drawerListener = object : DrawerLayout.DrawerListener {
        override fun onDrawerStateChanged(newState: Int) {
            if (inputManager.isActive)
                hideKeyboard()
        }

        override fun onDrawerSlide(drawerView: View, slideOffset: Float) {

        }

        override fun onDrawerClosed(drawerView: View) {

        }

        override fun onDrawerOpened(drawerView: View) {

        }
    }

    fun hideKeyboard() {
        inputManager.hideSoftInputFromWindow(drawer_layout.windowToken, 0)
    }


}
