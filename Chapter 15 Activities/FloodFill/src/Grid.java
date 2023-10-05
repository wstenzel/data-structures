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
        while(!stacky.isEmpty())
        {   
            int c = 1;
            if(pixels[stacky.pop().getRow()][stacky.pop().getColumn()]==0)
            {
                
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
