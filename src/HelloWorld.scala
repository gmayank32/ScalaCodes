
import scala.io.StdIn
import scala.math

object HelloWorld {
  def isAttacked(row: Int, col:Int, board: Array[Array[Int]], N: Int):Boolean ={
    for (i <- 0 to N) if(board(row)(i)==1) return true
    for (i <- 0 to N) if(board(i)(col)==1) return true
    for (i <- 0 to N; j<-1 to N) if(row+col == i+j && board(i)(j)==1)  return true
    for (i <- 0 to N; j<-1 to N) if(math.abs(row-col) == math.abs(i-j) && board(i)(j)==1) return true
    return false
  }
  def populateBoard(board: Array[Array[Int]],N: Int, Nqueens: Int):Boolean={
    if(Nqueens==0) return true
    for (row <-0 to N;col <-0 to N){
        if (!isAttacked(row,col,board,N)){
          board(row)(col) = 1
          if(populateBoard(board,N,Nqueens-1)) return true
          board(row)(col) = 0
        }
      }
    return false
  }
  def main(args: Array[String]) {
    val N = StdIn.readInt()
    val board = Array.ofDim[Int](N,N)
    if (populateBoard(board,N-1,N)){
      println("YES")
      for (i <- 0 to N-1){
        if (i>0) println()
        for (j <- 0 to N-1){
          print(board(i)(j))
          print(' ')
        }
      }
    }
    else println("NO")


  }
}
