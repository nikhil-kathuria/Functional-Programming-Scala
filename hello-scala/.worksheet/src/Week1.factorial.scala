package Week1

object factorial {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(218); 

 def fact(number: Int): Int ={
   def interFact(curval:Int, decval:Int):Int= {
   if(decval==0)
   	curval
   else
   	interFact(curval*decval,decval-1)
   }
   interFact(1,number)
 };System.out.println("""fact: (number: Int)Int""");$skip(10); val res$0 = 
 
fact(4);System.out.println("""res0: Int = """ + $show(res$0))}
}
