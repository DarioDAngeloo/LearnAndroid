package com.example.learnandroiddevelopment.data.repository

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.emptyPreferences
import androidx.datastore.preferences.preferencesDataStore
import com.example.learnandroiddevelopment.domain.repository.DataStoreOperations
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.map
import java.io.IOException


val Context.dataStore: DataStore<Preferences> by preferencesDataStore("kotlinInfo_preferences")



class DataStoreOperationsImpl(context: Context): DataStoreOperations {


    private object PreferencesKeys {
        val onBoardingKEy = booleanPreferencesKey("on_boarding_completed")
    }

    private val dataStore = context.dataStore

    override suspend fun saveOnBoardingState(completed: Boolean) {
        dataStore.edit {
            preferences -> preferences[PreferencesKeys.onBoardingKEy] = completed
        }
    }

    override fun readOnBoardingState(): Flow<Boolean> {
        return dataStore.data
            .catch { error ->
                if (error is IOException){
                    emit(emptyPreferences())
                } else{
                    throw error
                }
            } .map {
                preferences -> val onBoardingState = preferences[PreferencesKeys.onBoardingKEy] ?: false
                onBoardingState
            }
    }
}