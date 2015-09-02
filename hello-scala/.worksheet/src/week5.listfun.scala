package week5

object listfun {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(61); 
  val nums = List(2,-4,5,7,1);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(54); 
  val fruits = List("Apple","Banana","Orange","Kiwi");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(47); 
  val data = List("a","a","a","b","c","c","a");System.out.println("""data  : List[String] = """ + $show(data ));$skip(28); val res$0 = 
  
  nums filter (x=> x >0);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(27); val res$1 = 
  nums filterNot (x=> x>0);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(28); val res$2 = 
  nums partition (x=> x >0);System.out.println("""res2: (List[Int], List[Int]) = """ + $show(res$2));$skip(31); val res$3 = 
  
  nums takeWhile (x=> x >0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(28); val res$4 = 
  nums dropWhile (x=> x >0);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(23); val res$5 = 
  nums span (x=> x >0);System.out.println("""res5: (List[Int], List[Int]) = """ + $show(res$5));$skip(174); 
  
  
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x::xs1 =>
    val(first, second)= xs span(y => y==x )
    first::pack(second)
    };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(315); 
    //case x::xs1 => xs1 takeWhile (y => y==x ) :: pack(xs1.dropWhile(y => y==x ))
  
  
  def encode[T](xs: List[T]): List[(T,Int)] = xs match {
    case Nil => Nil
    case x::xs1 =>
    val(first, second)= xs span(y => y==x )
    (x, first.length)::encode(second)
    pack(xs) map (ys=>(ys.head, ys.length))
  };System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(81); 
  
  def concat[T](xs: List[T], ys: List[T]) : List[T] = (xs foldRight ys)(_::_);System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""")}
}
