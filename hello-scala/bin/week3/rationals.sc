package week3

object rationals {
 val x= new Rational(1,3)                         //> x  : week3.Rational = 1/3
	val y= new Rational(5,15)                 //> y  : week3.Rational = 1/3
	val z = new Rational(3,2)                 //> z  : week3.Rational = 3/2
	x.sub(y).sub(z)                           //> res0: week3.Rational = 3/-2
	y.less(z)                                 //> res1: Boolean = true
	y.max(z)                                  //> res2: week3.Rational = 3/2
	x.sub(y)                                  //> res3: week3.Rational = 0/1
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