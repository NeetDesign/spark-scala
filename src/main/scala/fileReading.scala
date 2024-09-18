import scala.io.Source
import scala.util.Using

object fileReading {

  def main(args: Array[String]): Unit = {
    val filePath = "src/main/resources/demo.text"

    val result = Using(Source.fromFile(filePath)) { source =>
      for (line <- source.getLines()) {
        println(line)
      }
    }

    result match {
      case scala.util.Success(_) => println("File read successfully")
      case scala.util.Failure(exception) => println(s"An error occurred: ${exception.getMessage}")
    }

  }
}
