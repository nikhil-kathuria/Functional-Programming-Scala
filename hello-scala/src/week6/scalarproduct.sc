package week6

object scalarproduct {
  def scalarProduct(xs: List[Double], ys: List[Double]): Double =
  (for((x,y) <- (xs zip ys)) yield x*y).sum       //> scalarProduct: (xs: List[Double], ys: List[Double])Double
 }