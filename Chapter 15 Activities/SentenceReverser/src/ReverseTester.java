public class ReverseTester
{
    public static void main(String[] args)
    {
        String sentence = "Mary had a little lamb. Its fleece was white as snow.";
        String reversed = SentenceReverser.reverse(sentence);
        System.out.println("Given: " + sentence);
        System.out.println("Actual: " + reversed);
        System.out.println("Expected: Lamb little a had mary. Snow as white was fleece its.");
    }
}
