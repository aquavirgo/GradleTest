package com.example.jguzikowski.gradletest

import android.support.test.InstrumentationRegistry
import android.support.test.filters.MediumTest
import android.support.test.runner.AndroidJUnit4
import android.test.ActivityInstrumentationTestCase2
import com.example.jguzikowski.gradletest.R.id.text
import junit.framework.Assert
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith


@MediumTest
@RunWith(AndroidJUnit4::class)
class MainActivityTest : ActivityInstrumentationTestCase2<MainActivity>(MainActivity::class.java) {
    @Before
    public override fun setUp(){
        super.setUp()
        injectInstrumentation(InstrumentationRegistry.getInstrumentation())
      //  val activity = activity;


    }

    @After
    public override fun tearDown(){
       super.tearDown()
    }

    @Test
    public fun testPrecondition(){
        Assert.assertNotNull("Activity is null", activity)
    }

    @Test
    public fun textView_Label(){
        Assert.assertEquals("2131165310",text.toString())
    }

}