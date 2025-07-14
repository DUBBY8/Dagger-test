package com.example.testdagger.example2.di

import com.example.testdagger.example2.data.network.ExampleApiService
import com.example.testdagger.example2.presentation.MainActivity
import com.example.testdagger.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(modules = [ViewModelModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
    fun inject(activity: MainActivity2)
    fun getApiService(): ExampleApiService

    @Subcomponent.Factory
    interface Factory {
        fun create(
            @BindsInstance @IdQualifier id: String,
            @BindsInstance @NameQualifier pole: String
        ): ActivityComponent
    }
}