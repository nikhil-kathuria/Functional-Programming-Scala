package week5

object squarelist {
  
  def squareList(xs: List[Int]): List[Int]= xs match {
  case Nil => List()
  case y::ys => y*y::squareList(ys)
  }                                               //> squareList: (xs: List[Int])List[Int]
  
  def squareList1(xs: List[Int]): List[Int] = xs.map(y=>y*y)
                                                  //> squareList1: (xs: List[Int])List[Int]
}