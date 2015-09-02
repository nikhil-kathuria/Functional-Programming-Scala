package week2

import math.abs

object fxdpnt {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(71); 
 val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(79); 
 def isCloseEnough(x: Double, y: Double) =
   abs((x - y) / x) / x < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(223); 
 def fixedpoint(f: Double => Double)(firstGuess: Double)={
   def iterate(guess: Double): Double = {
     val next = f(guess)
     if (isCloseEnough(guess,next)) next
     else iterate(next)
   }
   iterate(firstGuess)
  };System.out.println("""fixedpoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(31); val res$0 = 
  fixedpoint(x =>1 + x / 2)(1);System.out.println("""res0: Double = """ + $show(res$0))}
}
