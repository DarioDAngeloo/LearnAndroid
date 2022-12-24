package com.example.learnandroiddevelopment.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.learnandroiddevelopment.domain.model.KotlinRemoteKey

@Dao
interface KotlinRemoteKeyDao {

    @Query("SELECT * FROM kotlin_remote_key_table WHERE id=:id")
    suspend fun getRemoteKey(id:Int): KotlinRemoteKey?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addAllRemoteKeys(kotlinRemoteKeys: List<KotlinRemoteKey>)
    @Query("DELETE FROM kotlin_remote_key_table")
    suspend fun deleteAllRemoteKeys()

}
