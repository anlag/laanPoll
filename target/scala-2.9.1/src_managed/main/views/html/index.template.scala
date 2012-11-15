
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
object index extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[List[Survey],Form[Survey],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(surveys: List[Survey], surveyForm: Form[Survey]):play.api.templates.Html = {
        _display_ {import helper._


Seq[Any](format.raw/*1.51*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq[Any](/*5.2*/main("Survey list")/*5.21*/ {_display_(Seq[Any](format.raw/*5.23*/("""
    
  <h1>"""),_display_(Seq[Any](/*7.8*/surveys/*7.15*/.size())),format.raw/*7.22*/(""" survey(s)</h1>
    
  <ul>
    """),_display_(Seq[Any](/*10.6*/for(survey <- surveys) yield /*10.28*/ {_display_(Seq[Any](format.raw/*10.30*/("""
      <li>
        """),_display_(Seq[Any](/*12.10*/survey/*12.16*/.label)),format.raw/*12.22*/("""
    
        """),_display_(Seq[Any](/*14.10*/form(routes.Application.deleteSurvey(survey.id))/*14.58*/ {_display_(Seq[Any](format.raw/*14.60*/("""
          <input type="submit" value="Delete">
        """)))})),format.raw/*16.10*/("""
      </li>
    """)))})),format.raw/*18.6*/("""
  </ul>
  
  <h2>Add a new survey</h2>
    
  """),_display_(Seq[Any](/*23.4*/form(routes.Application.newSurvey())/*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/("""
        
    """),_display_(Seq[Any](/*25.6*/inputText(surveyForm("label")))),format.raw/*25.36*/(""" 
        
    <input type="submit" value="Create">
        
  """)))})),format.raw/*29.4*/("""

""")))})),format.raw/*31.2*/("""
"""))}
    }
    
    def render(surveys:List[Survey],surveyForm:Form[Survey]) = apply(surveys,surveyForm)
    
    def f:((List[Survey],Form[Survey]) => play.api.templates.Html) = (surveys,surveyForm) => apply(surveys,surveyForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Nov 15 12:02:23 CET 2012
                    SOURCE: /home/anlag/Stuff/play/trsurvey/app/views/index.scala.html
                    HASH: 9407cd67dcbd313e2605cfcef5c4f11b20b8b148
                    MATRIX: 774->1|916->50|944->69|980->71|1007->90|1046->92|1093->105|1108->112|1136->119|1204->152|1242->174|1282->176|1339->197|1354->203|1382->209|1433->224|1490->272|1530->274|1619->331|1668->349|1751->397|1796->433|1836->435|1886->450|1938->480|2033->544|2067->547
                    LINES: 27->1|31->1|33->4|34->5|34->5|34->5|36->7|36->7|36->7|39->10|39->10|39->10|41->12|41->12|41->12|43->14|43->14|43->14|45->16|47->18|52->23|52->23|52->23|54->25|54->25|58->29|60->31
                    -- GENERATED --
                */
            