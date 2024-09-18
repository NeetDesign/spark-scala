object ForLoop {

  def main(args: Array[String]): Unit = {
    for (i <- Range.inclusive(0,10)){
      print(i)
    } // 012345678910

    println("")

    for (i <- Range(0, 10)) {
      print(i)
    } // 0123456789

  }

}
