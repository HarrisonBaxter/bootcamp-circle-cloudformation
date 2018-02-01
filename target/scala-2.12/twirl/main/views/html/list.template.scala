
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[TodoItem],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(items: List[TodoItem]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.25*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
    <body>
        <h2>Your ToDo list</h2>
        <div>
            <ul>
                """),_display_(/*9.18*/for(item <- items) yield /*9.36*/ {_display_(Seq[Any](format.raw/*9.38*/("""
                    """),format.raw/*10.21*/("""<li>"""),_display_(/*10.26*/item/*10.30*/.text),format.raw/*10.35*/(""" """),format.raw/*10.36*/("""<form method="post" action=""""),_display_(/*10.65*/controllers/*10.76*/.routes.TodoController.remove(item.epochMillis)),format.raw/*10.123*/(""""><button type="submit">Delete</button></form></li>
                """)))}),format.raw/*11.18*/("""
            """),format.raw/*12.13*/("""</ul>
            """),_display_(/*13.14*/if(items.isEmpty)/*13.31*/ {_display_(Seq[Any](format.raw/*13.33*/("""
                """),format.raw/*14.17*/("""You don't have any ToDo items!
            """)))}),format.raw/*15.14*/("""
        """),format.raw/*16.9*/("""</div>
        <div>
            <form method="post" action=""""),_display_(/*18.42*/controllers/*18.53*/.routes.TodoController.create),format.raw/*18.82*/("""">
                <input type="text" minlength="1" name="text">
                <button type="submit">Create</button>
            </form>
        </div>

        <div class="notice">
            <i class="icon icon-important">
                <span class="visually-hidden">Warning</span>
            </i>
            <strong class="bold-small">
                A wealthy Nigerian prince would like to transfer you money.
            </strong>
        </div>
    </body>
</html>"""))
      }
    }
  }

  def render(items:List[TodoItem]): play.twirl.api.HtmlFormat.Appendable = apply(items)

  def f:((List[TodoItem]) => play.twirl.api.HtmlFormat.Appendable) = (items) => apply(items)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Feb 01 16:37:14 GMT 2018
                  SOURCE: /Users/harrisonbaxter/Applications/ovo/bootcamp-circle-cloudformation/app/views/list.scala.html
                  HASH: 6a4e95a84eaba4ec7f7e6da77db405dec09245fa
                  MATRIX: 736->1|854->24|882->26|1022->140|1055->158|1094->160|1143->181|1175->186|1188->190|1214->195|1243->196|1299->225|1319->236|1388->283|1488->352|1529->365|1575->384|1601->401|1641->403|1686->420|1761->464|1797->473|1886->535|1906->546|1956->575
                  LINES: 21->1|26->1|28->3|34->9|34->9|34->9|35->10|35->10|35->10|35->10|35->10|35->10|35->10|35->10|36->11|37->12|38->13|38->13|38->13|39->14|40->15|41->16|43->18|43->18|43->18
                  -- GENERATED --
              */
          