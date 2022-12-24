package com.example.learnandroiddevelopment.di

import android.content.Context
import androidx.room.Room
import com.example.learnandroiddevelopment.data.local.KotlinDatabase
import com.example.learnandroiddevelopment.util.Constants.KOTLIN_DATABASE
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) =
        Room.databaseBuilder(
            context,
            KotlinDatabase::class.java,
            KOTLIN_DATABASE
        ).build()

}