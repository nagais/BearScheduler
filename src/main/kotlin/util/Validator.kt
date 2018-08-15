package util

class Validator {

    companion object {
        // reference : https://android.googlesource.com/platform/frameworks/base/+/81aa097/core/java/android/util/Patterns.java
        const val EMAIL_PATTERN = "[a-zA-Z0-9\\+\\.\\_\\%\\-\\+]{1,256}" +
                "\\@" +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,64}" +
                "(" +
                "\\." +
                "[a-zA-Z0-9][a-zA-Z0-9\\-]{0,25}" +
                ")+"

        const val PASSWORD_PATTERN = "[a-zA-Z0-9;:@#$%!&]{8,}"

        fun addressValidate(address: String): Boolean {
            val emailRegex = EMAIL_PATTERN.toRegex()
            return emailRegex.matches(address)
        }

        // reference : https://stackoverflow.com/questions/49519739/password-regex-not-working-in-kotlin
        fun passwordValidate(password: String): Boolean {
            val passwordRegex = PASSWORD_PATTERN.toRegex()
            return passwordRegex.matches(password)
        }
    }
}