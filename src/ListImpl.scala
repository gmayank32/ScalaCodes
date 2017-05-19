import scala.collection.mutable.ListBuffer
import scala.io.StdIn
import scala.collection.immutable.Stack


/**
  * Created by mayank on 24/2/17.
  */
object ListImpl {
  def reverse(l:List[Int]): List[Int] = l.reverse
  def removekElements(friends: List[Int], k:Int): List[Int] = friends  match {
    case Nil => Nil
    case h::tail if k>0 => removekElements(tail ,k-1)
    case _ => friends
  }
  def deleteFriendsStack(friends: List[Int], stack: List[Int], k:Int): List[Int] = friends match {

    case Nil => reverse(stack)
    case _ if k == 0 => reverse(stack) ::: friends
    case List(t) => if (t > stack.head) deleteFriendsStack(friends,stack.tail,k-1) else reverse(List(t):::stack)
    case h::tail if stack.isEmpty || h <= stack.head => deleteFriendsStack(tail,List(h):::stack,k)
    case h::tail if h > stack.head => deleteFriendsStack(friends,stack.tail,k-1)
  }
  def main(args: Array[String]): Unit ={
    val T = StdIn.readInt()
    for (i<- 0 until T) {
      val input = StdIn.readLine().split(" ").map(_.toInt)
      val k = input(1)
      val n = input(0)
      val friends = StdIn.readLine().split(" ").map(_.toInt).toList
      val deletedFriends = deleteFriendsStack(friends.tail,List(friends.head),k)
      if (n-deletedFriends.length < k) reverse(removekElements(reverse(deletedFriends),k-(n-deletedFriends.length))).foreach(friend => print(friend.toString + ' '))
      else deletedFriends.foreach(friend => print(friend.toString + ' '))
      println()
    }

}



}
