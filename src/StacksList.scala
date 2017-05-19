import scala.collection.mutable.Stack
import scala.io.StdIn
object StacksList {
  def main(args: Array[String]) {
    val packageStack = Stack[Int]()
    val Q = StdIn.readInt()
    for (i <- 0 until Q) {
      val in = StdIn.readLine().split(" ").map(_.toInt)
      if (in(0) == 1) if (packageStack.isEmpty) println("No Food") else println(packageStack.pop())
      else if (in(0) == 2) packageStack.push(in(1))
    }
  }
}


