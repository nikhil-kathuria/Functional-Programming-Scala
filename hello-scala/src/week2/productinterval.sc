package week2

object productinterval {
  def product(f: Int => Int)(a:Int, b: Int): Int =
  if (a>b)
  1
  else
 f(a) * product(f)(a+1,b)                         //> product: (f: Int => Int)(a: Int, b: Int)Int
 def fact(n: Int) = product(x => x)(1,n)          //> fact: (n: Int)Int
product(x=>x*x)(3,5)                              //> res0: Int = 3600
fact(5)                                           //> res1: Int = 120
}