// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/manaswini/Desktop/play-java-starter-example/conf/routes
// @DATE:Fri Dec 28 12:05:46 IST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:5
package controllers {

  // @LINE:28
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:23
  class ReverseCountController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def count(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "count")
    }
  
  }

  // @LINE:5
  class ReverseHelloWorldController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def hello(name:String): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hello/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)))
    }
  
    // @LINE:9
    def me(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "me")
    }
  
    // @LINE:7
    def hellos(name:String, count:Integer = 0): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "hellos/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[String]].unbind("name", name)) + play.core.routing.queryString(List(if(count == 0) None else Some(implicitly[play.api.mvc.QueryStringBindable[Integer]].unbind("count", count)))))
    }
  
    // @LINE:5
    def helloWorld(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "helloWorld")
    }
  
    // @LINE:8
    def greetings(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "greetings")
    }
  
  }

  // @LINE:12
  class ReverseBooksController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:15
    def deleteBookById(id:Integer): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:13
    def getBookById(id:Integer): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:16
    def getAllBooks(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "books")
    }
  
    // @LINE:14
    def updateBookById(id:Integer): Call = {
      
      Call("PUT", _prefix + { _defaultPrefix } + "books/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Integer]].unbind("id", id)))
    }
  
    // @LINE:12
    def createBook(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "books")
    }
  
  }

  // @LINE:21
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:21
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
  }

  // @LINE:25
  class ReverseAsyncController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:25
    def message(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "message")
    }
  
  }


}
