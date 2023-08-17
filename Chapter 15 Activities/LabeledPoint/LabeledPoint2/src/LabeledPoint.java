import java.awt.Point;
import java.util.Objects;
/**
 * A labeled point has x- and y-coordinates and a string label.
 * This implementation uses the Java.awt Point class.
*/
public class LabeledPoint
{
    // Instance variables
    . . .

    /**
     * Constructs a labeled point.
     *
     * @param x     the x-coordinate
     * @param y     the y-coordinate
     * @param label the string label for the point.
    */
    public LabeledPoint(int x, int y, String label)
    {
        . . .


    }

    /**
     * Returns the hashcode for this object.
     *
     * @return the hashcode
    */
    public int hashCode()
    {

        . . .

    }

    /*
        Two labeled points considered the same when they
        have the same location and label.
        @param otherObject the object to compare this to.
    */
    public boolean equals(Object otherObject)
    {
        . . .

    }

    /**
     * @return the label
    */
    public String getLabel()
    {
        . . .
    }

    /**
     * @return the location
    */
    public Point getLocation()
    {
        . . .
    }

    @Override
    public String toString()
    {
        . . .

    }
}
