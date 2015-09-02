package week5

object listfun {
  val nums = List(2,-4,5,7,1)                     //> nums  : List[Int] = List(2, -4, 5, 7, 1)
  val fruits = List("Apple","Banana","Orange","Kiwi")
                                                  //> fruits  : List[String] = List(Apple, Banana, Orange, Kiwi)
  val data = List("a","a","a","b","c","c","a")    //> data  : List[String] = List(a, a, a, b, c, c, a)
  
  nums filter (x=> x >0)                          //> res0: List[Int] = List(2, 5, 7, 1)
  nums filterNot (x=> x>0)                        //> res1: List[Int] = List(-4)
  nums partition (x=> x >0)                       //> res2: (List[Int], List[Int]) = (List(2, 5, 7, 1),List(-4))
  
  nums takeWhile (x=> x >0)                       //> res3: List[Int] = List(2)
  nums dropWhile (x=> x >0)                       //> res4: List[Int] = List(-4, 5, 7, 1)
  nums span (x=> x >0)                            //> res5: (List[Int], List[Int]) = (List(2),List(-4, 5, 7, 1))
  
  
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x::xs1 =>
    val(first, second)= xs span(y => y==x )
    first::pack(second)
    }                                             //> pack: [T](xs: List[T])List[List[T]]
    //case x::xs1 => xs1 takeWhile (y => y==x ) :: pack(xs1.dropWhile(y => y==x ))
  
  
  def encode[T](xs: List[T]): List[(T,Int)] = xs match {
    case Nil => Nil
    case x::xs1 =>
    val(first, second)= xs span(y => y==x )
    (x, first.length)::encode(second)
    pack(xs) map (ys=>(ys.head, ys.length))
  }                                               //> encode: [T](xs: List[T])List[(T, Int)]
  
  def concat[T](xs: List[T], ys: List[T]) : List[T] = (xs foldRight ys)(_::_)
                                                  //> concat: [T](xs: List[T], ys: List[T])List[T]
}