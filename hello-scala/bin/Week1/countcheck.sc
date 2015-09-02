package Week1

object countcheck {
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
  }                                               //> countCheck: (xs: List[Int], number: Int)Int
  countCheck(List(2,3,2,5,4,3,5,2),2)             //> res0: Int = 3
}