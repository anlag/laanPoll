
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
        _display_ {

Seq[Any](format.raw/*1.22*/("""

"""),_display_(Seq[Any](/*3.2*/helper/*3.8*/.form(action = routes.SurveyController.send, 'id -> "form")/*3.67*/ {_display_(Seq[Any](format.raw/*3.69*/("""
  
  """),_display_(Seq[Any](/*5.4*/for((question,i) <- (form.get.getQuestions.zipWithIndex)) yield /*5.61*/ {_display_(Seq[Any](format.raw/*5.63*/("""
    <p>"""),_display_(Seq[Any](/*6.9*/question/*6.17*/.getText)),format.raw/*6.25*/("""
    <input type="text" size="12" name="question["""),_display_(Seq[Any](/*7.50*/i)),format.raw/*7.51*/("""].answer" /></p> 
    <input type="submit" value="Send" />
  """)))})),format.raw/*9.4*/("""

""")))})),format.raw/*11.2*/("""
"""))}
    }
    
    def render(form:Form[Survey]) = apply(form)
    
    def f:((Form[Survey]) => play.api.templates.Html) = (form) => apply(form)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Nov 16 20:22:22 CET 2012
                    SOURCE: /home/anlag/Stuff/play/trsurvey/app/views/form.scala.html
                    HASH: 070c49e9b5336de2aa8be51eaa4ca6b58343901d
                    MATRIX: 760->1|857->21|894->24|907->30|974->89|1013->91|1054->98|1126->155|1165->157|1208->166|1224->174|1253->182|1338->232|1360->233|1452->295|1486->298
                    LINES: 27->1|30->1|32->3|32->3|32->3|32->3|34->5|34->5|34->5|35->6|35->6|35->6|36->7|36->7|38->9|40->11
                    -- GENERATED --
                */
            