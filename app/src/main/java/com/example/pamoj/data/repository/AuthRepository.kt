package com.example.pamoj.data.repository

import com.google.android.gms.tasks.Task
import com.google.firebase.auth.AuthResult
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser

class AuthRepository {
    private val firebaseAuth = FirebaseAuth.getInstance()

    fun signInWithEmailAndPassword(email: String, password: String): Task<AuthResult> {
        return firebaseAuth.signInWithEmailAndPassword(email, password)
    }

    fun createUserWithEmailAndPassword(email: String, password: String): Task<AuthResult> {
        return firebaseAuth.createUserWithEmailAndPassword(email, password)
    }

    fun getCurrentUser(): FirebaseUser? {
        return firebaseAuth.currentUser
    }
}