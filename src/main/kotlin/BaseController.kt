import javafx.application.Application
import javafx.scene.Scene
import javafx.stage.Stage
import util.AppResource

abstract class BaseController : Application() {
    private val resource = AppResource.getResourceObject()
    private lateinit var stage: Stage
    private var css: String = ""

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

        onSetUpView(this.resource)
        setScene(this, stage.scene)
    }

    fun setScene(controller: BaseController, scene: Scene?) {
        controller.stage.scene = scene
        setStyleSheet(null)
        applyStyleSheet(controller, css)
    }

    private fun applyStyleSheet(controller: BaseController, css: String) {
        controller.stage
                .scene
                .stylesheets
                .add(css)
    }

    abstract fun onSetUpView(resource: AppResource)

    fun getStage() = stage

    open fun setStyleSheet(css: String?) {
        css?.let {
            this.css = css
        }
    }
}