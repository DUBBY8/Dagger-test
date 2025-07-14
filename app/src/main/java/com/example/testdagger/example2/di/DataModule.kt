package com.example.testdagger.example2.di

import com.example.testdagger.example2.data.datasource.ExampleLocalDataSource
import com.example.testdagger.example2.data.datasource.ExampleLocalDataSourceImpl
import com.example.testdagger.example2.data.datasource.ExampleRemoteDataSource
import com.example.testdagger.example2.data.datasource.ExampleRemoteDataSourceImpl
import com.example.testdagger.example2.data.datasource.TestRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {
    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource
    @ApplicationScope
    @Binds
    @ProdQualifier
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
    @ApplicationScope
    @Binds
    @TestQualifier
    fun bindTestRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource
}