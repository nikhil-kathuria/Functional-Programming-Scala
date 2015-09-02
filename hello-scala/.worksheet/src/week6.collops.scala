package week6

object collops {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(58); 
  val xs = Array(1,2,3,44);System.out.println("""xs  : Array[Int] = """ + $show(xs ));$skip(19); val res$0 = 
  xs map(x => x*2);System.out.println("""res0: Array[Int] = """ + $show(res$0));$skip(27); 
  
  val s = "Hello World";System.out.println("""s  : String = """ + $show(s ));$skip(27); val res$1 = 
  s filter (c=> c.isUpper);System.out.println("""res1: String = """ + $show(res$1));$skip(27); val res$2 = 
  s exists (c=> c.isUpper);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(27); val res$3 = 
  s forall (c=> c.isUpper);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(35); 
  
  val pairs = List(1,2,3) zip s;System.out.println("""pairs  : List[(Int, Char)] = """ + $show(pairs ));$skip(14); val res$4 = 
  pairs.unzip;System.out.println("""res4: (List[Int], List[Char]) = """ + $show(res$4))}
  
}
