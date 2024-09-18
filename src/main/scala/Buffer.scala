import scala.collection.mutable.ListBuffer
import scala.::

object Buffer {

  def main(args: Array[String]): Unit = {

    val listBuffer = ListBuffer[Int]()
    listBuffer.append(1)
    listBuffer.append(2)
    listBuffer.append(3)
    listBuffer.append(1)
    listBuffer.prepend(5)

    for (e <- listBuffer)
        println(e)
  }

}
