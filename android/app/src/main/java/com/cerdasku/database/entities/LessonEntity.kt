package com.cerdasku.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "lessons")
data class LessonEntity(
    @PrimaryKey
    val lessonId: String,
    val title: String,
    val description: String,
    val module: String, // membaca, menulis, berhitung
    val grade: Int,
    val content: String,
    val duration: Int, // in minutes
    val order: Int,
    val isActive: Boolean = true,
    val createdAt: Long = System.currentTimeMillis()
)