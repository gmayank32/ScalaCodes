import scala.io.StdIn
object Transpose {
  def main(args: Array[String]) {
    val in = StdIn.readLine().split(" ").map(_.toInt)
    val n = in(0)
    val m = in(1)
    val array = Array.ofDim[Int](n,m)
    for (i<-0 until n) array(i) = StdIn.readLine().split(" ").map(_.toInt)
    for (j<-0 until m){
      if (j>0) println()
      for(i<-0 until n){
        print(array(i)(j))
        print(' ')
      }
    }

  }
}

