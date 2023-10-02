import java.util.*;
import java.io.*;
/**
 * Read all words from a file and add them to a map
 * whose keys are the first letters of the words and
 * whose values are sets of words that start with
 * that same letter. Then print out the word sets in
 * alphabetical order. Update the map by modifying
 * Worked Example 15.1.
*/
public class FirstLetterMap
{
    public static void main(String[] args)
    {
        String filename = "src/test1.txt";

        try (Scanner in = new Scanner(new File(filename)))
        {

            // Create your map here
            Map<Character, Set<String>> letMap = new TreeMap<>(); 

            while (in.hasNext())
            {
                String word = clean(in.next());
                Character c = word.charAt(0);
                Set<String> set2 = new HashSet<>();

                // Update the map here
                // Modify Worked Example 15.1
                if(letMap.containsKey(c))
                {
                    letMap.get(c).add(word);
                    letMap.put(c, set2);
                }

            }

            // Print the map here in this form
            // a: [a, able, aardvark]
            Set<Character> keys = letMap.keySet();
            for(Character key : keys)
            {
                System.out.println(key+" ("+key.hashCode()+"):" + letMap.get(key));
            }

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
