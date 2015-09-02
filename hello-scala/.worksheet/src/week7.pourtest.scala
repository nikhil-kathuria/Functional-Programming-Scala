package week7

object pourtest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  val problem = new Pouring(Vector(4,5,7));System.out.println("""problem  : week7.Pouring = """ + $show(problem ));$skip(16); val res$0 = 
  problem.moves;System.out.println("""res0: scala.collection.immutable.IndexedSeq[Product with Serializable with week7.pourtest.problem.Move] = """ + $show(res$0));$skip(34); val res$1 = 
  problem.pathSets.take(3).toList;System.out.println("""res1: List[Set[week7.pourtest.problem.Path]] = """ + $show(res$1))}
}
