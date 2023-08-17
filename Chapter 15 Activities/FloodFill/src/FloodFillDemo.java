public class FloodFillDemo 
{
    public static void main(String[] args)
    {
        Grid gr = new Grid();
        gr.floodfill(3, 4);
        System.out.println(gr.toString());
    }
}
