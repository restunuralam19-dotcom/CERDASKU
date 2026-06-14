package com.cerdasku.di

import android.content.Context
import androidx.room.Room
import com.cerdasku.database.CerdaskuDatabase
import com.cerdasku.services.FirebaseService
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun providesDatabase(
        @ApplicationContext context: Context
    ): CerdaskuDatabase {
        return Room.databaseBuilder(
            context,
            CerdaskuDatabase::class.java,
            "cerdasku_db"
        ).build()
    }

    @Singleton
    @Provides
    fun providesFirebaseAuth(): FirebaseAuth {
        return FirebaseAuth.getInstance()
    }

    @Singleton
    @Provides
    fun providesFirebaseDatabase(): FirebaseDatabase {
        return FirebaseDatabase.getInstance()
    }

    @Singleton
    @Provides
    fun providesFirebaseFirestore(): FirebaseFirestore {
        return FirebaseFirestore.getInstance()
    }

    @Singleton
    @Provides
    fun providesFirebaseService(
        auth: FirebaseAuth,
        database: FirebaseDatabase,
        firestore: FirebaseFirestore
    ): FirebaseService {
        return FirebaseService(auth, database, firestore)
    }
}