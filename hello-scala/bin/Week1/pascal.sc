package Week1

/*object pascal {
  def pascal(c: Int, r: Int): Int = {
  if((c == 0) && (r == 0))
  	1
  if((c == -1) || (c>r))
  	0
  else
  	pascal(c-1,r-1) + pascal(c,r-1)
  }
  pascal(2,2)
}
*/

object pascal {
  def pascal(c: Int, r: Int): Int = {
  if((c <= -1) || (c>r))
  	0
  else if((c == 0) && (r == 0))
  	1
  else
  	pascal(c-1,r-1) + pascal(c,r-1)
  }                                               //> pascal: (c: Int, r: Int)Int
  pascal(2,4)                                     //> res0: Int = 6
}