package week5

object squarelist {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(153); 
  
  def squareList(xs: List[Int]): List[Int]= xs match {
  case Nil => List()
  case y::ys => y*y::squareList(ys)
  };System.out.println("""squareList: (xs: List[Int])List[Int]""");$skip(64); 
  
  def squareList1(xs: List[Int]): List[Int] = xs.map(y=>y*y);System.out.println("""squareList1: (xs: List[Int])List[Int]""")}
}
