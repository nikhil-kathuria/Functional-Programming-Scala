package week6

object isprime {
  def prime(value: Int): Boolean = (2 to (value-1)) forall (x => !(value%x==0) )
                                                  //> prime: (value: Int)Boolean
   //def prime(value: Int): Boolean = (2 until value) forall (x => value%x!=0 )
  prime(48)                                       //> res0: Boolean = false
}