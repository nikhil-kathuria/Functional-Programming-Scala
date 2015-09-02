package Week1

object balancer {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(429); 
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
  };System.out.println("""balance: (chars: List[Char])Boolean""");$skip(61); val res$0 = 
  balance("(()()()()-asdasda sdo-9-9-0asd 9)example".toList);System.out.println("""res0: Boolean = """ + $show(res$0))}
}
