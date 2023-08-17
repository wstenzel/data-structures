/**
    A test program to reverse the entries in a linked list.
*/
public class ReverseTester
{   
    public static void main(String[] args)
    { 
        LinkedList names = new LinkedList();
        names.addFirst("Tom");
        names.addFirst("Romeo");
        names.addFirst("Harry");
        names.addFirst("Dick");

        names.reverse();
        ListIterator iter = names.listIterator();
        while (iter.hasNext()) System.out.print(iter.next() + " ");
        System.out.println();
        System.out.println("Expected: Tom Romeo Harry Dick");
    }
}
