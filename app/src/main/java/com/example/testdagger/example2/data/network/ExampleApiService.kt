package com.example.testdagger.example2.data.network

import android.content.Context
import android.util.Log
import com.example.testdagger.R
import javax.inject.Inject

class ExampleApiService @Inject constructor(
    private val context: Context,
    private val time: Long,
) {
    private fun millisecondsToDate(millis: Long): String = java.util.Date(millis).toString()

    fun method() {
        Log.d(
            LOG_TAG,
            "ExampleApiService ${context.getString(R.string.app_name)} ${millisecondsToDate(time)}"
        )
    }

    companion object {
        private const val LOG_TAG = "ExampleTAG"
    }
}
