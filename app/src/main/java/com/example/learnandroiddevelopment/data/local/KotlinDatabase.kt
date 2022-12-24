package com.example.learnandroiddevelopment.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.learnandroiddevelopment.data.local.dao.KotlinDao
import com.example.learnandroiddevelopment.domain.model.KotlinModel

@Database(entities = [KotlinModel::class], version = 1)
abstract class KotlinDatabase: RoomDatabase() {
    abstract fun kotlinDao(): KotlinDao
}