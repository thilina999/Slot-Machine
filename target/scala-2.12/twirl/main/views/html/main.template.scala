
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
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object main extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
 * This template is called from the `index` template. This template
 * handles the rendering of the page header and body tags. It takes
 * two arguments, a `String` for the title of the page and an `Html`
 * object to insert into the body of the page.
 */
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>
<html lang="en">
    <head>
        """),format.raw/*12.62*/("""
        """),format.raw/*13.9*/("""<title>"""),_display_(/*13.17*/title),format.raw/*13.22*/("""</title>
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*14.59*/routes/*14.65*/.Assets.versioned("images/favicon.png")),format.raw/*14.104*/("""">
        <link rel="stylesheet"   href=""""),_display_(/*15.41*/routes/*15.47*/.Assets.versioned("bootstrap/css/bootstrap.css")),format.raw/*15.95*/("""">
        <script type="text/javascript"   src=""""),_display_(/*16.48*/routes/*16.54*/.Assets.versioned("bootstrap/js/popper.min.js")),format.raw/*16.101*/(""""></script>
        <script type="text/javascript"   src=""""),_display_(/*17.48*/routes/*17.54*/.Assets.versioned("bootstrap/js/jquery-3.2.1.min.js")),format.raw/*17.107*/(""""></script>
		<script type="text/javascript"   src=""""),_display_(/*18.42*/routes/*18.48*/.Assets.versioned("bootstrap/js/bootstrap.min.js")),format.raw/*18.98*/(""""></script>
        <link rel="stylesheet"   href=""""),_display_(/*19.41*/routes/*19.47*/.Assets.versioned("stylesheets/datatables.min.css")),format.raw/*19.98*/("""">
		<link rel="stylesheet"   href=""""),_display_(/*20.35*/routes/*20.41*/.Assets.versioned("stylesheets/custom.css")),format.raw/*20.84*/("""">
    </head>
    <body>
        """),format.raw/*24.32*/("""
        """),_display_(/*25.10*/content),format.raw/*25.17*/("""

        """),format.raw/*27.9*/("""<script src="https://www.gstatic.com/firebasejs/4.8.1/firebase.js"></script>
                <script>
          // Initialize Firebase
          var config = """),format.raw/*30.24*/("""{"""),format.raw/*30.25*/("""
            """),format.raw/*31.13*/("""apiKey: "AIzaSyBjahueKp6jLBPkT_DTo-syjC8e24vXvNo",
            authDomain: "slot-machine-7d037.firebaseapp.com",
            databaseURL: "https://slot-machine-7d037.firebaseio.com",
            projectId: "slot-machine-7d037",
            storageBucket: "",
            messagingSenderId: "262644783932"
          """),format.raw/*37.11*/("""}"""),format.raw/*37.12*/(""";
          firebase.initializeApp(config);
        </script>
		<script src=""""),_display_(/*40.17*/routes/*40.23*/.Assets.versioned("javascripts/datatables.min.js")),format.raw/*40.73*/("""" type="text/javascript"></script>
		<script src=""""),_display_(/*41.17*/routes/*41.23*/.Assets.versioned("javascripts/custom.js")),format.raw/*41.65*/("""" type="text/javascript"></script>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jan 05 01:55:53 IST 2018
                  SOURCE: E:/slotmachine/app/views/main.scala.html
                  HASH: 144ea494e4a768198aee0987368502f8176597ef
                  MATRIX: 1211->266|1336->296|1366->300|1449->408|1486->418|1521->426|1547->431|1642->499|1657->505|1718->544|1789->588|1804->594|1873->642|1951->693|1966->699|2035->746|2122->806|2137->812|2212->865|2293->919|2308->925|2379->975|2459->1028|2474->1034|2546->1085|2611->1123|2626->1129|2690->1172|2755->1300|2793->1311|2821->1318|2860->1330|3049->1491|3078->1492|3120->1506|3469->1827|3498->1828|3606->1909|3621->1915|3692->1965|3771->2017|3786->2023|3849->2065
                  LINES: 33->7|38->7|40->9|43->12|44->13|44->13|44->13|45->14|45->14|45->14|46->15|46->15|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|51->20|51->20|51->20|54->24|55->25|55->25|57->27|60->30|60->30|61->31|67->37|67->37|70->40|70->40|70->40|71->41|71->41|71->41
                  -- GENERATED --
              */
          