package week5

object removeat {
 val fruit = List("apples","oranges","pears")     //> fruit  : List[String] = List(apples, oranges, pears)
 val nums = List(1,2,3)                           //> nums  : List[Int] = List(1, 2, 3)
 val diag = List(List(1,0,0),List(0,1,0), List(0,0,1))
                                                  //> diag  : List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
 val empty = List()                               //> empty  : List[Nothing] = List()
 
 def removeAt(n: Int, xs: List[Int]) = (xs take n) ::: (xs drop n +1)
                                                  //> removeAt: (n: Int, xs: List[Int])List[Int]
}