// @SOURCE:/home/anlag/Stuff/play/trsurvey/conf/routes
// @HASH:249cd3a9b86f6c239b181b49edd9c511a2ef9d07
// @DATE:Fri Nov 16 20:29:06 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_SurveyController_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:7
val controllers_SurveyController_send1 = Route("POST", PathPattern(List(StaticPart("/"))))
                    

// @LINE:14
val controllers_Assets_at2 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    
def documentation = List(("""GET""","""/""","""controllers.SurveyController.index()"""),("""POST""","""/""","""controllers.SurveyController.send()"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_SurveyController_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.SurveyController.index(), HandlerDef(this, "controllers.SurveyController", "index", Nil))
   }
}
                    

// @LINE:7
case controllers_SurveyController_send1(params) => {
   call { 
        invokeHandler(_root_.controllers.SurveyController.send(), HandlerDef(this, "controllers.SurveyController", "send", Nil))
   }
}
                    

// @LINE:14
case controllers_Assets_at2(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    
}
    
}
                