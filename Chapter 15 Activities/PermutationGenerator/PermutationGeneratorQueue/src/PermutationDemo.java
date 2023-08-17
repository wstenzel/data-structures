import java.util.List;

public class PermutationDemo
{
    public static void main(String[] args)
    {
        PermutationGenerator gen = new PermutationGenerator();
        List<String> permutations = gen.getPermutations("meat");
        for (String perm : permutations)
            System.out.println(perm);
    }
}
