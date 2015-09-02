package week5

object concat {
 def concat[T](xs:List[T], ys:List[T]): List[T] = xs match {
   case List() => ys
   //case z :: zs => concat(zs,z::ys)
   case z :: zs => z :: concat(zs,ys)
   }                                              //> concat: [T](xs: List[T], ys: List[T])List[T]
 
 val first = List[Int](1,2,3,4)                   //> first  : List[Int] = List(1, 2, 3, 4)
 val second = List[Int](4,5,6,7)                  //> second  : List[Int] = List(4, 5, 6, 7)
 
 concat[Int](first, second) foreach println       //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 4
                                                  //| 5
                                                  //| 6
                                                  //| 7
}