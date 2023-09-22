import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * This program checks which words in a file are not present in a dictionary.
*/
public class WordAnalysis
{
    public static void main(String[] args)
        throws FileNotFoundException
    {
        Set<String> dictionaryWords = readWords("Chapter 15 Class Notes/src/words");
        Set<String> novelWords = readWords("Chapter 15 Class Notes/src/war-and-peace.txt");

        //print the words in the novel
        for(String word: novelWords)
        {
            if(!dictionaryWords.contains(word))
            {
                System.out.println(word);
            }
        }

        //print number of words in novel
        System.out.println("There are "+novelWords.size()+" unique words in the novel");

        //print the number of unique >3 letter words
        Iterator<String> iterator = novelWords.iterator();
        while(iterator.hasNext())
        {
            if(iterator.next().length()>3)
            {
                iterator.remove();
            }
        }

        System.out.print("There are "+novelWords.size()+" unique words with less than three letters");
    }

    /**
     * Reads all words from a file.
     *
     * @param filename the name of the file
     * @return a set with all lowercased words in the file. Here, a
     * word is a sequence of upper- and lowercase letters.
    */
    public static Set<String> readWords(String filename)
        throws FileNotFoundException
    {
        Set<String> words = new HashSet<>();//no need to sort

        //determine the current working directory
        //System.out.println(System.getProperty("user.dir"));

        Scanner scan  = new Scanner(new File(filename), "UTF-8");

        //use any charecter thats not a letter as a delimeters
        scan.useDelimiter("[^a-zA-Z]+");
        while(scan.hasNext());
        {
            //add words to set, duplicates ignored
            words.add(scan.next().toLowerCase());
        }

        return words;
    }
}
