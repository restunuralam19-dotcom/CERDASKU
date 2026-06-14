package com.cerdasku.database.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "progress")
data class ProgressEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val studentId: String,
    val lessonId: String,
    val completedPercentage: Float = 0f,
    val score: Int = 0,
    val xpEarned: Int = 0,
    val startedAt: Long,
    val completedAt: Long? = null,
    val isSynced: Boolean = false
)