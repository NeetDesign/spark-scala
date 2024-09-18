import scala.collection.mutable.HashMap

object findDuplicate {
  def main(args: Array[String]): Unit = {
    val arr = Array(1,3,4,2,2)
    print(findDuplicate(arr))
  }

  def findDuplicate(nums: Array[Int]): Int = {
   // val map =  HashMap[Int, Int]()
   // nums.find(i => map.contains(i) || { map(i) = 1; false }).getOrElse(-1)

    var (slow: Int, fast: Int) = (0,0)
    var continue = true

    while(continue){
      slow = nums(slow)
      fast = nums(nums(fast))
      if (slow == fast) {
        continue = false
      }
    }

    var slow_Two = 0
    continue = true
    while(continue) {
      slow = nums(slow)
      slow_Two = nums(slow_Two)
      if (slow_Two == slow)
        continue = false
    }
    return slow_Two
    }
}
