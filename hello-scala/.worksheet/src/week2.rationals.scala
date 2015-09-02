package week2

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(117); 
	//val n=new Rational(3,4)
	//val m= new Rational(-11,14)
	val x= new Rational(1,3);System.out.println("""x  : week2.Rational = """ + $show(x ));$skip(27); 
	val y= new Rational(5,15);System.out.println("""y  : week2.Rational = """ + $show(y ));$skip(27); 
	val z = new Rational(3,2);System.out.println("""z  : week2.Rational = """ + $show(z ));$skip(17); val res$0 = 
	x.sub(y).sub(z);System.out.println("""res0: week2.Rational = """ + $show(res$0));$skip(11); val res$1 = 
	y.less(z);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(10); val res$2 = 
	y.max(z);System.out.println("""res2: week2.Rational = """ + $show(res$2));$skip(10); val res$3 = 
	x.sub(y);System.out.println("""res3: week2.Rational = """ + $show(res$3))}
}
	class Rational(x: Int, y: Int){
	private def gcd(a:Int, b:Int): Int= if (b==0) a else gcd(b,a%b)
	  require(y!=0, "Denominatero has to be non zero value")
	  
	  def this(x:Int)= this(x,1)
		def numer=x
		def denom=y
		
		def add(other: Rational)=
			new Rational(numer*other.denom + other.numer*denom,
			denom*other.denom)
			
		def neg=new Rational(-numer,denom)
		
		def sub(other: Rational)=add(other.neg)
		
		def less(other: Rational)= numer*other.denom < other.numer*denom
			
		def max(other: Rational)= if (this.less(other)) other else this
		
		
		override def toString ={
		val g = gcd (numer,denom)
		numer/g + "/" + denom/g
		}
}
