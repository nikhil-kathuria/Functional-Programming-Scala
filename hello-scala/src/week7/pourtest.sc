package week7

object pourtest {
  val problem = new Pouring(Vector(4,5,7))        //> problem  : week7.Pouring = week7.Pouring@5bcd16
  problem.moves                                   //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with we
                                                  //| ek7.pourtest.problem.Move] = Vector(Empty(0), Empty(1), Empty(2), Fill(0), Fi
                                                  //| ll(1), Fill(2), Pour(0,1), Pour(0,2), Pour(1,0), Pour(1,2), Pour(2,0), Pour(2
                                                  //| ,1))
  problem.pathSets.take(3).toList                 //> res1: List[Set[week7.pourtest.problem.Path]] = List(Set(-->Vector(0, 0, 0)),
                                                  //|  Set(Pour(2,1)-->Vector(0, 0, 0), Pour(2,0)-->Vector(0, 0, 0), Empty(0)-->Ve
                                                  //| ctor(0, 0, 0), Empty(1)-->Vector(0, 0, 0), Pour(1,2)-->Vector(0, 0, 0), Empt
                                                  //| y(2)-->Vector(0, 0, 0), Fill(1)-->Vector(0, 5, 0), Pour(1,0)-->Vector(0, 0, 
                                                  //| 0), Pour(0,1)-->Vector(0, 0, 0), Fill(2)-->Vector(0, 0, 7), Fill(0)-->Vector
                                                  //| (4, 0, 0), Pour(0,2)-->Vector(0, 0, 0)), Set(Pour(1,0) Empty(2)-->Vector(0, 
                                                  //| 0, 0), Pou
                                                  //| Output exceeds cutoff limit.
}