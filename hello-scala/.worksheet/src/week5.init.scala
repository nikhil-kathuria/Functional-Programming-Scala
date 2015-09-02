package week5

object init {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(189); 
  def init[T](xs: List[T]): List[T] = xs match {
  case List() => throw new Error("init of empty list")
  case List(x) => List()
  case y::ys => y::init(ys)
  };System.out.println("""init: [T](xs: List[T])List[T]""")}
}
