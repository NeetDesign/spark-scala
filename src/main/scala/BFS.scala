import scala.collection.mutable


object BFS {

  def main(args: Array[String]): Unit = {

    val deque  = mutable.ArrayDeque[Int]()

    deque.append(2)
    deque.append(3)
    deque.append(4)
    deque.append(5)
    deque.prepend(7)
    println(deque)
    deque.removeHead()
    println(deque)
    deque.removeLast()
    println(deque)

    while (deque.nonEmpty) {
      println(deque)
      print(s"length: ${deque.size}")
      deque.removeHead()
    }

  }
}
