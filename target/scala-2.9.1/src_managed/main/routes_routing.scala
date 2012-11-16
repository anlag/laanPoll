// @SOURCE:/home/anlag/Stuff/play/trsurvey/conf/routes
// @HASH:f62c3eafc8d918706799a40543406d5d3212343b
// @DATE:Fri Nov 16 19:14:11 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_SurveyController_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:13
val controllers_Assets_at1 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.SurveyController.index()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_SurveyController_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.SurveyController.index(), HandlerDef(this, "controllers.SurveyController", "index", Nil))
   }
}
                    

// @LINE:13
case controllers_Assets_at1(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                