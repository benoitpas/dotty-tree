import MyTree.Tree._

object Main {
  val t = Branch("apricot",
    Branch("apple",Leaf,Leaf),
    Branch("cherry",
      Branch("date", Leaf, Leaf),
      Branch("fig", Leaf, Leaf)))

  def main(args: Array[String]): Unit = {
    print("Original tree:")
    println(t)
    println("Tree with id")
    println(MyTree.addId(t))
  }
}
