package com.example.lokalizetest

import android.content.Context
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import androidx.appcompat.widget.Toolbar
import com.lokalise.sdk.LokaliseContextWrapper
import com.lokalise.sdk.LokaliseResources

open class BaseActivity : AppCompatActivity() {

	private lateinit var toolbar: Toolbar

	override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
		super.onCreate(savedInstanceState, persistentState)
		toolbar = findViewById(R.id.toolbar)
	}

	override fun attachBaseContext(newBase: Context) {
		super.attachBaseContext(LokaliseContextWrapper.wrap(newBase))
	}

	override fun onCreateOptionsMenu(menu: Menu?): Boolean {
		(resources as LokaliseResources).translateToolbarItems(toolbar)
		return true
	}
}