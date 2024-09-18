import scala.collection.mutable.ListBuffer

*

class TreeNode(_value: Int = 0, _left: TreeNode = null, _right: TreeNode = null) {
  var value: Int = _value
  var left: TreeNode = _left
  var right: TreeNode = _right

}


object InOrderTraversal {
    def isValidBST(root: TreeNode): Boolean = {

      val valuesList : List[Int]= inOrderTraversal(root,ListBuffer[Int]()).toList
      valuesList.sliding(2).forall{
        case Seq(a, b) => a < b
        case _ => true
      }
    }

    def inOrderTraversal(node: TreeNode, values: ListBuffer[Int]): ListBuffer[Int] = {
      if(node != null) {
        inOrderTraversal(node.left,values)
        values.append(node.value)
        inOrderTraversal(node.right,values)
      }
      values
    }
  }
