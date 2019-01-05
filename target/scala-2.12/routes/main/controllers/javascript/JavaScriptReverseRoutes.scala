// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/manaswini/Desktop/play-java-starter-example/conf/routes
// @DATE:Fri Dec 28 12:05:46 IST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers.javascript {

  // @LINE:28
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseCountController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def count: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.CountController.count",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "count"})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseHelloWorldController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def hello: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloWorldController.hello",
      """
        function(name0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hello/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0))})
        }
      """
    )
  
    // @LINE:9
    def me: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloWorldController.me",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "me"})
        }
      """
    )
  
    // @LINE:7
    def hellos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloWorldController.hellos",
      """
        function(name0,count1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "hellos/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[String]].javascriptUnbind + """)("name", name0)) + _qS([(count1 == null ? null : (""" + implicitly[play.api.mvc.QueryStringBindable[Integer]].javascriptUnbind + """)("count", count1))])})
        }
      """
    )
  
    // @LINE:5
    def helloWorld: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloWorldController.helloWorld",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "helloWorld"})
        }
      """
    )
  
    // @LINE:8
    def greetings: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HelloWorldController.greetings",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "greetings"})
        }
      """
    )
  
  }

  // @LINE:12
  class ReverseBooksController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def deleteBookById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.deleteBookById",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "books/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:13
    def getBookById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.getBookById",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:16
    def getAllBooks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.getAllBooks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books"})
        }
      """
    )
  
    // @LINE:14
    def updateBookById: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.updateBookById",
      """
        function(id0) {
          return _wA({method:"PUT", url:"""" + _prefix + { _defaultPrefix } + """" + "books/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Integer]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:12
    def createBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BooksController.createBook",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "books"})
        }
      """
    )
  
  }

  // @LINE:21
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseAsyncController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def message: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AsyncController.message",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "message"})
        }
      """
    )
  
  }


}
