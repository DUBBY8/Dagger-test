package com.example.testdagger.example2.presentation

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.testdagger.R
import com.example.testdagger.example2.ExampleApp
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    private val component by lazy {
        (application as ExampleApp).component
            .activityComponentFactory().create("String1", "Pole1")
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

        findViewById<TextView>(R.id.tvClick).setOnClickListener{
            Intent(this,MainActivity2::class.java).apply {
                startActivity(this)
            }
        }
    }
}