import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
/**
 * Write a program that checks whether a sequence of HTML tags
 * is properly nested. For each opening tag, such as <p>, there
 * must be a closing tag </p>. A tag such as <p> may have other
 * tags inside, for example <p> <ul> <li> </li> </ul> <a> </a> </p>
 * <p>
 * The inner tags must be closed before the outer ones.
 * Your program should process a file containing tags.
 * For simplicity, assume that the tags are separated by
 * spaces, and that there is no text inside the tags.
*/
public class HTMLChecker
{
    public static void main(String[] args)
    {
        String filename = "Chapter 15 Activities/HTMLChecker/src/TagSample1.html";
        //String tags = "";
        Stack<String> tags = new Stack<>();
        try (Scanner in = new Scanner(new File(filename)))
        {
            while(in.hasNext())
            {
                String tag = in.next();
                tags.push(tag);
            }
            //System.out.println(tags);
        } catch (FileNotFoundException e)
        {
            System.out.println("Cannot open: " + filename);
        }
        String openTag ="";
        String closeTab ="";
        for(String a: tags)
        {
            
            if(a.contains("/"))
            {
                closeTab=a;
            }
            else{
                openTag = a;
            }
            if(openTag.substring(1)!= closeTab.substring(2))
            {
                System.out.println("It doesnt work");
            }
        }

    }
}
