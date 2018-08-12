import util.AppResource

class TopController : BaseController() {

    override fun onSetUpView() {
        setScene(AppResource.Layout.Top)
    }
}