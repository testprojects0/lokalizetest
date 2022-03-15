package com.example.lokalizetest

import android.os.Bundle
import androidx.appcompat.widget.AppCompatTextView
import com.lokalise.sdk.LokaliseResources

class MainActivity : BaseActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		findViewById<AppCompatTextView>(R.id.tv_5).setText(R.string.cabinet)
		findViewById<AppCompatTextView>(R.id.tv_7).text = LokaliseResources(this).getString(R.string.cabinet)
	}
}