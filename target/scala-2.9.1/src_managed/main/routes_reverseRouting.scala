// @SOURCE:/home/anlag/Stuff/play/trsurvey/conf/routes
// @HASH:f62c3eafc8d918706799a40543406d5d3212343b
// @DATE:Fri Nov 16 19:14:11 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:13
// @LINE:6
package controllers {

// @LINE:6
class ReverseSurveyController {
    


 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:13
class ReverseAssets {
    


 
// @LINE:13
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:13
// @LINE:6
package controllers.javascript {

// @LINE:6
class ReverseSurveyController {
    


 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.SurveyController.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:13
class ReverseAssets {
    


 
// @LINE:13
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:13
// @LINE:6
package controllers.ref {

// @LINE:6
class ReverseSurveyController {
    


 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.SurveyController.index(), HandlerDef(this, "controllers.SurveyController", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:13
class ReverseAssets {
    


 
// @LINE:13
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                