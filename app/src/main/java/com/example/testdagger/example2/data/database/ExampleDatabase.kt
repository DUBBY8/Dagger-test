package com.example.testdagger.example2.data.database

import android.content.Context
import android.util.Log
import com.example.testdagger.R
import com.example.testdagger.example2.di.ApplicationScope
import javax.inject.Inject

class ExampleDatabase @Inject constructor(
    private val context: Context,
    private val time: Long,
) {
    private fun millisecondsToDate(millis: Long): String = java.util.Date(millis).toString()

    fun method() {
        Log.d(LOG_TAG, "ExampleDatabase ${context.getString(R.string.app_name)} ${millisecondsToDate(time)} $this")
    }

    companion object {
        private const val LOG_TAG = "ExampleTAG"
    }
}
