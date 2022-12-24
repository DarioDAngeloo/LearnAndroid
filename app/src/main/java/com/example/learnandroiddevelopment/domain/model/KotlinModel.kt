package com.example.learnandroiddevelopment.domain.model

import androidx.room.Entity
import com.example.learnandroiddevelopment.util.Constants.KOTLIN_DATABASE

@Entity(tableName = KOTLIN_DATABASE )
data class KotlinModel(
    val id: Int,
    val title: String,
    val image: String,
    val about: String,
    val tags : List<String>,
    val ranking: Int,
    val yearRelease: Int,
    val difficulty : String
)
