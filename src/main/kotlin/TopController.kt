import util.AppResource

class TopController : BaseController() {

    override fun onSetUpView() {
        setSense(AppResource.Layout.Top)
    }
}