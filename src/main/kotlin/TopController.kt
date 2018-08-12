import util.AppResource

class TopController : BaseController() {

    override fun createView() {
        setSense(AppResource.Layout.Top)
    }
}