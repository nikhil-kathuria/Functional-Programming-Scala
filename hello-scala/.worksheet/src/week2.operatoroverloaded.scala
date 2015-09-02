package week2

object operatoroverloaded {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  val x= new Rationalloaded(1,3);System.out.println("""x  : week2.Rationalloaded = """ + $show(x ));$skip(33); 
	val y= new Rationalloaded(5,15);System.out.println("""y  : week2.Rationalloaded = """ + $show(y ));$skip(33); 
	val z = new Rationalloaded(3,2);System.out.println("""z  : week2.Rationalloaded = """ + $show(z ));$skip(10); val res$0 = 
	x - y -z;System.out.println("""res0: week2.Rationalloaded = """ + $show(res$0));$skip(7); val res$1 = 
	y - z;System.out.println("""res1: week2.Rationalloaded = """ + $show(res$1));$skip(9); val res$2 = 
	y max z;System.out.println("""res2: week2.Rationalloaded = """ + $show(res$2));$skip(7); val res$3 = 
	x - y;System.out.println("""res3: week2.Rationalloaded = """ + $show(res$3))}
}
	class Rationalloaded(x: Int, y: Int){
	private def gcd(a:Int, b:Int): Int= if (b==0) a else gcd(b,a%b)
	  require(y!=0, "Denominatero has to be non zero value")
	  
	  def this(x:Int)= this(x,1)
		def numer=x
		def denom=y
		
		def + (other: Rationalloaded)=
			new Rationalloaded(numer*other.denom + other.numer*denom,
			denom*other.denom)
			
		def unary_- :Rationalloaded =new Rationalloaded(-numer,denom)
		
		def - (other: Rationalloaded)=this + - other
		
		def < (other: Rationalloaded)= this.numer*other.denom < other.numer*this.denom
			
		def max(other: Rationalloaded)= if (this < other) other else this
		
		
		override def toString ={
		val g = gcd (numer,denom)
		numer/g + "/" + denom/g
		}
}
