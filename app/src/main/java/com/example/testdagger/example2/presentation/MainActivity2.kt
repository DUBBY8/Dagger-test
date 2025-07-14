package com.example.testdagger.example2.presentation

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.testdagger.R
import com.example.testdagger.example2.ExampleApp
import javax.inject.Inject

class MainActivity2 : AppCompatActivity() {

    private val component by lazy {
        (application as ExampleApp).component
            .activityComponentFactory().create("String2", "Pole2")
    }

    @Inject
    lateinit var viewModelFactory: ViewModelFactory

    private val viewModel: ExampleViewModel by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel::class.java]
    }

    private val viewModel2: ExampleViewModel2 by lazy {
        ViewModelProvider(this, viewModelFactory)[ExampleViewModel2::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("MainActivityTag", "${component.getApiService()}")
        viewModel.method()
        viewModel2.method()
    }
}