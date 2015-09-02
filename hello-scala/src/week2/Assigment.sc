package week2
/**
 * 2. Purely Functional Sets.
 */
object FunSets {
  /**
   * We represent a set by its characteristic function, i.e.
   * its `contains` predicate.
   */
  type Set = Int => Boolean
  /**
   * Indicates whether a set contains a given element.
   */
  def contains(s: Set, elem: Int): Boolean = s(elem)
                                                  //> contains: (s: Int => Boolean, elem: Int)Boolean
  /**
   * Returns the set of the one given element.
   */
  def singletonSet(elem: Int): Set = x=> x==elem  //> singletonSet: (elem: Int)Int => Boolean
   
  /**
   * Returns the union of the two given sets,
   * the sets of all elements that are in either `s` or `t`.
   */
  def union(s: Set, t: Set): Set = x => contains(s,x) || contains(t,x)
                                                  //> union: (s: Int => Boolean, t: Int => Boolean)Int => Boolean
  /**
   * Returns the intersection of the two given sets,
   * the set of all elements that are both in `s` and `t`.
   */
  def intersect(s: Set, t: Set): Set = x => contains(s,x) && contains(t,x)
                                                  //> intersect: (s: Int => Boolean, t: Int => Boolean)Int => Boolean
  /**
   * Returns the difference of the two given sets,
   * the set of all elements of `s` that are not in `t`.
   */
  def diff(s: Set, t: Set): Set =  x => (contains(s,x) && !contains(t,x))
                                                  //> diff: (s: Int => Boolean, t: Int => Boolean)Int => Boolean
  /**
   * Returns the subset of `s` for which `p` holds.
   */
  def filter(s: Set, p: Int => Boolean): Set =  intersect(x => (contains(p,x)),s)
                                                  //> filter: (s: Int => Boolean, p: Int => Boolean)Int => Boolean
  /**
   * The bounds for `forall` and `exists` are +/- 1000.
   */
  val bound = 1000                                //> bound  : Int = 1000
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
  }                                               //> forall: (s: Int => Boolean, p: Int => Boolean)Boolean
  
  /**
   * Returns whether there exists a bounded integer within `s`
   * that satisfies `p`.
   */
  def exists(s: Set, p: Int => Boolean): Boolean = !forall(x=>(!s(x)),p)
                                                  //> exists: (s: Int => Boolean, p: Int => Boolean)Boolean
  
  /**
   * Returns a set transformed by applying `f` to each element of `s`.
   */
  def map(s: Set, f: Int => Int): Set = x=> exists(s,y=>f(y)==x)
                                                  //> map: (s: Int => Boolean, f: Int => Int)Int => Boolean
  /**
   * Displays the contents of a set
   */
  def toString(s: Set): String = {
    val xs = for (i <- -bound to bound if contains(s, i)) yield i
    xs.mkString("{", ",", "}")
  }                                               //> toString: (s: Int => Boolean)String
  /**
   * Prints the contents of a set on the console.
   */
  def printSet(s: Set) {
    println(toString(s))
  }                                               //> printSet: (s: Int => Boolean)Unit
  
def boundedSet(m: Int, n: Int): Set =  x => x >= m && x <= n
                                                  //> boundedSet: (m: Int, n: Int)Int => Boolean
def inftSet(v: Int): Set = x => x <= v            //> inftSet: (v: Int)Int => Boolean
def arbitrarySet(i: Int*): Set = x => i.contains(x)
                                                  //> arbitrarySet: (i: Int*)Int => Boolean
val emptyset :Set= x=> false                      //> emptyset  : Int => Boolean = <function1>
val onetoten : Set= arbitrarySet(1,2,3,4,5)       //> onetoten  : Int => Boolean = <function1>
val minusplus=boundedSet(-1000,10001)             //> minusplus  : Int => Boolean = <function1>
val lessfive=inftSet(1000)                        //> lessfive  : Int => Boolean = <function1>
 
contains(emptyset,5)                              //> res0: Boolean = false
toString(singletonSet(4))                         //> res1: String = {4}
//toString(union(onetoten,minusplus))
toString(intersect(onetoten,minusplus))           //> res2: String = {1,2,3,4,5}
toString(diff(onetoten,minusplus))                //> res3: String = {}
toString(filter(onetoten,minusplus))              //> res4: String = {1,2,3,4,5}
contains(intersect(onetoten,minusplus),0)         //> res5: Boolean = false

//forall(minusplus,lessfive)
forall(x => (x == -1000 || x == 0 ),x => x < 1000)//> res6: Boolean = false

toString(map(onetoten,x=> -x))                    //> res7: String = {-5,-4,-3,-2,-1}
forall(x=>false,x=>true)                          //> res8: Boolean = false
forall(x=>false,x=>false)                         //> res9: Boolean = true
}