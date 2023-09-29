package com.example.firebasenotesapp.model

data class UserModel(
    val userId: String,
    val email: String,
    val userName: String
) {
    fun toMap(): MutableMap<String, Any> {
        return mutableMapOf(
            "userId" to this.userId,
            "email" to this.email,
            "userName" to this.userName
        )
    }
}
