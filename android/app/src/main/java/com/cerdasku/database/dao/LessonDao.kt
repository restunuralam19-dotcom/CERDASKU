package com.cerdasku.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.cerdasku.database.entities.LessonEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LessonDao {
    @Insert
    suspend fun insert(lesson: LessonEntity)

    @Query("SELECT * FROM lessons WHERE lessonId = :lessonId")
    fun getLessonById(lessonId: String): Flow<LessonEntity?>

    @Query("SELECT * FROM lessons WHERE module = :module AND grade = :grade ORDER BY 'order'")
    fun getLessonsByModuleAndGrade(module: String, grade: Int): Flow<List<LessonEntity>>

    @Query("SELECT * FROM lessons WHERE grade = :grade")
    fun getLessonsByGrade(grade: Int): Flow<List<LessonEntity>>
}