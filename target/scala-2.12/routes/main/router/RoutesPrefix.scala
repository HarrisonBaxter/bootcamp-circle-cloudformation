
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/harrisonbaxter/Applications/ovo/bootcamp-circle-cloudformation/conf/routes
// @DATE:Thu Feb 01 16:37:13 GMT 2018


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
