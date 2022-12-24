package com.example.learnandroiddevelopment.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.learnandroiddevelopment.util.Constants.KOTLIN_TABLE

@Entity(tableName = KOTLIN_TABLE )
data class KotlinModel(
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val title: String,
    val image: String,
    val about: String,
    val tags : List<String>,
    val ranking: Int,
    val yearRelease: Int,
    val difficulty : String
)
