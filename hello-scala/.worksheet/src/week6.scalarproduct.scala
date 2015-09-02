package week6

object scalarproduct {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(147); 
  def scalarProduct(xs: List[Double], ys: List[Double]): Double =
  (for((x,y) <- (xs zip ys)) yield x*y).sum;System.out.println("""scalarProduct: (xs: List[Double], ys: List[Double])Double""")}
 }
