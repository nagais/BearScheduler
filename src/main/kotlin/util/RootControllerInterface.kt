package util

import javafx.stage.Stage

interface RootControllerInterface {

    /**
     * Method to set ManagerObject to Stage instance.
     */
    fun setStageToManager(stage: Stage)

    fun getStage(): Stage
}