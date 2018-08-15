package util

interface ControllerInterface {
    /**
     * Set the scene that is attached to the controller.
     */
    fun onSetScene(resource: AppResource)

    /**
     * controller initialization method.
     * Variable with FXML annotation is initialized with this method.
     */
    fun initialize()

    /**
     * Set up View
     */
    fun onSetUpView()
}