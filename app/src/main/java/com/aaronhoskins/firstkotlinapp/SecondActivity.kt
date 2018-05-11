package com.aaronhoskins.firstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.tv_random_number
import java.util.*

class SecondActivity : AppCompatActivity() {

    companion object {
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        displayRandomNumber()
    }

    fun displayRandomNumber() {
        val random = Random();
        val passedValue = intent.getStringExtra(TOTAL_COUNT)
        val seedInt : Int = Integer.parseInt(passedValue)
        var randomInt : Int = 0
        if(seedInt > 0) {
            randomInt = random.nextInt(seedInt + 1)
        }
        tv_random_number.text = randomInt.toString()
    }
}
