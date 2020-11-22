
import org.junit.Test
import org.junit.Assert._
import MyTree.Tree._

class MyTreeTest {

  @Test def test1(): Unit = {
    val t = Main.t
    val e = Branch(("apricot", 4),
      Branch(("apple", 0), Leaf, Leaf),
      Branch(("cherry", 3),
        Branch(("date", 1), Leaf, Leaf),
        Branch(("fig", 2), Leaf, Leaf)))

    assertEquals(e, MyTree.addId(t))
  }
}