package com.zarinpal.test.di

import android.content.Context
import com.zarinpal.test.data.datasource.local.AppDb
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RoomModule {

    @Singleton
    @Provides
    fun provideAppDatabase(@ApplicationContext context: Context) = AppDb.getDatabase(context)

    @Provides
    fun provideAppDAO(db: AppDb) = db.appDao()
}