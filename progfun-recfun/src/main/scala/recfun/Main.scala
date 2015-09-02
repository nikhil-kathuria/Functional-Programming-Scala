package recfun
import common._

object Main {
  /**def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }*/

  /**
   * Exercise 1
   */
 def pascal(c: Int, r: Int): Int = {
   if((c <= -1) || (c>r))
  	 0
   else if((c == 0) && (r == 0))
  	 1
   else
     pascal(c-1,r-1) + pascal(c,r-1)
  }                                   

  /**
   * Exercise 2
   */
 def balance(chars: List[Char]): Boolean ={
   def counter(left: List[Char], weight: Int): Int ={
   	  if(left.isEmpty)
   		weight
   	  else if(weight<0)
   		-1
   	  else if (left.head.toString=="(")
   		counter(left.tail,weight+1)
   	  else if (left.head.toString==")")
	  	counter(left.tail,weight-1)
	  else
	  	counter(left.tail,weight)
	}
  (counter(chars,0)==0)
 }
 
  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int ={
  	def counter(money: Int, coins: List[Int], count:Int): Int ={
	  if(coins.isEmpty)
		  0
  	  else if (money==0)
  		  1
  	  else if (money<1)
  		  0
  	  else
	counter(money-coins.head,coins,count) + counter(money,coins.tail,count)
  	}
  counter(money,coins,0)
  }
}
