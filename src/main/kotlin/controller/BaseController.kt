package controller

import javafx.scene.Scene
import javafx.stage.Stage
import util.AppResource
import util.ControllerInterface

abstract class BaseController : RootController(), ControllerInterface {

    fun setScene(scene: Scene?) {
        getStage().scene = scene
    }

    fun onNextView(controller: ControllerInterface) {
        controller.onSetUpView(AppResource)
    }

    override fun startBaseController(stage: Stage) {
        onSetUpView(AppResource)
    }
}