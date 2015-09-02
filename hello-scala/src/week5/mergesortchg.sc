package week5
import math.Ordering


object mergesortchg1 {
    def msort[T](xs: List[T])(lt: (T,T)=> Boolean): List[T] = {
    val n =xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x::xs1, y::ys1) =>
          if (lt(x,y)) x::merge(xs1,ys)
          else y :: merge(xs,ys1)
      }
      val (fst, snd) = xs splitAt n
      merge(msort(fst)(lt),msort(snd)(lt))
    }
  }                                               //> msort: [T](xs: List[T])(lt: (T, T) => Boolean)List[T]
  val nums = List(2,-4,5,7,1)                     //> nums  : List[Int] = List(2, -4, 5, 7, 1)
  val fruits = List("Apple","Banana","Orange","Kiwi")
                                                  //> fruits  : List[String] = List(Apple, Banana, Orange, Kiwi)
  msort(nums)((x: Int, y: Int)=> x>y)             //> res0: List[Int] = List(7, 5, 2, 1, -4)
  msort(fruits)((x: String, y: String)=>x.compareTo(y)< 0 )
                                                  //> res1: List[String] = List(Apple, Banana, Kiwi, Orange)
}


object mergesortchg2 {
    def msort[T](xs: List[T])(lt: (T,T)=> Boolean): List[T] = {
    val n =xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x::xs1, y::ys1) =>
          if (lt(x,y)) x::merge(xs1,ys)
          else y :: merge(xs,ys1)
      }
      val (fst, snd) = xs splitAt n
      merge(msort(fst)(lt),msort(snd)(lt))
    }
  }
  val nums = List(2,-4,5,7,1)
  val fruits = List("Apple","Banana","Orange","Kiwi")
  msort(nums)((x: Int, y: Int)=> x>y)
  msort(fruits)((x: String, y: String)=>x.compareTo(y)< 0 )
}



object mergesortchg3 {
    def msort[T](xs: List[T])(ord: Ordering[T]): List[T] = {
    val n =xs.length / 2
    if (n == 0) xs
    else {
      def merge(xs: List[T], ys: List[T]): List[T] = (xs, ys) match {
        case (Nil, ys) => ys
        case (xs, Nil) => xs
        case (x::xs1, y::ys1) =>
          if (ord.lt(x,y)) x::merge(xs1,ys)
          else y :: merge(xs,ys1)
      }
      val (fst, snd) = xs splitAt n
      merge(msort(fst)(ord),msort(snd)(ord))
    }
  }
  val nums = List(2,-4,5,7,1)
  val fruits = List("Apple","Banana","Orange","Kiwi")
  msort(nums)(Ordering.Int)
  msort(fruits)(Ordering.String)
 }