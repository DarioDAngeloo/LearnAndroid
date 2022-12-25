package com.example.learnandroiddevelopment.di

import android.content.Context
import com.example.learnandroiddevelopment.data.repository.DataStoreOperationsImpl
import com.example.learnandroiddevelopment.data.repository.Repository
import com.example.learnandroiddevelopment.data.use_cases.UseCases
import com.example.learnandroiddevelopment.data.use_cases.read_onboarding.ReadOnBoardingUseCase
import com.example.learnandroiddevelopment.data.use_cases.save_onboarding.SaveOnBoardingUseCase
import com.example.learnandroiddevelopment.domain.repository.DataStoreOperations
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDataStoreOperations( @ApplicationContext context: Context ): DataStoreOperations{
        return DataStoreOperationsImpl(context = context)
    }


    @Provides
    @Singleton
    fun provideUseCases(repository: Repository): UseCases {
        return UseCases(
            saveOnBoardingUseCase = SaveOnBoardingUseCase(repository),
            readOnBoardingUseCase = ReadOnBoardingUseCase(repository)
        )
    }

}