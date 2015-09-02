package week6

import scala.io.Source

object anagrams {
//val in = Source.fromURL("http://http://lamp.epfl.ch/files/content/sites/lamp/files/teaching/progfun/linuxwords.txt")
  
  val itr = Source.fromFile("/home/igot/Downloads/Scala/Week6/dictionary.txt")
                                                  //> itr  : scala.io.BufferedSource = non-empty iterator
  val words = itr.getLines.toList filter ( word => word forall (chr => chr.isLetter) )
                                                  //> words  : List[String] = List(Aarhus, Aaron, Ababa, aback, abaft, abandon, ab
                                                  //| andoned, abandoning, abandonment, abandons, abase, abased, abasement, abasem
                                                  //| ents, abases, abash, abashed, abashes, abashing, abasing, abate, abated, aba
                                                  //| tement, abatements, abater, abates, abating, Abba, abbe, abbey, abbeys, abbo
                                                  //| t, abbots, Abbott, abbreviate, abbreviated, abbreviates, abbreviating, abbre
                                                  //| viation, abbreviations, Abby, abdomen, abdomens, abdominal, abduct, abducted
                                                  //| , abductio
                                                  //| Output exceeds cutoff limit.
  
   
  val mnem:Map[Char, String] = Map(
  '2' -> "ABC", '3' ->"DEF", '4' -> "GHI", '5' -> "JKL",
  '6' -> "MNO", '7' ->"PQRS", '8' -> "TUV", '9' -> "WXYZ"
  )                                               //> mnem  : Map[Char,String] = Map(8 -> TUV, 4 -> GHI, 9 -> WXYZ, 5 -> JKL, 6 ->
                                                  //|  MNO, 2 -> ABC, 7 -> PQRS, 3 -> DEF)
  
  val charCode: Map[Char, Char] =
    for ((digit, str) <- mnem; ltr <- str) yield ltr -> digit
                                                  //> charCode  : Map[Char,Char] = Map(E -> 3, X -> 9, N -> 6, T -> 8, Y -> 9, J -
                                                  //| > 5, U -> 8, F -> 3, A -> 2, M -> 6, I -> 4, G -> 4, V -> 8, Q -> 7, L -> 5,
                                                  //|  B -> 2, P -> 7, C -> 2, H -> 4, W -> 9, K -> 5, R -> 7, O -> 6, D -> 3, Z -
                                                  //| > 9, S -> 7)
  
  def wordCode(word: String): String = word.toUpperCase map charCode
                                                  //> wordCode: (word: String)String
  
    wordCode("Java")                              //> res0: String = 5282
  
  val wordsForNum: Map[String, Seq[String]] =
    words groupBy wordCode withDefaultValue Seq() //> wordsForNum  : Map[String,Seq[String]] = Map(63972278 -> List(newscast), 292
                                                  //| 37638427 -> List(cybernetics), 782754448 -> List(starlight), 2559464 -> List
                                                  //| (allying), 862532733 -> List(uncleared), 365692259 -> List(enjoyably), 86843
                                                  //| 7 -> List(unties), 33767833 -> List(deportee), 742533 -> List(picked), 33646
                                                  //| 46489 -> List(femininity), 3987267346279 -> List(extraordinary), 7855397 -> 
                                                  //| List(pulleys), 67846493 -> List(optimize), 4723837 -> List(grafter), 386583 
                                                  //| -> List(ev
                                                  //| Output exceeds cutoff limit.
 def encode(number: String): Set[List[String]] =
   if (number.isEmpty) Set(List())
   else {
     for {
       split <- 1 to number.length
       word  <- wordsForNum(number take split)
       rest <- encode(number drop split)
     } yield word::rest
   }.toSet                                        //> encode: (number: String)Set[List[String]]
   
   //encode("72225247386")
   
  def translate(number: String): Set[String] =
    encode(number) map (_ mkString " ")           //> translate: (number: String)Set[String]
               
    translate("72225247386")                      //> res1: Set[String] = Set(scab lag re to, scab lags fun, scab lair fun)
}
     