package week6

object isprime {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(112); 
  def prime(value: Int): Boolean = (2 to (value-1)) forall (x => !(value%x==0) );System.out.println("""prime: (value: Int)Boolean""");$skip(92); val res$0 = 
   //def prime(value: Int): Boolean = (2 until value) forall (x => value%x!=0 )
  prime(48);System.out.println("""res0: Boolean = """ + $show(res$0))}
}
