/**
  This class demonstrates the tree class.
*/
public class TreeDemo
{
  public static void main(String[] args)
  {
      BinaryTree t4 = new BinaryTree("Savannah");
      BinaryTree t2 = new BinaryTree("Peter", t4, null);
      BinaryTree t3 = new BinaryTree("Zara");
      BinaryTree t1 = new BinaryTree("Anne", t2, t3);
      System.out.println("Nodes with one child: " + t1.countNodesWithOneChild());
  }
}
