package controller

import util.AppResource

class TaskListController : BaseController() {

    override fun onSetUpView(resource: AppResource) {
        setScene(resource.getLayoutScene(AppResource.Layout.TASK_LIST))
    }
}