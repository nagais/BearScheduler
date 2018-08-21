package controller

import javafx.collections.FXCollections
import javafx.collections.ObservableList
import javafx.fxml.FXML
import javafx.scene.control.Tab
import javafx.scene.control.TabPane
import util.AppResource

class TaskListController : BaseController() {

    companion object {
        private const val ALL = "ALL"
        private const val ADD = "+"
    }

    private val tabList: ObservableList<Tab> = FXCollections.observableArrayList()

    @FXML
    private lateinit var tabPane: TabPane

    override fun onSetUpView() {
        val tabAll = createTab(ALL)
        val tabAdd = createTab(ADD)
        tabList.addAll(tabAll, tabAdd)
        tabPane.tabs.addAll(tabList)
    }

    private fun createTab(tabName: String) : Tab {
        return Tab().apply {
            this.text = tabName
            this.isClosable = false
            this.content = AppResource.getLayoutParent(AppResource.Layout.TAB_CONTENT)
        }
    }

    override fun onSetScene(resource: AppResource) {
        setScene(resource.getLayoutScene(AppResource.Layout.TASK_LIST))
    }
}