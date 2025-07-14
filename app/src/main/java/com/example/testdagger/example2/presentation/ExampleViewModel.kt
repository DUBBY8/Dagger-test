package com.example.testdagger.example2.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.testdagger.example2.di.IdQualifier
import com.example.testdagger.example2.di.NameQualifier
import com.example.testdagger.example2.domain.ExampleUseCase
import javax.inject.Inject

class ExampleViewModel @Inject constructor(
    private val useCase: ExampleUseCase,
    @IdQualifier private val id: String,
    @NameQualifier private val pole: String,
) : ViewModel() {

    fun method() {
        useCase()
        Log.d("ExampleViewModel", "$this  $id $pole")
    }
}