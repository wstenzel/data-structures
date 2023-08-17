public class DistanceTo implements Comparable<DistanceTo>
{
    private String target;
    private int distance;

	public DistanceTo(String city, int dist)
	{
		 target = city;
		 distance = dist;
	}

	public String getTarget()
	{
		 return target;
	}

	public int getDistance()
	{
		 return distance;
	}

	public int compareTo(DistanceTo other)
	{
		if(distance == other.distance)
		{
			return target.compareTo(other.target);
		}
		else
		{
			return distance - other.distance;
		}
	}

	public String toString()
	{
		 return "Distance to " + target + " is " + distance;
	}
}
