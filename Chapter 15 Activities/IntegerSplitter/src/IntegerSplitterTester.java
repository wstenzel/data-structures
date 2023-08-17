//HIDE
public class IntegerSplitterTester
{
    public static void main(String[] args)
    {
        IntegerSplitter.split(12345);
        System.out.println("Expected: 1 2 3 4 5");
        IntegerSplitter.split(8645);
        System.out.println("Expected: 8 6 4 5");
        IntegerSplitter.split(29447);
        System.out.println("Expected: 2 9 4 4 7");
    }
}
