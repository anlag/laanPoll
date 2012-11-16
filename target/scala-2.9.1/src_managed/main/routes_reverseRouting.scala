// @SOURCE:/home/anlag/Stuff/play/trsurvey/conf/routes
// @HASH:249cd3a9b86f6c239b181b49edd9c511a2ef9d07
// @DATE:Fri Nov 16 20:29:06 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:14
// @LINE:7
// @LINE:6
package controllers {

// @LINE:7
// @LINE:6
class ReverseSurveyController {
    


 
// @LINE:7
def send() = {
   Call("POST", "/")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        

                      
    
}
                            

// @LINE:14
class ReverseAssets {
    


 
// @LINE:14
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:14
// @LINE:7
// @LINE:6
package controllers.javascript {

// @LINE:7
// @LINE:6
class ReverseSurveyController {
    


 
// @LINE:7
def send = JavascriptReverseRoute(
   "controllers.SurveyController.send",
   """
      function() {
      return _wA({method:"POST", url:"/"})
      }
   """
)
                                                        
 
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
                            

// @LINE:14
class ReverseAssets {
    


 
// @LINE:14
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
                    


// @LINE:14
// @LINE:7
// @LINE:6
package controllers.ref {

// @LINE:7
// @LINE:6
class ReverseSurveyController {
    


 
// @LINE:7
def send() = new play.api.mvc.HandlerRef(
   controllers.SurveyController.send(), HandlerDef(this, "controllers.SurveyController", "send", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.SurveyController.index(), HandlerDef(this, "controllers.SurveyController", "index", Seq())
)
                              

                      
    
}
                            

// @LINE:14
class ReverseAssets {
    


 
// @LINE:14
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            
}
                    
                