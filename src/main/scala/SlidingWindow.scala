import scala.collection.mutable.ListBuffer

object SlidingWindow {

  def main(args: Array[String]): Unit = {
    val arr = Array(1, 3, 2, 6, -1, 4, 1, 8, 2)
    val k = 5

    var (l, r) = (0,k-1)
    val len = arr.length
    val res = ListBuffer[Int]()
    var sum : Int = 0

    while(r < len) {
      for (i <- Range.inclusive(l, r,1)) {
        sum  = sum + arr(i)
      }
      l +=1
      r +=1
      res.append(sum/k)
    }

    println(res)

  }

}
