package week2

import math.abs

object fixedpointsqr {
 val tolerance = 0.0001                           //> tolerance  : Double = 1.0E-4
 def isCloseEnough(x: Double, y: Double) =
   abs((x - y) / x) / x < tolerance               //> isCloseEnough: (x: Double, y: Double)Boolean
 def fixedpoint(f: Double => Double)(firstGuess: Double)={
   def iterate(guess: Double): Double = {
     val next = f(guess)
     if (isCloseEnough(guess,next)) next
     else iterate(next)
   }
   iterate(firstGuess)
  }                                               //> fixedpoint: (f: Double => Double)(firstGuess: Double)Double
  fixedpoint(x =>1 + x / 2)(1)                    //> res0: Double = 1.999755859375
  def averageDamp(f: Double => Double)(x: Double)=(x + f(x))/2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double
  //def sqrt(x:Double)=fixedpoint(y => (y + (x/y)) / 2)(1)
    def sqrt(x:Double)=fixedpoint(averageDamp(y =>x/y))(1)
                                                  //> sqrt: (x: Double)Double
  sqrt(2)                                         //> res1: Double = 1.4142135623746899
}