import java.util.List;

public class PermutationTester
{
    public static void main(String[] args)
    {
        PermutationGenerator gen = new PermutationGenerator();
        List<String> permutations = gen.getPermutations("meat");
        System.out.println(permutations.get(0));
        System.out.println("Expected: taem");
        System.out.println(permutations.get(1));
        System.out.println("Expected: tame");
        System.out.println(permutations.get(22));
        System.out.println("Expected: meta");
        System.out.println(permutations.get(23));
        System.out.println("Expected: meat");
        permutations = gen.getPermutations("rum");
        System.out.println(permutations);
        System.out.println("Expected: [mur, mru, umr, urm, rmu, rum]");
    }
}
