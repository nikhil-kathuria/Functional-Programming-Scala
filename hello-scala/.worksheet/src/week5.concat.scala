package week5

object concat {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(193); 
 def concat[T](xs:List[T], ys:List[T]): List[T] = xs match {
   case List() => ys
   //case z :: zs => concat(zs,z::ys)
   case z :: zs => z :: concat(zs,ys)
   };System.out.println("""concat: [T](xs: List[T], ys: List[T])List[T]""");$skip(34); 
 
 val first = List[Int](1,2,3,4);System.out.println("""first  : List[Int] = """ + $show(first ));$skip(33); 
 val second = List[Int](4,5,6,7);System.out.println("""second  : List[Int] = """ + $show(second ));$skip(46); 
 
 concat[Int](first, second) foreach println}
}
