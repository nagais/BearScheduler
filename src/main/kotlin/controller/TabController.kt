package controller

import common.CustomTaskCell
import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.scene.control.ListCell
import javafx.scene.control.ListView
import javafx.scene.control.TextField
import javafx.scene.input.KeyCode
import javafx.scene.input.KeyEvent
import javafx.util.Callback

class TabController {

    @FXML
    private lateinit var textField: TextField
    @FXML
    private lateinit var listView: ListView<String>

    private val listItem: ObservableList<String> = FXCollections.observableArrayList()

    fun initialize() {
        listView.items = listItem
        listView.cellFactory = Callback<ListView<String>, ListCell<String>> { CustomTaskCell() }
    }

    @FXML
    fun onKeyPress(key: KeyEvent) {
        if (key.code == KeyCode.ENTER && textField.text.isNotEmpty()) {
            listItem.add(textField.text)
            textField.clear()
        }
    }
}