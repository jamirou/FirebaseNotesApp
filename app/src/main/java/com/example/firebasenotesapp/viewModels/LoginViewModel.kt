package com.example.firebasenotesapp.viewModels

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.launch

class LoginViewModel: ViewModel() {

    private val auth: FirebaseAuth = Firebase.auth
    var showAlert by mutableStateOf(false)
    fun login(email: String, password: String, onSuccess: () -> Unit) {
        viewModelScope.launch {
            try {
                auth.signInWithEmailAndPassword(email, password)
                    .addOnCompleteListener {task ->
                        if (task.isSuccessful) {
                            onSuccess()
                        }else {
                            Log.d("Firebase Error", "User and password are wrong")
                            showAlert = true
                        }
                    }
            }catch (e: Exception) {
                Log.d("Error in app","the error: ${e.localizedMessage}")
            }
        }
    }
    fun closeAlert() {
        showAlert = false
    }
}