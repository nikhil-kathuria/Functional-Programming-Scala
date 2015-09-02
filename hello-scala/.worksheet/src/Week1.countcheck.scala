package Week1

object countcheck {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(371); 
   def countCheck(xs: List[Int], number: Int): Int = {
  	//val maxcount=0
  	def subCount(sc: List[Int], maxcount: Int, number:Int): Int ={
     if (sc.isEmpty) maxcount
     else
     	if (sc.head==number)
     	subCount(sc.tail,maxcount+1,number)
     	else
     	subCount(sc.tail,maxcount,number)
    }
    subCount(xs,0,number)
  };System.out.println("""countCheck: (xs: List[Int], number: Int)Int""");$skip(38); val res$0 = 
  countCheck(List(2,3,2,5,4,3,5,2),2);System.out.println("""res0: Int = """ + $show(res$0))}
}
