package week4

abstract class Nat{
  def isZero: Boolean
  def predecessor: Nat
  def successor =  new Succ(this)
  def +(that: Nat): Nat
  def -(that: Nat) : Nat}

class Zero extends Nat{
  def isZero = true
  def predecessor = throw new Error("Zero's predecessor")
  def +(that: Nat) = that
  def -(that: Nat) =  if (that.isZero) that else throw new Error("Zero's predecessor")
  }

class Succ(n: Nat) extends Nat{
  def isZero = false
  def predecessor =n
  def +(that: Nat)= new Succ(n + that)
  def -(that: Nat) = if (that.isZero) that else n - that.predecessor
}


object Nat {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(627); 
  println("Welcome to the Scala worksheet")}
}
