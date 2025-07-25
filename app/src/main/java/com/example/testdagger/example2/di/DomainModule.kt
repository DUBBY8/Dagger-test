package com.example.testdagger.example2.di

import com.example.testdagger.example2.data.repository.ExampleRepositoryImpl
import com.example.testdagger.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DomainModule {

    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}