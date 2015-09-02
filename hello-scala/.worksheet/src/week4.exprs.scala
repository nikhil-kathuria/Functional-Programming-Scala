package week4

object exprs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(157); 
  def show(e: Expr): String = e match {
    //case Number(x) => x.toString
    case Sum(l,r)  => show(l) + " + " +  show(r)
  };System.out.println("""show: (e: week4.Expr)String""")}
}
