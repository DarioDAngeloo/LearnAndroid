package com.example.learnandroiddevelopment.data.local.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.learnandroiddevelopment.domain.model.KotlinModel

@Dao
interface KotlinDao {

    @Query("SELECT * FROM kotlin_table ORDER BY id ASC")
    fun getAllKotlinInfo(): PagingSource<Int,KotlinModel>

    @Query("SELECT * FROM kotlin_table WHERE id=:kotlinInfoId")
    fun getSelectedKotlinInfo(kotlinInfoId: Int) : KotlinModel

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addKotlinInfo(kotlinInfo: List<KotlinModel>)

    @Query("DELETE FROM kotlin_table")
    suspend fun deleteAllKotlinInfo()

}