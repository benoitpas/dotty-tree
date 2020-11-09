
import org.junit.Test
import org.junit.Assert._
import MyTree.Tree._

class MyTreeTest {

  @Test def test1(): Unit = {
    val t = Main.t
    val e = Branch(("a", 4),
      Branch(("b", 0), Leaf, Leaf),
      Branch(("c", 3),
        Branch(("d", 1), Leaf, Leaf),
        Branch(("e", 2), Leaf, Leaf)))

    assertEquals(e, MyTree.addId(t))
  }
}