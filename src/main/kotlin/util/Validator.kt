package util

import controller.TopController

class Validator {
    companion object {
        fun addressValidate(address: String): Boolean {
            val emailRegex = TopController.EMAIL_PATTERN.toRegex()
            return emailRegex.matches(address)
        }

        // reference : https://stackoverflow.com/questions/49519739/password-regex-not-working-in-kotlin
        fun passwordValidate(password: String): Boolean {
            val passwordRegex = TopController.PASSWORD_PATTERN.toRegex()
            return passwordRegex.matches(password)
        }
    }
}