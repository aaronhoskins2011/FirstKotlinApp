package com.aaronhoskins.firstkotlinapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.tv_click_counter_synth

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun displayToast(view : View) {
        val toastMessage = Toast.makeText(this, "Message Text", Toast.LENGTH_LONG)
        toastMessage.show()
    }

    fun countClicksHandler(view :View) {
        //Bind the view
        val counterTextView = findViewById<TextView>(R.id.tv_click_counter)
        //Get value from view
        val currentCounterValue = counterTextView.text.toString()
        var counterValueInt :Int = Integer.parseInt(currentCounterValue)
        counterValueInt++
        //refresh view value
        counterTextView.text = counterValueInt.toString()
    }

    fun countClicksHandlerSynth(view: View) {
        val currentCounterValue = tv_click_counter_synth.text.toString()
        var counterValueInt :Int = Integer.parseInt(currentCounterValue)
        counterValueInt++
        //refresh view value
        tv_click_counter_synth.text = counterValueInt.toString()
    }

    fun startSecondActivity(view : View) {
        val secondActivityIntent = Intent(this, SecondActivity::class.java)

        secondActivityIntent.putExtra(SecondActivity.TOTAL_COUNT, tv_click_counter_synth.text.toString())
        startActivity(secondActivityIntent)
    }


}
