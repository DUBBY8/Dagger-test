package com.example.testdagger.example2.di

import android.content.Context
import com.example.testdagger.example2.presentation.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [DataModule::class, DomainModule::class])
interface ApplicationComponent {
    fun inject(activity: MainActivity)

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