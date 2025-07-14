package com.example.testdagger.example2.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.testdagger.example2.di.ApplicationScope
import javax.inject.Inject
import javax.inject.Provider

class ViewModelFactory @Inject constructor(
    private val viewModelProviders: @JvmSuppressWildcards Map<Class<out ViewModel>, Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       return viewModelProviders[modelClass]?.get() as T
        /*if (modelClass == ExampleViewModel::class.java) {
            return ExampleViewModel(exampleUseCase) as T
        }
        if (modelClass == ExampleViewModel2::class.java) {
            return ExampleViewModel2(repository) as T
        }
        throw RuntimeException("Unknown view model class $modelClass")*/
    }
}