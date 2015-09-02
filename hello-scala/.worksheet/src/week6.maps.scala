package week6

object maps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
 val romanNumerals = Map("I" -> 1, "V" -> 5, "X" -> 10);System.out.println("""romanNumerals  : scala.collection.immutable.Map[String,Int] = """ + $show(romanNumerals ));$skip(77); 
 
 val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern");System.out.println("""capitalOfCountry  : scala.collection.immutable.Map[String,String] = """ + $show(capitalOfCountry ));$skip(26); val res$0 = 
 
 capitalOfCountry("US");System.out.println("""res0: String = """ + $show(res$0));$skip(32); val res$1 = 
 capitalOfCountry get "andorra";System.out.println("""res1: Option[String] = """ + $show(res$1))}
}
