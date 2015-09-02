package week4

object exprs {
  def show(e: Expr): String = e match {
    //case Number(x) => x.toString
    case Sum(l,r)  => show(l) + " + " +  show(r)
  }                                               //> show: (e: week4.Expr)String
}