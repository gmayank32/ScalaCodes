/**
  * Created by mayank on 1/3/17.
  */
import scala.io.StdIn
object TernarySearch {
  def func(x: Int): Int= 2*x*x - 12*x + 7

  def getMin(x: Int, y:Int):Int=if(x<=y) x else y

  def terSearch(l: Int,r: Int):Int={

      if (l>=r) getMin(func(l),func(r))
    if(func(l)==func(r)) terSearch(l,r-1)
      else if (func(l) < func(r)) {
        if(r==(l + 2 * r)/3) getMin(func(l),func(r))
        else terSearch(l,(l + 2 * r) / 3)
      }
      else{
        if(l==(2 * l + r)/3) getMin(func(l),func(r))
        else terSearch((2 * l + r) / 3, r)}

  }

  def main(args: Array[String]): Unit ={
    val N = StdIn.readInt()
    for (i<-0 until N){
      val input = StdIn.readLine().split(" ").map(_.toInt)
      val l = input(0)
      val r = input(1)
      println(terSearch(l,r))

    }
  }

}
