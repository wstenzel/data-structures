import java.util.Scanner;

public class BinaryTreeTester
{
    public static void main(String[] args)
    {
        // Tree from page 777 in sorted order
        BinaryTree names =
            new BinaryTree("Juliet",
                new BinaryTree("Diana",
                    new BinaryTree(), new BinaryTree("Harry")),
                new BinaryTree("Tom",
                    new BinaryTree("Romeo"), new BinaryTree()));

        /*
        	This is an example of a Lambda expression.
        	
        	Lamba expressions were added in Java 8. They are popular in a variety
        	of dynamic languages and may be referred to as closures, anonymous
        	functions, or blocks. They require little syntax (they are very concise).
        	
        	Read Section 10.4 in the text for more information.
    	 */
        Visitor visitor = (data) -> System.out.print(data + " ");

        System.out.print("Inorder traversal: ");
        names.inorder(visitor);
        System.out.println();
        System.out.println("Expected: Diana Harry Juliet Romeo Tom");

        System.out.print("Preorder traversal: ");
        names.preorder(visitor);
        System.out.println();
        System.out.println("Expected: Juliet Diana Harry Tom Romeo ");


        System.out.print("Postorder traversal: ");
        names.postorder(visitor);
        System.out.println();
        System.out.println("Expected: Harry Diana Romeo Tom Juliet");
    }
}
