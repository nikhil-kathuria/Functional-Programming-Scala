package week4


trait List[T] {
  def head: T
  def tail: List[T]
  def isEmpty: Boolean
}

object Nil[T] extends List[T] {
  def head = throw new java.util.NoSuchElementException("Head of Nil")
  def tail = throw new java.util.NoSuchElementException("Tail of Nil")
  def isEmpty = true
}

object List {
  println("Welcome to the Scala worksheet")
}
