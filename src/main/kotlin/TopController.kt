import javafx.event.ActionEvent
import javafx.fxml.FXML
import util.AppResource

class TopController : BaseController() {

    override fun onSetUpView(resource: AppResource) {
        setScene(resource.getLayoutScene(AppResource.Layout.TOP))
    }

    @FXML
    fun onClick(actionEvent: ActionEvent) {
        onNextView(TaskListController())
    }
}