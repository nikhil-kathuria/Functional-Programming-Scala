package objsets

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class TweetSetSuite extends FunSuite {
  trait TestSets {
    val set1 = new Empty
    val set2 = set1.incl(new Tweet("a", "a body", 20))
    val set3 = set2.incl(new Tweet("b", "b body", 20))
    val c = new Tweet("c", "c body", 7)
    val d = new Tweet("d", "d body", 9)
    val set4c = set3.incl(c)
    val set4d = set3.incl(d)
    val set5 = set4c.incl(d)
    val gizmodoTweets = TweetReader.ParseTweets.getTweetData("gizmodo", TweetData.gizmodo)
    val techCrunchTweets = TweetReader.ParseTweets.getTweetData("TechCrunch", TweetData.TechCrunch)
    val engadgetTweets = TweetReader.ParseTweets.getTweetData("engadget", TweetData.engadget)
    val amazondealsTweets = TweetReader.ParseTweets.getTweetData("amazondeals", TweetData.amazondeals)
    val cnetTweets = TweetReader.ParseTweets.getTweetData("CNET", TweetData.CNET)
    val gadgetlabTweets = TweetReader.ParseTweets.getTweetData("gadgetlab", TweetData.gadgetlab)
    val mashableTweets = TweetReader.ParseTweets.getTweetData("mashable", TweetData.mashable)
  
    val giz = TweetReader.toTweetSet(gizmodoTweets)
    val tech = TweetReader.toTweetSet(techCrunchTweets)
    val eng = TweetReader.toTweetSet(engadgetTweets)
    val amaz = TweetReader.toTweetSet(amazondealsTweets)
    val cnet = TweetReader.toTweetSet(cnetTweets)
    val gad = TweetReader.toTweetSet(gadgetlabTweets)
    val mash = TweetReader.toTweetSet(mashableTweets)
  }

  def asSet(tweets: TweetSet): Set[Tweet] = {
    var res = Set[Tweet]()
    tweets.foreach(res += _)
    res
  }

  def size(set: TweetSet): Int = asSet(set).size

  test("filter: on empty set") {
    new TestSets {
      assert(size(set1.filter(tw => tw.user == "a")) === 0)
    }
  }

  test("filter: a on set5") {
    new TestSets {
      assert(size(set5.filter(tw => tw.user == "a")) === 1)
    }
  }

  test("filter: 20 on set5") {
    new TestSets {
      assert(size(set5.filter(tw => tw.retweets == 20)) === 2)
    }
  }

  test("union: with empty set (1)") {
    new TestSets {
      assert(size(set5.union(set1)) === 4)
    }
  }

  
  test("union: All Tweets available") {
    new TestSets {
      assert(size(giz union eng union tech union amaz union cnet union mash union gad ) === 695)
    }
  }

  
  test("union: When Both tweets are same") {
    new TestSets {
      assert(size(giz union giz ) === 100)
    }
  }
 
  
  test("giz: Mostweeted of giz") {
    new TestSets {
      assert((giz.mostRetweeted.retweets) === 321)
    }
  }
  
  test("TechCrunch: Mostweeted of TechCrunch") {
    new TestSets {
      assert((tech.mostRetweeted.retweets) === 326)
    }
  }

  test("descending: set5") {
    new TestSets {
      val trends = set5.descendingByRetweet
      assert(!trends.isEmpty)
      assert(trends.head.user == "a" || trends.head.user == "b")
    }
  }
  
   test("descending: Gizmodo") {
    new TestSets {
      val trends = giz.descendingByRetweet
      assert(!trends.isEmpty)
      assert(trends.head.retweets === 321)
      //trends foreach println
    }
  }
   
  test("GoogleVsApple: Implementation") {
    new TestSets {
      val appl=GoogleVsApple.appleTweets
      val goog=GoogleVsApple.googleTweets
      //GoogleVsApple.trending foreach println
      assert(size(goog) === 38)
      assert(size(appl) === 150)
      assert(size(goog union appl) === 179)
      
    }
  }
  
}
