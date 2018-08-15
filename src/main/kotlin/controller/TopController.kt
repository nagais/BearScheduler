package controller

import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Label
import javafx.scene.control.PasswordField
import javafx.scene.control.TextField
import util.AppResource
import util.Validator

class TopController : BaseController() {

    @FXML
    private lateinit var validateErrorText: Label

    @FXML
    private lateinit var mailAddressField: TextField

    @FXML
    private lateinit var passwordField: PasswordField

    override fun onSetScene(resource: AppResource) {
        setScene(resource.getLayoutScene(AppResource.Layout.TOP))
    }

    @FXML
    fun onClick(actionEvent: ActionEvent) {
        val address = mailAddressField.text
        val password = passwordField.text

        if (Validator.addressValidate(address) && Validator.passwordValidate(password)) {
            onNextView(TaskListController())
            return
        }

        validateErrorText.isManaged = true
        validateErrorText.isVisible = true
    }

    override fun onSetUpView() {
    }
}