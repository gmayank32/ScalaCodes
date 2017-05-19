import scala.collection.mutable.Queue
import scala.io.StdIn
object QueuesImpl {
  def main(args: Array[String]) {
    val packageQueue = Queue[Int]()
    val Q = StdIn.readInt()
    for (i <- 0 until Q) {
      val in = StdIn.readLine().split(" ")
      if (in(0) == "D") {
        if (packageQueue.isEmpty) println(-1)
        else println(packageQueue.dequeue().toString + ' ' + packageQueue.size.toString)
      }
      else if (in(0) == "E") {
        packageQueue.enqueue(in(1).toInt)
        println(packageQueue.size)
      }
    }
  }
}



