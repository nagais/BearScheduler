package util

import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.scene.image.Image

object AppResource {

    const val LAYOUT_RESOURCE_PATH = "../resources/layout/"
    const val IMAGE_RESOURCE_PATH = "../resources/images/"

    fun getResourceObject(): AppResource {
        return this
    }

    fun getLayoutParent(layout: Layout) : Parent {
        val path = LAYOUT_RESOURCE_PATH + layout.layoutPath
        return FXMLLoader.load<Parent>(javaClass.classLoader.getResource(path))
    }

    fun getImage(image: Images) : Image {
        val path = IMAGE_RESOURCE_PATH + image.imagePath
        return Image(javaClass.classLoader.getResourceAsStream(path))
    }

    enum class Layout(val layoutPath: String) {
        Top("layout_top.fxml")
    }

    enum class Images(val imagePath: String) {
        ICON("icon.png")
    }
}