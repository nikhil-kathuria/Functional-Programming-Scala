package week7

object streamrange {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(184); 
  def streamRange(lo: Int, hi: Int): Stream[Int] = {
  print(lo+"")
  if (lo >= hi) Stream.empty
  else Stream.cons(lo, streamRange(lo + 1, hi))
  };System.out.println("""streamRange: (lo: Int, hi: Int)Stream[Int]""");$skip(40); val res$0 = 
  
 streamRange(1, 1000).take(3).toList;System.out.println("""res0: List[Int] = """ + $show(res$0))}
}
