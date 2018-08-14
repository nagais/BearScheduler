package controller

import javafx.stage.Stage

object Manager {

    private lateinit var stage: Stage

    const val APP_TITLE = "BearScheduler"

    fun setStage(stage: Stage) {
        Manager.stage = stage
    }

    fun getStage(): Stage {
        return stage
    }
}