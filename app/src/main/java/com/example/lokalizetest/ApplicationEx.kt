package com.example.lokalizetest

import android.app.Application
import com.lokalise.sdk.Lokalise

class ApplicationEx : Application() {

	override fun onCreate() {
		super.onCreate()
		Lokalise.init(this, SDK_TOKEN, PROJECT_ID)
		Lokalise.isPreRelease = true
		Lokalise.updateTranslations() //получение последних переводов (можно вызывать где угодно)
	}

	companion object {
		private const val SDK_TOKEN = "126c041e1d74355e5f8674b4f92c4a7de03741d9"
		private const val PROJECT_ID = "83086131621f692de6d747.58685353"
	}
}