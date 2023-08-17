public class FloodFillTester
{
    public static void main(String[] args)
    {
        Grid gr = new Grid();
        gr.floodfill(3, 4);
        String[] rows = gr.toString().split("\n");
        System.out.println(rows[2]);
        System.out.println("Expected: 80     79  78 77   76  75 74   73  72 71");
        System.out.println(rows[3]);
        System.out.println("Expected: 5  4    3 2    1   66  67 68   69  70");
        System.out.println(rows[4]);
        System.out.println("Expected: 6 65   64  63 62   61  60 59   58  57");
        gr = new Grid();
        gr.floodfill(0, 0);
        rows = gr.toString().split("\n");
        System.out.println(rows[0]);
        System.out.println("Expected:     1 100 99   98  97 96   95  94 93   92");
        System.out.println(rows[1]);
        System.out.println("Expected:     2  83 84   85  86 87   88  89 90   91");
        System.out.println(rows[2]);
        System.out.println("Expected:     3  82 81   80  79 78   77  76 75   74");
    }
}
