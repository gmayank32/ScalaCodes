import scala.io.StdIn



object BinarySearch {

  def binSearch(array: Array[Int], start: Int, end: Int, n: Int): Int = {
    if (start > end) return -1
    val mid = (start + end) / 2
    if (array(mid) == n) array(mid)
    else if (array(mid) < n) binSearch(array, mid + 1, end, n)
    else binSearch(array, start, mid - 1, n)

  }

  def main(args: Array[String]) {
    val T = StdIn.readInt()

      val array = StdIn.readLine().split(" ").map(_.toInt).sortWith(_ < _)
      val q = StdIn.readInt()
      for (i <- 0 until q) println(binSearch(array, 0, array.length - 1, StdIn.readInt()))

  }
}
