package com.example.learnandroiddevelopment.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.learnandroiddevelopment.util.Constants.KOTLIN_REMOTE_KEY_DATABASE

@Entity(tableName = KOTLIN_REMOTE_KEY_DATABASE)
data class KotlinRemoteKey(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val prevPage: Int?,
    val nextPAge: Int?
)
