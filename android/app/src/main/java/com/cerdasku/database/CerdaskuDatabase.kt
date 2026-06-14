package com.cerdasku.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cerdasku.database.dao.UserDao
import com.cerdasku.database.dao.StudentDao
import com.cerdasku.database.dao.LessonDao
import com.cerdasku.database.dao.ProgressDao
import com.cerdasku.database.entities.UserEntity
import com.cerdasku.database.entities.StudentEntity
import com.cerdasku.database.entities.LessonEntity
import com.cerdasku.database.entities.ProgressEntity

@Database(
    entities = [
        UserEntity::class,
        StudentEntity::class,
        LessonEntity::class,
        ProgressEntity::class
    ],
    version = 1,
    exportSchema = true
)
abstract class CerdaskuDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
    abstract fun studentDao(): StudentDao
    abstract fun lessonDao(): LessonDao
    abstract fun progressDao(): ProgressDao
}