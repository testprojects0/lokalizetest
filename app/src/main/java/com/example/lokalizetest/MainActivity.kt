package com.example.lokalizetest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.AppCompatTextView
import com.lokalise.sdk.LokaliseResources

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		findViewById<AppCompatTextView>(R.id.tv_5).setText(R.string.cabinet)
		findViewById<AppCompatTextView>(R.id.tv_7).text = LokaliseResources(this).getString(R.string.cabinet)
	}
}