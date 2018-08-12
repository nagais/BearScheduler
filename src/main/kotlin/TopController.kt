import util.AppResource

class TopController : BaseController() {

    override fun onSetUpView(resource: AppResource) {
        setScene(this, resource.getLayoutScene(AppResource.Layout.TOP))
        val cssPath = resource.getCssPath(AppResource.Css.TOP)
        setStyleSheet(cssPath)
    }
}