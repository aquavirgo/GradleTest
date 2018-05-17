package com.example.jguzikowski.gradletest

import android.test.ActivityInstrumentationTestCase2
import com.robotium.solo.Solo

class MainActivityRobotiumTest : ActivityInstrumentationTestCase2<MainActivity>(MainActivity::class.java) {

    val solo : Solo? = null;
    public override fun setUp(){

    }

    public fun testMyActivity(){
        solo?.assertCurrentActivity("MainActivity",MainActivity::class.java)
    }
}