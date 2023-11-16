/**
    This class implements a binary search tree whose
    nodes hold objects that implement the Comparable
    interface.
*/
public class BinarySearchTree
{   
    private Node root;

    /**
        Constructs an empty tree.
    */
    public BinarySearchTree()
    {   
        this.root = null;
    }
    
    /**
        Inserts a new node into the tree.
        @param obj the object to insert
    */
    public void add(Comparable obj) 
    {   
        Node newNode = new Node();
        newNode.data = obj;
        newNode.left = null;
        newNode.right = null;
        if (this.root == null)
        {
            this.root = newNode;
        }
        else
        {
            this.root.addNode(newNode);
        }
    }

    /**
        Tries to find an object in the tree.
        @param obj the object to find
        @return true if the object is contained in the tree
    */
    public boolean find(Comparable obj)
    {
        Node current = this.root;
        while (current != null)
        {
            int diff = obj.compareTo(current.data);
            if (diff == 0)
            {
                return true;
            }
            else if (diff < 0)
            {
                current = current.left;
            }
            else
            {
                current = current.right;
            }
        }
        return false;
    }
    
    /**
        Tries to remove an object from the tree. Does nothing
        if the object is not contained in the tree.
        @param obj the object to remove
    */
    public void remove(Comparable obj)
    {
        Node toBeRemoved = this.root;
        Node parent = null;
        boolean found = false;
        while (!found && toBeRemoved != null)
        {
            int diff = obj.compareTo(toBeRemoved.data);
            if (diff == 0)
            {
                found = true;
            }
            else 
            {
                parent = toBeRemoved;
                if (diff < 0)
                {
                    toBeRemoved = toBeRemoved.left;
                }
                else
                {
                    toBeRemoved = toBeRemoved.right;
                }
            }
        }
        if (!found) 
        {
            return;
        }

        //Case 1 and Case 2 ( At least one child is null)
        if(toBeRemoved.left == null || toBeRemoved.right == null)
        {
            Node newChild;
            if(toBeRemoved.left == null)
            {
                newChild = toBeRemoved.right;
            }
            else
            {
                newChild = toBeRemoved.left;
            }

            if(parent == null) //removing root
            {
                this.root = newChild;
            }
            else if(parent.left == toBeRemoved)
            {
                parent.left = newChild;
            }
            else
            {
                parent.right = newChild;
            }
            return;
        }

        

        //Case 3: Remove a node with two children
        //find the least element of the right subtree
        Node leastParent = toBeRemoved;
        Node least = toBeRemoved.right;
        while(least.left != null)
        {
            leastParent = least;
            least = least.left;
        }

        //Move to node being deleted
        toBeRemoved.data = least.data;
        if(leastParent == toBeRemoved)
        {
            leastParent.right = least.right;
        }
        else
        {
            leastParent.left = least.right;
        }
    }
    
    /**
        Prints the contents of the tree in sorted order.
    */
    public void print()
    {   
        print(this.root);
        System.out.println();
    }   

    /**
        Prints a node and all of its descendants in sorted order.
        @param parent the root of the subtree to print
    */
    private static void print(Node parent)
    {   
        if(parent == null)
        {
            return;
        }

        print(parent.left);
        System.out.println(parent.data+ "");
        print(parent.right);
    }

    /**
        A node of a tree stores a data item and references
        to the left and right child nodes.
    */
    static class Node
    {   
        //must be comparable objects
        public Comparable data;
        public Node left;
        public Node right;

        /**
            Inserts a new node as a descendant of this node.
            @param newNode the node to insert
        */
        public void addNode(Node newNode)
        {   
            //if diff <0, newNode is to the left
            //if diff >0, newNode is to the right
            int diff = newNode.data.compareTo(data);
            if (diff < 0)
            {   
                if (left == null)
                {
                    left = newNode;
                }
                else
                {
                    left.addNode(newNode);
                }
            }
            else if (diff > 0)
            {   
                if (right == null)
                {
                    right = newNode;
                }
                else
                {
                    right.addNode(newNode);
                }
            }
        }
    }
}



