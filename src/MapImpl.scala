import scala.collection.mutable.Map
import scala.io.StdIn

object MapImpl {
  def main(args: Array[String]) {
    var studentsMap = Map[String, String]()
    val N = StdIn.readInt()
    for (i<-0 until N) {
      val input = StdIn.readLine().split(" ")
      studentsMap += (input(0) -> input(1))
    }
    val Q = StdIn.readInt()
    for (i<-0 until Q) println(studentsMap(StdIn.readLine()))

  }
}
