
object MyTree {
  enum Tree[+T] {
    case Branch(v: T, l: Tree[T], r: Tree[T])
    case Leaf
  }

  import Tree._

  def addId[T](t:Tree[T]) : Tree[(T,Int)] = addId(t, 0)._1

  private def addId[T](t: Tree[T], i:Int) : (Tree[(T,Int)], Int) = t match {
    case Leaf => (Leaf, i)
    case Branch(v, l, r) => {
      val newLeft = addId(l, i)
      val newRight = addId(r, newLeft._2)
      (Branch((v, newRight._2), newLeft._1, newRight._1), newRight._2 + 1)
    }
  }  
}
