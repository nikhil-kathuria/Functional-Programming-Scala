package week5

object removeat {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
 val fruit = List("apples","oranges","pears");System.out.println("""fruit  : List[String] = """ + $show(fruit ));$skip(24); 
 val nums = List(1,2,3);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(55); 
 val diag = List(List(1,0,0),List(0,1,0), List(0,0,1));System.out.println("""diag  : List[List[Int]] = """ + $show(diag ));$skip(20); 
 val empty = List();System.out.println("""empty  : List[Nothing] = """ + $show(empty ));$skip(72); 
 
 def removeAt(n: Int, xs: List[Int]) = (xs take n) ::: (xs drop n +1);System.out.println("""removeAt: (n: Int, xs: List[Int])List[Int]""")}
}
