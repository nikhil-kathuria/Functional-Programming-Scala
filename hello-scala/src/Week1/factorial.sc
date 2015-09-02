package Week1

object factorial {

 def fact(number: Int): Int ={
   def interFact(curval:Int, decval:Int):Int= {
   if(decval==0)
   	curval
   else
   	interFact(curval*decval,decval-1)
   }
   interFact(1,number)
 }                                                //> fact: (number: Int)Int
 
fact(4)                                           //> res0: Int = 24
}