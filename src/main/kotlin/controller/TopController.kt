package controller

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import util.AppResource

class TopController : BaseController() {

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
    }

    @FXML
    private lateinit var validateErrorText: Label

    @FXML
    private lateinit var mailAddressField: TextField

    @FXML
    private lateinit var passwordField: PasswordField

    override fun onSetUpView(resource: AppResource) {
        setScene(resource.getLayoutScene(AppResource.Layout.TOP))
    }

    @FXML
    fun onClick(actionEvent: ActionEvent) {
        val address = mailAddressField.text
        val password = passwordField.text

        if (addressValidate(address) && passwordValidate(password)) {
            onNextView(TaskListController())
            return
        }

        validateErrorText.isManaged = true
        validateErrorText.isVisible = true
    }

    private fun addressValidate(address: String): Boolean {
        val emailRegex = EMAIL_PATTERN.toRegex()
        return emailRegex.matches(address)
    }

    // reference : https://stackoverflow.com/questions/49519739/password-regex-not-working-in-kotlin
    private fun passwordValidate(password: String): Boolean {
        val passwordRegex = PASSWORD_PATTERN.toRegex()
        return passwordRegex.matches(password)
    }
}