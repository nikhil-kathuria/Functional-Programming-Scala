package week2
/**
 * 2. Purely Functional Sets.
 */
object FunSets {
  /**
   * We represent a set by its characteristic function, i.e.
   * its `contains` predicate.
   */
  type Set = Int => Boolean;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(320); 
  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem);System.out.println("""contains: (s: Int => Boolean, elem: Int)Boolean""");$skip(108); 
  /**
   * Returns the set of the one given element.
   */
  def singletonSet(elem: Int): Set = x=> x==elem;System.out.println("""singletonSet: (elem: Int)Int => Boolean""");$skip(194); 
   
  /**
   * Returns the union of the two given sets,
   * the sets of all elements that are in either `s` or `t`.
   */
  def union(s: Set, t: Set): Set = x => contains(s,x) || contains(t,x);System.out.println("""union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(199); 
  /**
   * Returns the intersection of the two given sets,
   * the set of all elements that are both in `s` and `t`.
   */
  def intersect(s: Set, t: Set): Set = x => contains(s,x) && contains(t,x);System.out.println("""intersect: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(194); 
  /**
   * Returns the difference of the two given sets,
   * the set of all elements of `s` that are not in `t`.
   */
  def diff(s: Set, t: Set): Set =  x => (contains(s,x) && !contains(t,x));System.out.println("""diff: (s: Int => Boolean, t: Int => Boolean)Int => Boolean""");$skip(146); 
  /**
   * Returns the subset of `s` for which `p` holds.
   */
  def filter(s: Set, p: Int => Boolean): Set =  intersect(x => (contains(p,x)),s);System.out.println("""filter: (s: Int => Boolean, p: Int => Boolean)Int => Boolean""");$skip(87); 
  /**
   * The bounds for `forall` and `exists` are +/- 1000.
   */
  val bound = 1000;System.out.println("""bound  : Int = """ + $show(bound ));$skip(403); 
  /**
   * Returns whether all bounded integers within `s` satisfy `p`.
   */
  def forall(s: Set, p: Int => Boolean): Boolean = {
    def iter(a: Int): Boolean = {
    /**
    if (contains(diff(x => p(x),s),a)) false
    else if ( a>= 1000 ) true
      else iter(a+1)**/
      if ( !contains(s,a) && contains(p,a) ) false
      else if ( a>= 1000 ) true
      else iter(a+1)
    }
    iter(-bound)
  };System.out.println("""forall: (s: Int => Boolean, p: Int => Boolean)Boolean""");$skip(176); 
  
  /**
   * Returns whether there exists a bounded integer within `s`
   * that satisfies `p`.
   */
  def exists(s: Set, p: Int => Boolean): Boolean = !forall(x=>(!s(x)),p);System.out.println("""exists: (s: Int => Boolean, p: Int => Boolean)Boolean""");$skip(151); 
  
  /**
   * Returns a set transformed by applying `f` to each element of `s`.
   */
  def map(s: Set, f: Int => Int): Set = x=> exists(s,y=>f(y)==x);System.out.println("""map: (s: Int => Boolean, f: Int => Int)Int => Boolean""");$skip(184); 
  /**
   * Displays the contents of a set
   */
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  };System.out.println("""toString: (s: Int => Boolean)String""");$skip(116); 
  /**
   * Prints the contents of a set on the console.
   */
  def printSet(s: Set) {
    println(toString(s))
  };System.out.println("""printSet: (s: Int => Boolean)Unit""");$skip(64); 
  
def boundedSet(m: Int, n: Int): Set =  x => x >= m && x <= n;System.out.println("""boundedSet: (m: Int, n: Int)Int => Boolean""");$skip(39); 
def inftSet(v: Int): Set = x => x <= v;System.out.println("""inftSet: (v: Int)Int => Boolean""");$skip(52); 
def arbitrarySet(i: Int*): Set = x => i.contains(x);System.out.println("""arbitrarySet: (i: Int*)Int => Boolean""");$skip(29); 
val emptyset :Set= x=> false;System.out.println("""emptyset  : Int => Boolean = """ + $show(emptyset ));$skip(44); 
val onetoten : Set= arbitrarySet(1,2,3,4,5);System.out.println("""onetoten  : Int => Boolean = """ + $show(onetoten ));$skip(38); 
val minusplus=boundedSet(-1000,10001);System.out.println("""minusplus  : Int => Boolean = """ + $show(minusplus ));$skip(27); 
val lessfive=inftSet(1000);System.out.println("""lessfive  : Int => Boolean = """ + $show(lessfive ));$skip(23); val res$0 = 
 
contains(emptyset,5);System.out.println("""res0: Boolean = """ + $show(res$0));$skip(26); val res$1 = 
toString(singletonSet(4));System.out.println("""res1: String = """ + $show(res$1));$skip(78); val res$2 = 
//toString(union(onetoten,minusplus))
toString(intersect(onetoten,minusplus));System.out.println("""res2: String = """ + $show(res$2));$skip(35); val res$3 = 
toString(diff(onetoten,minusplus));System.out.println("""res3: String = """ + $show(res$3));$skip(37); val res$4 = 
toString(filter(onetoten,minusplus));System.out.println("""res4: String = """ + $show(res$4));$skip(42); val res$5 = 
contains(intersect(onetoten,minusplus),0);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(81); val res$6 = 

//forall(minusplus,lessfive)
forall(x => (x == -1000 || x == 0 ),x => x < 1000);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(32); val res$7 = 

toString(map(onetoten,x=> -x));System.out.println("""res7: String = """ + $show(res$7));$skip(25); val res$8 = 
forall(x=>false,x=>true);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(26); val res$9 = 
forall(x=>false,x=>false);System.out.println("""res9: Boolean = """ + $show(res$9))}
}
