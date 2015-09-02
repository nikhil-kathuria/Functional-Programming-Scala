package week6

import scala.io.Source

object anagrams {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(257); 
//val in = Source.fromURL("http://http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/linuxwords.txt")
  
  val itr = Source.fromFile("/home/igot/Downloads/Scala/Week6/dictionary.txt");System.out.println("""itr  : scala.io.BufferedSource = """ + $show(itr ));$skip(87); 
  val words = itr.getLines.toList filter ( word => word forall (chr => chr.isLetter) );System.out.println("""words  : List[String] = """ + $show(words ));$skip(162); 
  
   
  val mnem:Map[Char, String] = Map(
  '2' -> "ABC", '3' ->"DEF", '4' -> "GHI", '5' -> "JKL",
  '6' -> "MNO", '7' ->"PQRS", '8' -> "TUV", '9' -> "WXYZ"
  );System.out.println("""mnem  : Map[Char,String] = """ + $show(mnem ));$skip(99); 
  
  val charCode: Map[Char, Char] =
    for ((digit, str) <- mnem; ltr <- str) yield ltr -> digit;System.out.println("""charCode  : Map[Char,Char] = """ + $show(charCode ));$skip(72); 
  
  def wordCode(word: String): String = word.toUpperCase map charCode;System.out.println("""wordCode: (word: String)String""");$skip(24); val res$0 = 
  
    wordCode("Java");System.out.println("""res0: String = """ + $show(res$0));$skip(99); 
  
  val wordsForNum: Map[String, Seq[String]] =
    words groupBy wordCode withDefaultValue Seq();System.out.println("""wordsForNum  : Map[String,Seq[String]] = """ + $show(wordsForNum ));$skip(263); 
 def encode(number: String): Set[List[String]] =
   if (number.isEmpty) Set(List())
   else {
     for {
       split <- 1 to number.length
       word  <- wordsForNum(number take split)
       rest <- encode(number drop split)
     } yield word::rest
   }.toSet;System.out.println("""encode: (number: String)Set[List[String]]""");$skip(122); 
   
   //encode("72225247386")
   
  def translate(number: String): Set[String] =
    encode(number) map (_ mkString " ");System.out.println("""translate: (number: String)Set[String]""");$skip(45); val res$1 = 
               
    translate("72225247386");System.out.println("""res1: Set[String] = """ + $show(res$1))}
}
     