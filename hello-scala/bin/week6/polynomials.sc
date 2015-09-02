package week6

object polynomials {
  class Poly(val terms0: Map[Int, Double]){
    def this(bindings: (Int, Double)*) = this(bindings.toMap)
    val terms = terms0 withDefaultValue 0.0
    def + (other: Poly) = new Poly(terms ++ (other.terms map adjust))
    def adjust(term: (Int, Double)) : (Int, Double) = {
      val (exp, coeff) = term
      exp -> (coeff + terms(exp))
      /** terms get exp match {
      case Some(coeff1) => exp ->(coeff + coeff1)
      case None => exp -> coeff
      }**/
    }
    
    override def toString =
    ( for ((exp,coeff) <- terms.toList.sorted.reverse) yield coeff+"X^"+exp) mkString " + "
  }
  val p1 = new Poly(Map(1 -> 2.0, 3 -> 4.0, 5 -> 6.2))
                                                  //> p1  : week6.polynomials.Poly = 6.2X^5 + 4.0X^3 + 2.0X^1
  val p2 = new Poly(Map(0 -> 3.0, 3 -> 7.0))      //> p2  : week6.polynomials.Poly = 7.0X^3 + 3.0X^0
  p1 + p2                                         //> res0: week6.polynomials.Poly = 6.2X^5 + 11.0X^3 + 2.0X^1 + 3.0X^0
}