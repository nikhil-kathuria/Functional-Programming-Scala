package week2

object productinterval {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(138); 
  def product(f: Int => Int)(a:Int, b: Int): Int =
  if (a>b)
  1
  else
 f(a) * product(f)(a+1,b);System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(41); 
 def fact(n: Int) = product(x => x)(1,n);System.out.println("""fact: (n: Int)Int""");$skip(21); val res$0 = 
product(x=>x*x)(3,5);System.out.println("""res0: Int = """ + $show(res$0));$skip(8); val res$1 = 
fact(5);System.out.println("""res1: Int = """ + $show(res$1))}
}
