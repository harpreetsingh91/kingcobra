
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/harpreetsingh/Desktop/kingcobra/conf/routes
// @DATE:Sat Feb 25 15:32:37 PST 2017


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
