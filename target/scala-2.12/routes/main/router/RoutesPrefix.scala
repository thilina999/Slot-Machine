
// @GENERATOR:play-routes-compiler
// @SOURCE:E:/slotmachine/conf/routes
// @DATE:Wed Dec 27 12:29:58 IST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
