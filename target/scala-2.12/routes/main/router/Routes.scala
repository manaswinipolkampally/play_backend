// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/manaswini/Desktop/play-java-starter-example/conf/routes
// @DATE:Fri Dec 28 12:05:46 IST 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:5
  HelloWorldController_4: controllers.HelloWorldController,
  // @LINE:12
  BooksController_2: controllers.BooksController,
  // @LINE:21
  HomeController_1: controllers.HomeController,
  // @LINE:23
  CountController_0: controllers.CountController,
  // @LINE:25
  AsyncController_3: controllers.AsyncController,
  // @LINE:28
  Assets_5: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:5
    HelloWorldController_4: controllers.HelloWorldController,
    // @LINE:12
    BooksController_2: controllers.BooksController,
    // @LINE:21
    HomeController_1: controllers.HomeController,
    // @LINE:23
    CountController_0: controllers.CountController,
    // @LINE:25
    AsyncController_3: controllers.AsyncController,
    // @LINE:28
    Assets_5: controllers.Assets
  ) = this(errorHandler, HelloWorldController_4, BooksController_2, HomeController_1, CountController_0, AsyncController_3, Assets_5, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HelloWorldController_4, BooksController_2, HomeController_1, CountController_0, AsyncController_3, Assets_5, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """helloWorld""", """controllers.HelloWorldController.helloWorld()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hello/""" + "$" + """name<[^/]+>""", """controllers.HelloWorldController.hello(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """hellos/""" + "$" + """name<[^/]+>""", """controllers.HelloWorldController.hellos(name:String, count:Integer ?= 0)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """greetings""", """controllers.HelloWorldController.greetings()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """me""", """controllers.HelloWorldController.me()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.createBook()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """id<[^/]+>""", """controllers.BooksController.getBookById(id:Integer)"""),
    ("""PUT""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """id<[^/]+>""", """controllers.BooksController.updateBookById(id:Integer)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books/""" + "$" + """id<[^/]+>""", """controllers.BooksController.deleteBookById(id:Integer)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BooksController.getAllBooks()"""),
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """count""", """controllers.CountController.count"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """message""", """controllers.AsyncController.message"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:5
  private[this] lazy val controllers_HelloWorldController_helloWorld0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("helloWorld")))
  )
  private[this] lazy val controllers_HelloWorldController_helloWorld0_invoker = createInvoker(
    HelloWorldController_4.helloWorld(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "helloWorld",
      Nil,
      "GET",
      this.prefix + """helloWorld""",
      """""",
      Seq()
    )
  )

  // @LINE:6
  private[this] lazy val controllers_HelloWorldController_hello1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hello/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HelloWorldController_hello1_invoker = createInvoker(
    HelloWorldController_4.hello(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "hello",
      Seq(classOf[String]),
      "GET",
      this.prefix + """hello/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:7
  private[this] lazy val controllers_HelloWorldController_hellos2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("hellos/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_HelloWorldController_hellos2_invoker = createInvoker(
    HelloWorldController_4.hellos(fakeValue[String], fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "hellos",
      Seq(classOf[String], classOf[Integer]),
      "GET",
      this.prefix + """hellos/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:8
  private[this] lazy val controllers_HelloWorldController_greetings3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("greetings")))
  )
  private[this] lazy val controllers_HelloWorldController_greetings3_invoker = createInvoker(
    HelloWorldController_4.greetings(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "greetings",
      Nil,
      "POST",
      this.prefix + """greetings""",
      """""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_HelloWorldController_me4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("me")))
  )
  private[this] lazy val controllers_HelloWorldController_me4_invoker = createInvoker(
    HelloWorldController_4.me(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HelloWorldController",
      "me",
      Nil,
      "GET",
      this.prefix + """me""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BooksController_createBook5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_createBook5_invoker = createInvoker(
    BooksController_2.createBook(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "createBook",
      Nil,
      "POST",
      this.prefix + """books""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BooksController_getBookById6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_getBookById6_invoker = createInvoker(
    BooksController_2.getBookById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "getBookById",
      Seq(classOf[Integer]),
      "GET",
      this.prefix + """books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BooksController_updateBookById7_route = Route("PUT",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_updateBookById7_invoker = createInvoker(
    BooksController_2.updateBookById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "updateBookById",
      Seq(classOf[Integer]),
      "PUT",
      this.prefix + """books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:15
  private[this] lazy val controllers_BooksController_deleteBookById8_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_BooksController_deleteBookById8_invoker = createInvoker(
    BooksController_2.deleteBookById(fakeValue[Integer]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "deleteBookById",
      Seq(classOf[Integer]),
      "DELETE",
      this.prefix + """books/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:16
  private[this] lazy val controllers_BooksController_getAllBooks9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BooksController_getAllBooks9_invoker = createInvoker(
    BooksController_2.getAllBooks(),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BooksController",
      "getAllBooks",
      Nil,
      "GET",
      this.prefix + """books""",
      """""",
      Seq()
    )
  )

  // @LINE:21
  private[this] lazy val controllers_HomeController_index10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index10_invoker = createInvoker(
    HomeController_1.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:23
  private[this] lazy val controllers_CountController_count11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("count")))
  )
  private[this] lazy val controllers_CountController_count11_invoker = createInvoker(
    CountController_0.count,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.CountController",
      "count",
      Nil,
      "GET",
      this.prefix + """count""",
      """ An example controller showing how to use dependency injection""",
      Seq()
    )
  )

  // @LINE:25
  private[this] lazy val controllers_AsyncController_message12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("message")))
  )
  private[this] lazy val controllers_AsyncController_message12_invoker = createInvoker(
    AsyncController_3.message,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AsyncController",
      "message",
      Nil,
      "GET",
      this.prefix + """message""",
      """ An example controller showing how to write asynchronous code""",
      Seq()
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Assets_versioned13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned13_invoker = createInvoker(
    Assets_5.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:5
    case controllers_HelloWorldController_helloWorld0_route(params@_) =>
      call { 
        controllers_HelloWorldController_helloWorld0_invoker.call(HelloWorldController_4.helloWorld())
      }
  
    // @LINE:6
    case controllers_HelloWorldController_hello1_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_HelloWorldController_hello1_invoker.call(HelloWorldController_4.hello(name))
      }
  
    // @LINE:7
    case controllers_HelloWorldController_hellos2_route(params@_) =>
      call(params.fromPath[String]("name", None), params.fromQuery[Integer]("count", Some(0))) { (name, count) =>
        controllers_HelloWorldController_hellos2_invoker.call(HelloWorldController_4.hellos(name, count))
      }
  
    // @LINE:8
    case controllers_HelloWorldController_greetings3_route(params@_) =>
      call { 
        controllers_HelloWorldController_greetings3_invoker.call(HelloWorldController_4.greetings())
      }
  
    // @LINE:9
    case controllers_HelloWorldController_me4_route(params@_) =>
      call { 
        controllers_HelloWorldController_me4_invoker.call(HelloWorldController_4.me())
      }
  
    // @LINE:12
    case controllers_BooksController_createBook5_route(params@_) =>
      call { 
        controllers_BooksController_createBook5_invoker.call(BooksController_2.createBook())
      }
  
    // @LINE:13
    case controllers_BooksController_getBookById6_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_getBookById6_invoker.call(BooksController_2.getBookById(id))
      }
  
    // @LINE:14
    case controllers_BooksController_updateBookById7_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_updateBookById7_invoker.call(BooksController_2.updateBookById(id))
      }
  
    // @LINE:15
    case controllers_BooksController_deleteBookById8_route(params@_) =>
      call(params.fromPath[Integer]("id", None)) { (id) =>
        controllers_BooksController_deleteBookById8_invoker.call(BooksController_2.deleteBookById(id))
      }
  
    // @LINE:16
    case controllers_BooksController_getAllBooks9_route(params@_) =>
      call { 
        controllers_BooksController_getAllBooks9_invoker.call(BooksController_2.getAllBooks())
      }
  
    // @LINE:21
    case controllers_HomeController_index10_route(params@_) =>
      call { 
        controllers_HomeController_index10_invoker.call(HomeController_1.index)
      }
  
    // @LINE:23
    case controllers_CountController_count11_route(params@_) =>
      call { 
        controllers_CountController_count11_invoker.call(CountController_0.count)
      }
  
    // @LINE:25
    case controllers_AsyncController_message12_route(params@_) =>
      call { 
        controllers_AsyncController_message12_invoker.call(AsyncController_3.message)
      }
  
    // @LINE:28
    case controllers_Assets_versioned13_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned13_invoker.call(Assets_5.versioned(path, file))
      }
  }
}
