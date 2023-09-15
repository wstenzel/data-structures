import java.util.LinkedList;
import java.util.ListIterator;

/**
 * This program demonstrates the LinkedList class
 * and ListIterator class.
*/
public class ListDemo
{
    public static void main(String[] args)
    {
        LinkedList<String> staff = new LinkedList<>();
        staff.addLast("T");
        staff.addLast("N");
        staff.addLast("P");
        staff.addLast("G");

        ListIterator<String> avenger = staff.listIterator();

        avenger.hasNext();

        String name = avenger.next();
        System.out.println(name);

        avenger.add("B");
        avenger.add("R");

        avenger.next();
        avenger.remove();
        System.out.println(staff);

        avenger.previous();
        avenger.set("S");
        System.out.println(staff);

        avenger=staff.listIterator();
        while(avenger.hasNext())
        {
            String n = avenger.next();
            if(n.equals("N"))
            {
                avenger.remove();
            }

            for(String b : staff)
            {
                System.out.print(b+" ");
            }

            /*
             * ConcurrentModificationException
             * CANNOT modify a linked list while using an iterator
             * UNLESS you use the iterator to remove it
             */
            avenger = staff.listIterator();
            while(avenger.hasNext())
            {
                String b = avenger.next();
                if(b.equals("S"))
                {
                    staff.remove("S");
                }
            }
            
            /*
             *ConcurrentModificationException
             * enhanced for loop auto-makes an iterator
             */
            for(String b : staff)
            {
                if(b.equals("S"))
                {
                    staff.add("R");
                }
            }
        }
    }
}
