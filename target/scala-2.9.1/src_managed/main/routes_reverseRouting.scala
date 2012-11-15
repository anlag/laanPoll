// @SOURCE:/home/anlag/Stuff/play/trsurvey/conf/routes
// @HASH:c1cf7841735fc1fae0d145531a52623614bb3a57
// @DATE:Thu Nov 15 13:15:41 CET 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:13
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def newSurvey() = {
   Call("POST", "/admin")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:10
def deleteSurvey(id:Long) = {
   Call("POST", "/admin/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:8
def surveys() = {
   Call("GET", "/admin")
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
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.javascript {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def newSurvey = JavascriptReverseRoute(
   "controllers.Application.newSurvey",
   """
      function() {
      return _wA({method:"POST", url:"/admin"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:10
def deleteSurvey = JavascriptReverseRoute(
   "controllers.Application.deleteSurvey",
   """
      function(id) {
      return _wA({method:"POST", url:"/admin/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:8
def surveys = JavascriptReverseRoute(
   "controllers.Application.surveys",
   """
      function() {
      return _wA({method:"GET", url:"/admin"})
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
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
package controllers.ref {

// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:6
class ReverseApplication {
    


 
// @LINE:9
def newSurvey() = new play.api.mvc.HandlerRef(
   controllers.Application.newSurvey(), HandlerDef(this, "controllers.Application", "newSurvey", Seq())
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq())
)
                              
 
// @LINE:10
def deleteSurvey(id:Long) = new play.api.mvc.HandlerRef(
   controllers.Application.deleteSurvey(id), HandlerDef(this, "controllers.Application", "deleteSurvey", Seq(classOf[Long]))
)
                              
 
// @LINE:8
def surveys() = new play.api.mvc.HandlerRef(
   controllers.Application.surveys(), HandlerDef(this, "controllers.Application", "surveys", Seq())
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
                    
                