package week2

object reducedsumproduct {
	def mapreduce(f: Int => Int, combine: (Int,Int) => Int, zero: Int)(a:Int, b:Int): Int=
	if(a>b)
	zero
	else
	combine(f(a),mapreduce(f,combine,zero)(a+1,b))
                                                  //> mapreduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
	def product(f: Int => Int)(a:Int, b: Int): Int = mapreduce(f,(x,y)=>x*y,1)(a,b)
                                                  //> product: (f: Int => Int)(a: Int, b: Int)Int
	
  /**def product(f: Int => Int)(a:Int, b: Int): Int =
  if (a>b)
  1
  else
 f(a) * product(f)(a+1,b)
 **/
 def fact(n: Int) = product(x => x)(1,n)          //> fact: (n: Int)Int
product(x=>x*x)(3,5)                              //> res0: Int = 3600
fact(5)                                           //> res1: Int = 120
}