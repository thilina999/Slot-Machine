
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Slot Machine")/*3.22*/ {_display_(Seq[Any](format.raw/*3.24*/("""
  """),format.raw/*4.3*/("""<div id="content" class="wrapper doc">
		<h1>
            <div class="container">
                <img class="img-responsive" style="max-width:100px;height:auto;" src=""""),_display_(/*7.88*/routes/*7.94*/.Assets.versioned("images/favicon.png")),format.raw/*7.133*/("""">
                <img class="img-responsive" style="max-width:100%;height:auto;" src=""""),_display_(/*8.87*/routes/*8.93*/.Assets.versioned("images/sm.png")),format.raw/*8.127*/("""">
                <img class="img-responsive" style="max-width:100px;height:auto;" src=""""),_display_(/*9.88*/routes/*9.94*/.Assets.versioned("images/favicon.png")),format.raw/*9.133*/("""">
            </div>
        </h1>
        <div class="container">
            <div id="error"></div>
            <div class="slot-wrapper"  name="slots">
                <div id="reel"><img src=""""),_display_(/*15.43*/routes/*15.49*/.Assets.versioned("images/redseven.png")),format.raw/*15.89*/("""" id="slot1" onclick="stopreel1()"></div>
                <div id="reel"><img src=""""),_display_(/*16.43*/routes/*16.49*/.Assets.versioned("images/redseven.png")),format.raw/*16.89*/("""" id="slot2" onclick= "stopreel2()"></div>
                <div id="reel"><img src=""""),_display_(/*17.43*/routes/*17.49*/.Assets.versioned("images/redseven.png")),format.raw/*17.89*/("""" id="slot3" onclick="stopreel3()"></div>
                <div class="clear"></div>
            </div>
            <div id="result" style="font-weight: bold;">
               Game Results
            </div>
            <div id="stat" style="display:inline-flex;">
                CREDIT : <div id="credit" >10</div>
                BET : <div id="bet" >00</div>
            </div>
            <div id="buttonPanel">
			<button type="button" class="btn btn-success" onclick="betOne()" id="control">Bet One</button>
            <button type="button" class="btn btn-success" onclick="start()" id="control">Start</button>
            <button type="button" class="btn btn-success" onclick="betMax()" id="control">Bet Max</button>
            <button type="button" class="btn btn-success" onclick="addCoin()" id="control">Add Coin</button>
            <button type="button" class="btn btn-success" onclick="statics()" id="control">Statics</button>
            <button type="button" class="btn btn-success" onclick="reset()" id="control">Reset</button></div>
        </div>

      <div class="container" id="staticsSecction">
          <h2>Game Statics</h2>
          <p>This show previous results of the game. </p>
          <table class="table" >
              <thead>
              <tr>
                  <th><center>Bets</center></th>
                  <th><center>Results</center></th>
                  <th><center>Winnings</center></th>
              </tr>
              </thead>
              <tbody id="myTable">
              </tbody>
              
          </table>
      </div>

        <div class="credits">
            <div>Author: <a href="">Thilina Dissanayake </a></div>
            <div class="browsers">Tested in Firefox, Chrome and Microsoft Edge</div>
        </div>    
    </div>
""")))}),format.raw/*58.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Jan 05 12:43:28 IST 2018
                  SOURCE: E:/slotmachine/app/views/index.scala.html
                  HASH: 86b7d53021312ac166a28fc2a9e02b591692d61f
                  MATRIX: 941->1|1037->3|1067->8|1095->28|1134->30|1164->34|1362->206|1376->212|1436->251|1552->341|1566->347|1621->381|1738->472|1752->478|1812->517|2043->721|2058->727|2119->767|2231->852|2246->858|2307->898|2420->984|2435->990|2496->1030|4366->2870
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|39->7|39->7|39->7|40->8|40->8|40->8|41->9|41->9|41->9|47->15|47->15|47->15|48->16|48->16|48->16|49->17|49->17|49->17|90->58
                  -- GENERATED --
              */
          