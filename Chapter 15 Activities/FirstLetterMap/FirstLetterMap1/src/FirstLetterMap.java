import java.util.*;
import java.io.*;
/**
 * Read all words from a file and add them to a map
 * whose keys are the first letters of the words and
 * whose values are sets of words that start with
 * that same letter.
 * Then print out the word sets in alphabetical order.
 * Use the Java 8 merge() feature.
*/
public class FirstLetterMap
{
    public static void main(String[] args)
    {
        String filename = "src/test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {

            Map<Character, Set<String>> letMap = new TreeMap<>(); 
            

            while (in.hasNext())
            {
                String word = clean(in.next());
                Character c = word.charAt(0);
                Set<String> letSet = new HashSet<String>();

                // Update the map here
                // Use the Java 8 merge method
                letMap.merge(c, letSet, (val1, val2)-> val1+val2);

            }

            // Print the map here in this form
            // a: [a, able, aardvark]
            //
        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }
    }

    public static String clean(String s)
    {
        String r = "";
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (Character.isLetter(c))
            {
                r = r + c;
            }
        }
        return r.toLowerCase();
    }

}
