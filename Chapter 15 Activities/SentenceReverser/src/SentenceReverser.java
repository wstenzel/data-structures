import java.util.Scanner;
import java.util.Stack;

/**
 * Class for reversing the order of a sentence.
*/
public class SentenceReverser
{
    /**
     * Reverses the given sentence.
     *
     * @param sentence Sentence to be reversed.
     * @return reversed sentence.
    */
    public static String reverse(String sentence)
    {
    	Scanner scanner = new Scanner(sentence);
    	Stack<String> words = new Stack<>();
        String newSentance = new String();
        Stack<String> temp = new Stack<>();
        int i = 0;
        while(scanner.hasNext())
        {
            String word = scanner.next();


            
            if(!word.equals("."))
            {
                words.push(word);
                
            }
            //if(word.equals("."))
           // {
             
            //}
            i++;
            
        }
        
        while(i>0)
        {
            newSentance+=words.pop()+" ";
            i--;
        }
        return newSentance;
    }
}
