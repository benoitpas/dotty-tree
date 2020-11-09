import MyTree.Tree._

object Main {
  val t = Branch("a",
    Branch("b",Leaf,Leaf),
    Branch("c",
      Branch("d", Leaf, Leaf),
      Branch("e", Leaf, Leaf)))

  def main(args: Array[String]): Unit = {
    print("Original tree:")
    println(t)
    println("Tree with id")
    println(MyTree.addId(t))
  }
}
