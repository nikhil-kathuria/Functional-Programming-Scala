package week5

object reverse {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(149); 
  def reverse[T](xs:List[T]): List[T] = xs match {
   case List() => xs
   case z :: zs => reverse(zs):::List(z)
   };System.out.println("""reverse: [T](xs: List[T])List[T]""");$skip(33); 
  val first = List[Int](1,2,3,4);System.out.println("""first  : List[Int] = """ + $show(first ));$skip(22); val res$0 = 
  reverse[Int](first);System.out.println("""res0: List[Int] = """ + $show(res$0))}
}
