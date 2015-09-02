package week5

object reverse {
  def reverse[T](xs:List[T]): List[T] = xs match {
   case List() => xs
   case z :: zs => reverse(zs):::List(z)
   }                                              //> reverse: [T](xs: List[T])List[T]
  val first = List[Int](1,2,3,4)                  //> first  : List[Int] = List(1, 2, 3, 4)
  reverse[Int](first)                             //> res0: List[Int] = List(4, 3, 2, 1)
}