package week6

object pairs {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(106); 
def isPrime(value: Int): Boolean = (2 until value) forall (x => value%x!=0 );System.out.println("""isPrime: (value: Int)Boolean""");$skip(11); 
  val n =7;System.out.println("""n  : Int = """ + $show(n ));$skip(105); val res$0 = 
  (1 until n) flatMap (i =>
  (1 until i) map (j =>(i,j))) filter (pair =>
  isPrime(pair._1 + pair._2));System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0));$skip(91); val res$1 = 
   
   for {
     i <- 1 until n
     j <- 1 until i
     if isPrime(i+j)
   } yield (i,j);System.out.println("""res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$1))}
}
