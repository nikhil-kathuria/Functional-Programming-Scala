package week3

object intsets {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val t1 = new Empty                              //> t1  : week3.Empty = .
  val t2 = new NonEmpty(3,new Empty,new Empty)    //> t2  : week3.NonEmpty = {.3.}
  val t3 = t2 incl 4                              //> t3  : week3.IntSet = {.3{.4.}}
  val t4 = t3 incl 6                              //> t4  : week3.IntSet = {.3{.4{.6.}}}
  t4 union t3                                     //> res0: week3.IntSet = {.3{.4{.6.}}}
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
  
}

class Empty extends IntSet {
  def contains(x :Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
  def union(other: IntSet) = other
  override def toString = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int):
   Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  def incl(x: Int): IntSet =
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
    def union(other: IntSet): IntSet =
    (( left union right ) union other) incl(elem)
    override def toString = "{"+left+ elem +right+"}"
}