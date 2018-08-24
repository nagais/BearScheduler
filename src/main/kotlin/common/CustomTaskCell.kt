package common

import javafx.fxml.FXML
import javafx.fxml.FXMLLoader
import javafx.scene.Node
import javafx.scene.control.Label
import javafx.scene.control.ListCell
import javafx.scene.layout.AnchorPane
import util.AppResource

class CustomTaskCell : ListCell<String>() {
    @FXML
    private lateinit var task: Label
    @FXML
    private lateinit var taskPane: AnchorPane

    private val loader: FXMLLoader = AppResource.getLayoutLoader(AppResource.Layout.TASK_CELL)

    init {
        loader.setController(this)
        loader.load<Node>()
    }

    // reference : http://www.takaiwa.net/2014/04/javafxlistviewrowfxml.html
    override fun updateItem(item: String?, empty: Boolean) {
        super.updateItem(item, empty)
        if (empty) {
            text = null
            graphic = null
        } else {
            item?.let {
                this.task.text = it
            }
            graphic = taskPane
        }
    }
}