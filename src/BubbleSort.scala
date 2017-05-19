import scala.io.StdIn
/**
  * Created by mayank on 2/3/17.
  */
object BubbleSort {
  def main(args: Array[String]):Unit={
    val N = StdIn.readInt()
    val array = StdIn.readLine().split(" ").map(_.toInt)
    var swap = 0
    for (i<-0 until N-1;j<-0 until N-i-1 if(array(j)>array(j+1))){
      swap += 1
      val temp = array(j)
      array(j)=array(j+1)
      array(j+1)=temp
    }
    println(swap)
  }
}
