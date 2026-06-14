package com.cerdasku.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.cerdasku.database.entities.StudentEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface StudentDao {
    @Insert
    suspend fun insert(student: StudentEntity)

    @Update
    suspend fun update(student: StudentEntity)

    @Query("SELECT * FROM students WHERE studentId = :studentId")
    fun getStudentById(studentId: String): Flow<StudentEntity?>

    @Query("SELECT * FROM students WHERE userId = :userId")
    fun getStudentByUserId(userId: String): Flow<StudentEntity?>

    @Query("SELECT * FROM students WHERE grade = :grade ORDER BY totalXP DESC")
    fun getStudentsByGrade(grade: Int): Flow<List<StudentEntity>>

    @Query("UPDATE students SET totalXP = totalXP + :xp WHERE studentId = :studentId")
    suspend fun addXP(studentId: String, xp: Int)
}