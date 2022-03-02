package com.example.lokalizetest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatTextView
import com.lokalise.sdk.LokaliseResources

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		findViewById<AppCompatTextView>(R.id.tv_1).setText(R.string.app_name)
		findViewById<AppCompatTextView>(R.id.tv_2).setText(R.string.hello_world)
		findViewById<AppCompatTextView>(R.id.tv_3).text = LokaliseResources(this).getString(R.string.cabinet)
		findViewById<AppCompatTextView>(R.id.tv_4).setText(R.string.cabinet)
	}
}