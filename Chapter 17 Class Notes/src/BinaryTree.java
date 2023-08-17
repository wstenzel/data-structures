/**
    A binary tree in which each node has two children.
*/
public class BinaryTree
{
    private Node root;

    /**
        Constructs an empty tree.
    */
    public BinaryTree()
    {
         
    } 

    /**
        Constructs a tree with one node and no children.
        @param rootData the data for the root
    */
    public BinaryTree(Object rootData) 
    {
        
    }

    /**
        Constructs a binary tree.
        @param rootData the data for the root
        @param left the left subtree
        @param right the right subtree
    */
    public BinaryTree(Object rootData, BinaryTree left, BinaryTree right)
    {
        
    }
    
    static class Node
    {
        
    }

    /**
        Returns the height of the subtree whose root is the given node.
        @param n a node or null
        @return the height of the subtree, or 0 if n is null
    */
    private static int height(Node n)
    {
        return 0;
    }

    /**
        Returns the height of this tree.
        @return the height
    */
    public int height()
    {
        return 0;
    }

    /**
        Checks whether this tree is empty.
        @return true if this tree is empty
    */
    public boolean isEmpty()
    {
         return false;
    }

    /**
        Gets the data at the root of this tree.
        @return the root data
    */
    public Object data()
    {
         return null;
    }
    
    /**
        Gets the left subtree of this tree.
        @return the left child of the root
    */
    public BinaryTree left() 
    { 
        return null;
    }

    /**
        Gets the right subtree of this tree.
        @return the right child of the root
    */
    public BinaryTree right() 
    { 
        return null;
    }
}
