package util

import javafx.stage.Stage

interface RootControllerInterface {
    fun setStageToManager(stage: Stage)

    fun getStage(): Stage
}