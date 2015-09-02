package week3

object intsets {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(21); 
  val t1 = new Empty;System.out.println("""t1  : week3.Empty = """ + $show(t1 ));$skip(47); 
  val t2 = new NonEmpty(3,new Empty,new Empty);System.out.println("""t2  : week3.NonEmpty = """ + $show(t2 ));$skip(21); 
  val t3 = t2 incl 4;System.out.println("""t3  : week3.IntSet = """ + $show(t3 ));$skip(21); 
  val t4 = t3 incl 6;System.out.println("""t4  : week3.IntSet = """ + $show(t4 ));$skip(14); val res$0 = 
  t4 union t3;System.out.println("""res0: week3.IntSet = """ + $show(res$0))}
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
