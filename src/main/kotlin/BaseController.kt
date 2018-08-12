import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage
import util.AppResource

abstract class BaseController : Application() {
    protected val resource = AppResource.getResourceObject()
    private lateinit var stage: Stage

    companion object {
        const val APP_TITLE = "BearTree"
    }

    override fun start(primaryStage: Stage?) {
        stage = primaryStage!!
        primaryStage.apply {
            title = APP_TITLE
            icons.add(resource.getImage(AppResource.Images.ICON))
        }
        primaryStage.show()

        onSetUpView()
    }

    fun setSense(layout: AppResource.Layout) {
        stage.apply {
            scene = Scene(resource.getLayoutParent(layout))
        }
    }

    abstract fun onSetUpView()
}