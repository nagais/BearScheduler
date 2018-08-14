package controller

import javafx.application.Application
import javafx.stage.Stage
import util.AppResource
import util.RootControllerInterface

abstract class RootController : Application(), RootControllerInterface {
    private lateinit var stage: Stage

    override fun start(primaryStage: Stage?) {
        stage = primaryStage!!.apply {
            this.title = Manager.APP_TITLE
            icons.add(AppResource.getImage(AppResource.Images.ICON))
        }
        setStageToManager(primaryStage)
        startBaseController(primaryStage)
        primaryStage.show()
    }

    override fun setStageToManager(stage: Stage) {
        Manager.setStage(stage)
    }

    override fun getStage(): Stage {
        return Manager.getStage()
    }

    abstract fun startBaseController(stage: Stage)
}