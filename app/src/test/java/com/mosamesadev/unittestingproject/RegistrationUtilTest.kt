package com.mosamesadev.unittestingproject

import com.google.common.truth.Truth.assertThat
import org.junit.Test

class RegistrationUtilTest {

    @Test
    fun `empty username returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "",
            "123",
            "123"

        )
        assertThat(result).isFalse()
    }

    @Test
    fun `valid username and correctly repeated password returns true`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Johan",
            "123",
            "123"

        )
        assertThat(result).isTrue()
    }

    @Test
    fun `username already exists returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Carl",
            "123",
            "123"

        )
        assertThat(result).isFalse()
    }
    @Test
    fun `empty password returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Johan",
            "",
            ""

        )
        assertThat(result).isFalse()
    }

    @Test
    fun `password and confirmed password do not match returns false`(){
        val result = RegistrationUtil.validateRegistrationInput(
            "Johan",
            "123",
            "1234"

        )
        assertThat(result).isFalse()
    }

}