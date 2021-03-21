package com.yashanand.stayfit.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.viewpager.widget.ViewPager
import com.yashanand.stayfit.R
import com.yashanand.stayfit.adapters.PagerViewAdapter

class DashboardActivity : AppCompatActivity() {


    private lateinit var homeBtn: ImageButton
    private lateinit var taskBtn: ImageButton
    private lateinit var chatBtn: ImageButton
    private lateinit var notificationBtn: ImageButton
    private lateinit var profileBtn: ImageButton

    private lateinit var mViewPager: ViewPager
    private lateinit var mPagerViewAdapter: PagerViewAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
        // init views
        mViewPager = findViewById(R.id.mViewPager)
        homeBtn = findViewById(R.id.homeBtn)
        taskBtn = findViewById(R.id.taskBtn)
        chatBtn = findViewById(R.id.chatBtn)
        notificationBtn = findViewById(R.id.notificationBtn)
        profileBtn = findViewById(R.id.profileBtn)


        //onclick listner

        homeBtn.setOnClickListener {
            mViewPager.currentItem = 0

        }

        taskBtn.setOnClickListener {

            mViewPager.currentItem = 1

        }

        chatBtn.setOnClickListener {
            mViewPager.currentItem = 2

        }

        notificationBtn.setOnClickListener {
            mViewPager.currentItem = 3

        }
        profileBtn.setOnClickListener {
            mViewPager.currentItem = 4

        }



        mPagerViewAdapter = PagerViewAdapter(supportFragmentManager)
        mViewPager.adapter = mPagerViewAdapter
        mViewPager.offscreenPageLimit = 5



        mViewPager.addOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
                changeTabs(position)
            }

            override fun onPageScrollStateChanged(state: Int) {}
        })




        mViewPager.currentItem = 0
        homeBtn.setImageResource(R.drawable.home_2)





    }

    private fun changeTabs(position: Int) {


        if (position == 0) {
            homeBtn.setImageResource(R.drawable.home_2)
            taskBtn.setImageResource(R.drawable.calendar_1)
            chatBtn.setImageResource(R.drawable.chat_1)
            notificationBtn.setImageResource(R.drawable.notification_1)
            profileBtn.setImageResource(R.drawable.profile_1)


        }
        if (position == 1) {
            homeBtn.setImageResource(R.drawable.home_1)
            taskBtn.setImageResource(R.drawable.calendar_2)
            chatBtn.setImageResource(R.drawable.chat_1)
            notificationBtn.setImageResource(R.drawable.notification_1)
            profileBtn.setImageResource(R.drawable.profile_1)



        }
        if (position == 2) {
            homeBtn.setImageResource(R.drawable.home_1)
            taskBtn.setImageResource(R.drawable.calendar_1)
            chatBtn.setImageResource(R.drawable.chat_2)
            notificationBtn.setImageResource(R.drawable.notification_1)
            profileBtn.setImageResource(R.drawable.profile_1)


        }
        if (position == 3) {
            homeBtn.setImageResource(R.drawable.home_1)
            taskBtn.setImageResource(R.drawable.calendar_1)
            chatBtn.setImageResource(R.drawable.chat_1)
            notificationBtn.setImageResource(R.drawable.notification_2)
            profileBtn.setImageResource(R.drawable.profile_1)


        }
        if (position == 4) {
            homeBtn.setImageResource(R.drawable.home_1)
            taskBtn.setImageResource(R.drawable.calendar_1)
            chatBtn.setImageResource(R.drawable.chat_1)
            notificationBtn.setImageResource(R.drawable.notification_1)
            profileBtn.setImageResource(R.drawable.profile_2)

        }


    }


}
