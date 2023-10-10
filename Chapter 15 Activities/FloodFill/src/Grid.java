import java.util.*;

public class Grid
{
    private static final int SIZE = 10;
    int[][] pixels = new int[SIZE][SIZE];
    public Stack<Pair> stacky;

    /**
     * Flood fill, starting with the given row and column.
    */
    public void floodfill(int row, int column)
    {
        stacky = new Stack<>();
        stacky.push(new Pair(3,4));
        int c = 1;
        while(!stacky.isEmpty())
        {   
            
            Pair p = stacky.pop();
            int p1= p.getRow();
            int p2= p.getColumn();
            if(pixels[p1][p2]==0)
            {
                pixels[p1][p2]=c;
                c++;
            }
            if(p1-1>=0)
            {
                stacky.push(new Pair(p1-1, p2));
            }
            else if(p2+1<10)
            {
                stacky.push(new Pair(p1, p2+1));
            }
            else if(p1+1<10)
            {
                stacky.push(new Pair(p1+1, p2));
            }
            else if(p2-1>=0)
            {
                stacky.push(new Pair(p1, p2-1));
            }
        }
    }

    @Override
    public String toString()
    {
        String r = "";
        for (int i = 0; i < SIZE; i++)
        {
            for (int j = 0; j < SIZE; j++)
                r = r + String.format("%4d", pixels[i][j]);
            r = r + "\n";
        }
        return r;
    }
}
