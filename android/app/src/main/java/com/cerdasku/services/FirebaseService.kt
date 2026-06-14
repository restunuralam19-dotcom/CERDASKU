package com.cerdasku.services

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.FirebaseFirestore
import javax.inject.Inject

class FirebaseService @Inject constructor(
    private val auth: FirebaseAuth,
    private val database: FirebaseDatabase,
    private val firestore: FirebaseFirestore
) {
    fun getCurrentUser() = auth.currentUser

    fun isUserAuthenticated() = auth.currentUser != null

    // TODO: Implement Firebase operations
}