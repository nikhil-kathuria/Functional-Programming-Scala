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

object pascal {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(365); 
  def pascal(c: Int, r: Int): Int = {
  if((c <= -1) || (c>r))
  	0
  else if((c == 0) && (r == 0))
  	1
  else
  	pascal(c-1,r-1) + pascal(c,r-1)
  };System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(14); val res$0 = 
  pascal(2,4);System.out.println("""res0: Int = """ + $show(res$0))}
}
