package com.cerdasku.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.cerdasku.database.entities.ProgressEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ProgressDao {
    @Insert
    suspend fun insert(progress: ProgressEntity)

    @Update
    suspend fun update(progress: ProgressEntity)

    @Query("SELECT * FROM progress WHERE studentId = :studentId AND lessonId = :lessonId")
    fun getProgress(studentId: String, lessonId: String): Flow<ProgressEntity?>

    @Query("SELECT * FROM progress WHERE studentId = :studentId ORDER BY startedAt DESC")
    fun getStudentProgress(studentId: String): Flow<List<ProgressEntity>>

    @Query("SELECT * FROM progress WHERE isSynced = 0")
    fun getUnsyncedProgress(): Flow<List<ProgressEntity>>
}