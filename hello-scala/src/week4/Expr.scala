package week4

trait Expr
case class NUmber(n:Int) extends Expr
case class Sum(e1: Expr,e2: Expr) extends Expr   