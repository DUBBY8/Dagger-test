package com.example.testdagger.example2.di

import android.content.Context
import com.example.testdagger.example2.data.network.ExampleApiService
import com.example.testdagger.example2.presentation.MainActivity
import com.example.testdagger.example2.presentation.MainActivity2
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {
    fun activityComponentFactory(): ActivityComponent.Factory

    //    fun getViewModel(): ExampleViewModel
//    fun getDatabase(): ExampleDatabase

    /*@Component.Builder
    interface ApplicationComponentBuilder {

        @BindsInstance
        fun context(context: Context): ApplicationComponentBuilder

        @BindsInstance
        fun time(time: Long): ApplicationComponentBuilder
        fun build(): ApplicationComponent
    }*/

    @Component.Factory
    interface ApplicationComponentFactory {
        fun create(@BindsInstance context: Context, @BindsInstance time: Long): ApplicationComponent
    }
}