// @SOURCE:/home/anlag/Stuff/play/trsurvey/conf/routes
// @HASH:c1cf7841735fc1fae0d145531a52623614bb3a57
// @DATE:Thu Nov 15 13:15:41 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:8
val controllers_Application_surveys1 = Route("GET", PathPattern(List(StaticPart("/admin"))))
                    

// @LINE:9
val controllers_Application_newSurvey2 = Route("POST", PathPattern(List(StaticPart("/admin"))))
                    

// @LINE:10
val controllers_Application_deleteSurvey3 = Route("POST", PathPattern(List(StaticPart("/admin/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:13
val controllers_Assets_at4 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.Application.index()"""),("""GET""","""/admin""","""controllers.Application.surveys()"""),("""POST""","""/admin""","""controllers.Application.newSurvey()"""),("""POST""","""/admin/$id<[^/]+>/delete""","""controllers.Application.deleteSurvey(id:Long)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil))
   }
}
                    

// @LINE:8
case controllers_Application_surveys1(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.surveys(), HandlerDef(this, "controllers.Application", "surveys", Nil))
   }
}
                    

// @LINE:9
case controllers_Application_newSurvey2(params) => {
   call { 
        invokeHandler(_root_.controllers.Application.newSurvey(), HandlerDef(this, "controllers.Application", "newSurvey", Nil))
   }
}
                    

// @LINE:10
case controllers_Application_deleteSurvey3(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.Application.deleteSurvey(id), HandlerDef(this, "controllers.Application", "deleteSurvey", Seq(classOf[Long])))
   }
}
                    

// @LINE:13
case controllers_Assets_at4(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                