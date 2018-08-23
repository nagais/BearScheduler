package controller

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.scene.control.ListView
import javafx.scene.control.TextField
import javafx.scene.input.KeyEvent

class TabController {

    @FXML private lateinit var textField: TextField
    @FXML private lateinit var listView: ListView<String>

    private val listItem: ObservableList<String> = FXCollections.observableArrayList()

    fun initialize() {
        listView.items = listItem
    }

    @FXML fun onKeyPress(key: KeyEvent) {

    }
}