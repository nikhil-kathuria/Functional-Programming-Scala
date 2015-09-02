package week2

object operatoroverloaded {
  val x= new Rationalloaded(1,3)                  //> x  : week2.Rationalloaded = 1/3
	val y= new Rationalloaded(5,15)           //> y  : week2.Rationalloaded = 1/3
	val z = new Rationalloaded(3,2)           //> z  : week2.Rationalloaded = 3/2
	x - y -z                                  //> res0: week2.Rationalloaded = 3/-2
	y - z                                     //> res1: week2.Rationalloaded = 7/-6
	y max z                                   //> res2: week2.Rationalloaded = 3/2
	x - y                                     //> res3: week2.Rationalloaded = 0/1
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