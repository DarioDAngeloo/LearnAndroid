package com.example.learnandroiddevelopment.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.example.learnandroiddevelopment.data.local.dao.KotlinDao
import com.example.learnandroiddevelopment.data.local.dao.KotlinRemoteKeyDao
import com.example.learnandroiddevelopment.domain.model.KotlinModel
import com.example.learnandroiddevelopment.domain.model.KotlinRemoteKey

@Database(entities = [KotlinModel::class,KotlinRemoteKey::class], version = 1)
@TypeConverters(DatabaseConverter::class)
abstract class KotlinDatabase : RoomDatabase() {

    abstract fun kotlinDao(): KotlinDao
    abstract fun kotlinRemoteKey(): KotlinRemoteKeyDao

}
