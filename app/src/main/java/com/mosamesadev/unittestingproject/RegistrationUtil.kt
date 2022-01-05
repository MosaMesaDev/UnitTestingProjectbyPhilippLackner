package com.mosamesadev.unittestingproject

object RegistrationUtil {

    private val existingUsers = listOf("Peter","Carl")

    // The input is not valid if:
    // - the username or password are empty.
    // - The username is already taken.
    // - The confirmedPassword does not match the real password

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {

        if(username.isEmpty() || password.isEmpty()){
            return false
        }
        if(username in existingUsers){
            return false
        }
        if(password != confirmedPassword){
            return false
        }
        return true
    }

}