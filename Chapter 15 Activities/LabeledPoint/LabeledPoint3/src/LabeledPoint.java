/**
 * A labeled point has x- and y-coordinates and a string label.
 * To do: Implement the Comparable Interface. See Section 14.8.3.
*/
public class LabeledPoint
{
    private int x;
    private int y;
    private String label;

    /**
     * Constructs a labeled point.
     *
     * @param x     the x-coordinate
     * @param y     the y-coordinate
     * @param label the string label for the point.
    */
    public LabeledPoint(int x, int y, String label)
    {
        this.x = x;
        this.y = y;
        this.label = label;
    }

    /**
     * @return the label
    */
    public String getLabel()
    {
        return label;
    }

    /**
     * @return the x-coordinate
    */
    public int getX()
    {
        return x;
    }

    /**
     * @return the y-coordinate
    */
    public int getY()
    {
        return y;
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "[label=" + label + ", x="
          + x + ", y=" + y + "]";
    }
}
