package Week1

object balancer {
   def balance(chars: List[Char]): Boolean = {
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
	if(counter(chars,0)==0)
		true
	else
		false
  }                                               //> balance: (chars: List[Char])Boolean
  balance("(()()()()-asdasda sdo-9-9-0asd 9)example".toList)
                                                  //> res0: Boolean = true
}