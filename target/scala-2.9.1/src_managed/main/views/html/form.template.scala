
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object form extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Survey],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(form: Form[Survey]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.22*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/(form.get.getQuestions()))),format.raw/*5.27*/("""

"""),_display_(Seq[Any](/*7.2*/helper/*7.8*/.form(action = routes.SurveyController.send, 'id -> "form")/*7.67*/ {_display_(Seq[Any](format.raw/*7.69*/("""
  
  """),_display_(Seq[Any](/*9.4*/for((question,i) <- (form.get.getQuestions.zipWithIndex)) yield /*9.61*/ {_display_(Seq[Any](format.raw/*9.63*/("""
    <p>"""),_display_(Seq[Any](/*10.9*/question/*10.17*/.getText)),format.raw/*10.25*/("""
    <input type="text" size="12" name="question["""),_display_(Seq[Any](/*11.50*/i)),format.raw/*11.51*/("""].answer"></p> 
  """)))})),format.raw/*12.4*/("""

""")))})),format.raw/*14.2*/("""
"""))}
    }
    
    def render(form:Form[Survey]) = apply(form)
    
    def f:((Form[Survey]) => play.api.templates.Html) = (form) => apply(form)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 16 20:05:56 CET 2012
                    SOURCE: /home/anlag/Stuff/play/trsurvey/app/views/form.scala.html
                    HASH: 78073eedb9cc669c82b97322f6fcb2c614023b11
                    MATRIX: 760->1|873->21|901->40|937->42|983->67|1020->70|1033->76|1100->135|1139->137|1180->144|1252->201|1291->203|1335->212|1352->220|1382->228|1468->278|1491->279|1541->298|1575->301
                    LINES: 27->1|31->1|33->4|34->5|34->5|36->7|36->7|36->7|36->7|38->9|38->9|38->9|39->10|39->10|39->10|40->11|40->11|41->12|43->14
                    -- GENERATED --
                */
            