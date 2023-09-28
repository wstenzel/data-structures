import java.awt.Color;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

/**
    This program demonstrates a map that maps names to colors.
*/
public class MapDemo
{
    public static void main(String[] args)
    {
        Map<String, Color> favColors = new HashMap<>();
        favColors.put("Peter", Color.BLACK);
        favColors.put("Seth", Color.BLUE);
        favColors.put("Celeste", Color.ORANGE);
        favColors.put("Dr. Miller", Color.ORANGE);//two different keys, same value is fine
        //same key cant have two different values
        favColors.put("Peter", Color.YELLOW);//replaces black with yellow

        //create a set of the keys in a map
        Set<String> keys = favColors.keySet();
        for(String key : keys)
        {
            System.out.println(key+" ("+key.hashCode()+"):" + favColors.get(key));
        }

    }
}
