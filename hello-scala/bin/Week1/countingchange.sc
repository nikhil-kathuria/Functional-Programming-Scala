package Week1
 object countingchange {
  def countChange(money: Int, coins: List[Int]): Int={
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
  }                                               //> countChange: (money: Int, coins: List[Int])Int
 countChange(300,List(5,10,20,50,100,200,500))    //> res0: Int = 1022
}







/*object countingchange {
  def countChange(money: Int, coins: List[Int]): Int={
  	def counter(money: Int, coins: List[Int], count:Int): Int ={
	  if(coins.isEmpty)
  	1
  	else if (money-coins.head<0)
  	count
  	else
		counter(money-coins.head,coins,count) + counter(money,coins.tail,count)
  	}
 	counter(money,coins,0)
  }
 countChange(4,List(1,2))
}
*/