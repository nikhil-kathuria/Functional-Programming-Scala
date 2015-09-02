package week5

object init {
  def init[T](xs: List[T]): List[T] = xs match {
  case List() => throw new Error("init of empty list")
  case List(x) => List()
  case y::ys => y::init(ys)
  }                                               //> init: [T](xs: List[T])List[T]
}