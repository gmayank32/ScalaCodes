import scala.io.StdIn
import scala.collection.mutable.ArrayBuffer
object SherlockHackerEarth {

  def getPthSmallestNumber(removedNumbers: Array[Int],p: Int,index: Int): Int = {
    if(index<removedNumbers.length && removedNumbers(index)<=p) getPthSmallestNumber(removedNumbers,p+1,index+1)
    else p
  }
  def main(args: Array[String]): Unit ={
    val T = StdIn.readInt()
    for (i<- 0 until T){
      val input = StdIn.readLine().split(" ").map(_.toInt)
      val n = input(0)
      val k = input(1)
      val p = input(2)
      val removedNumbers = StdIn.readLine().split(" ").map(_.toInt)
      if (p>(n-k)) println("-1") else println(getPthSmallestNumber(removedNumbers,p,0))

    }
  }
}
