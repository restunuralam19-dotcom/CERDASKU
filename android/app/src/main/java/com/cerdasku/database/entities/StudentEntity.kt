package com.cerdasku.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "students")
data class StudentEntity(
    @PrimaryKey
    val studentId: String,
    val userId: String,
    val grade: Int, // 1, 2, or 3
    val level: Int = 1,
    val totalXP: Int = 0,
    val coins: Int = 0,
    val streakDays: Int = 0,
    val lastActivityDate: Long = 0,
    val createdAt: Long = System.currentTimeMillis(),
    val updatedAt: Long = System.currentTimeMillis()
)