package week2

object Assigment {
 type Set = Int => Boolean;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(181); 

  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: Int => Boolean, elem: Int)Boolean""");$skip(107); 
  /**
   * Returns the set of the one given element.
   */
  def singletonSet(elem: Int): Set = x=>x==elem;System.out.println("""singletonSet: (elem: Int)Int => Boolean""");$skip(223); 
  	//def returnSet(x => x=elem)
  	/**
   * Returns the union of the two given sets,
   * the sets of all elements that are in either `s` or `t`.
   */
  def union(s: Set, t: Set): Set = x => contains(s,x) && contains(t,x);System.out.println("""union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(199); 
  /**
   * Returns the intersection of the two given sets,
   * the set of all elements that are both in `s` and `t`.
   */
  def intersect(s: Set, t: Set): Set = x => contains(s,x) || contains(t,x);System.out.println("""intersect: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(233); 
  /**
   * Returns the difference of the two given sets,
   * the set of all elements of `s` that are not in `t`.
   */
  def diff(s: Set, t: Set): Set =  x => (contains(s,x) || !contains(t,x)) &&
  (!contains(s,x) || contains(t,x));System.out.println("""diff: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(147); 
  /**
   * Returns the subset of `s` for which `p` holds.
   */
  def filter(s: Set, p: Int => Boolean): Set =  intersect(p => !(contains(s,p)),s);System.out.println("""filter: (s: Int => Boolean, p: Int => Boolean)Int => Boolean""");$skip(87); 
  /**
   * The bounds for `forall` and `exists` are +/- 1000.
   */
  val bound = 1000;System.out.println("""bound  : Int = """ + $show(bound ));$skip(340); 
  /**
   * Returns whether all bounded integers within `s` satisfy `p`.
   */
  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
    println(a)
      if (contains(s,a) && contains(p,a) && a==1000) true
      else if (!contains(s,a) && contains(p,a)) false
      else iter(a+1)
    }
    iter(-bound)
  };System.out.println("""forall: (s: Int => Boolean, p: Int => Boolean)Boolean""");$skip(166); 
  /**
   * Returns whether there exists a bounded integer within `s`
   * that satisfies `p`.
   */
  def exists(s: Set, p: Int => Boolean): Boolean = (!forall(s,p));System.out.println("""exists: (s: Int => Boolean, p: Int => Boolean)Boolean""");$skip(127); 
  /**
   * Returns a set transformed by applying `f` to each element of `s`.
   */
  def map(s: Set, f: Int => Int): Set = ???;System.out.println("""map: (s: Int => Boolean, f: Int => Int)Int => Boolean""");$skip(13); 
  
  val x=5;System.out.println("""x  : Int = """ + $show(x ));$skip(10); 
  val y=6;System.out.println("""y  : Int = """ + $show(y ));$skip(19); val res$0 = 
  (x==5) && (y==6);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(19); val res$1 = 
  (x==5) && (y==7);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(18); val res$2 = 
	(x==6) && (y==6);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(18); val res$3 = 
	(x==3) && (y==2);System.out.println("""res3: Boolean = """ + $show(res$3))}
//contains(singletonSet(5) ,4)
//singletonSet(4)
//forall(x=>false,x=>true)
//forall(x=>false,x=>false)
//forall(x=>true,x=>true)
//forall(x=>true,x=>false)
}
