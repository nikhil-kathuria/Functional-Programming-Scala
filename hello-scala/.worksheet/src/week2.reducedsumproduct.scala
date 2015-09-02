package week2

object reducedsumproduct {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(198); 
	def mapreduce(f: Int => Int, combine: (Int,Int) => Int, zero: Int)(a:Int, b:Int): Int=
	if(a>b)
	zero
	else
	combine(f(a),mapreduce(f,combine,zero)(a+1,b));System.out.println("""mapreduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(81); 
	def product(f: Int => Int)(a:Int, b: Int): Int = mapreduce(f,(x,y)=>x*y,1)(a,b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(150); 
	
  /**def product(f: Int => Int)(a:Int, b: Int): Int =
  if (a>b)
  1
  else
 f(a) * product(f)(a+1,b)
 **/
 def fact(n: Int) = product(x => x)(1,n);System.out.println("""fact: (n: Int)Int""");$skip(21); val res$0 = 
product(x=>x*x)(3,5);System.out.println("""res0: Int = """ + $show(res$0));$skip(8); val res$1 = 
fact(5);System.out.println("""res1: Int = """ + $show(res$1))}
}
