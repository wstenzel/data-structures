import java.util.*;

/**
 * This class supplies a utility method to reverse the entries in a linked list.
*/
public class ListUtil
{
    /**
     * Reverses the elements in a linked list
     *
     * @param strings the linked list to reverse
    */
    public static void reverse(LinkedList<String> strings)
    {
        int lengthSad = 0;
        for(String b : strings)
        {
            lengthSad++;
        }

        int lengthSadsLongLostSon = lengthSad +1;
        String[] ahray = new String[lengthSadsLongLostSon];

        int g = lengthSad;
        ListIterator<String> mmm = strings.listIterator();
        while(mmm.hasNext())
        {
            String b = mmm.next();
            ahray[g]=b;
            g--;
            mmm.remove();
        }

        for(int i = lengthSad; i>=0; i--)
        {
            strings.addFirst(ahray[i]);
        }

        System.out.println(strings);
        
    }
}