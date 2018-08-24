package common

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.control.Label
import javafx.scene.control.ListCell
import util.AppResource

class CustomTaskCell : ListCell<String>() {
    @FXML
    private lateinit var task: Label

    private val loader:FXMLLoader = AppResource.getLayoutLoader(AppResource.Layout.TASK_CELL)

    init {
        loader.setController(this)
        loader.load<Parent>()
    }

    override fun updateItem(item: String?, empty: Boolean) {
        super.updateItem(item, empty)
        item?.let {
            this.task.text = it
        }
    }
}