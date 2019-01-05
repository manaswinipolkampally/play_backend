// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/manaswini/Desktop/play-java-starter-example/conf/routes
// @DATE:Fri Dec 28 12:05:46 IST 2018


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
