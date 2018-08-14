package util

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.Scene
import javafx.scene.image.Image

object AppResource {

    const val LAYOUT_RESOURCE_PATH = "../resources/layout/"
    const val IMAGE_RESOURCE_PATH = "../resources/images/"
    const val CSS_RESOURCE_PATH = "../resources/css/"

    lateinit var loader:FXMLLoader

    fun getLayoutScene(layout: Layout): Scene {
        val path = LAYOUT_RESOURCE_PATH + layout.layoutPath
        loader = FXMLLoader(javaClass.classLoader.getResource(path))
        val parent = loader.load<Parent>()
        return Scene(parent)
    }

    fun getImage(image: Images): Image {
        val path = IMAGE_RESOURCE_PATH + image.imagePath
        return Image(javaClass.classLoader.getResourceAsStream(path))
    }

    fun getCssPath(css: Css): String {
        return CSS_RESOURCE_PATH + css.cssPath
    }

    enum class Layout(val layoutPath: String) {
        TOP("layout_top.fxml"),
        TASK_LIST("layout_task_list.fxml")
    }

    enum class Images(val imagePath: String) {
        ICON("icon.png")
    }

    enum class Css(val cssPath: String) {
        TOP("top.css")
    }
}