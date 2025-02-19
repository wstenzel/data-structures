public class TreeTester
{
    public static void main(String[] args)
    {
        Tree t1 = new Tree("Anne");
        Tree t2 = new Tree("Peter");
        t1.addSubtree(t2);
        Tree t3 = new Tree("Zara");
        t1.addSubtree(t3);
        Tree t4 = new Tree("Savannah");
        t2.addSubtree(t4);
        System.out.println("Size: " + t1.size());
        System.out.println("Expected: 4");
        System.out.println("Leaf count: " + t1.countLeaves());
        System.out.println("Expected: 2");
    }
}
