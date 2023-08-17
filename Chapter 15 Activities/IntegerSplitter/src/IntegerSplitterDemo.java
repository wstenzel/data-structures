import java.util.Scanner;

public class IntegerSplitterDemo
{
    public static void main(String[] args)
    {
        System.out.println("Please enter an integer to be split (0 to quit):");
        Scanner in = new Scanner(System.in);
        int integer = 1;
        while (integer > 0)
        {
            integer = in.nextInt();
            IntegerSplitter.split(integer);
        }
    }
}
