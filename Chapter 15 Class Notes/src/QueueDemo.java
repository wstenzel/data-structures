import java.util.LinkedList;
import java.util.Queue;

/**
 * This program simulates a print queue. Note that documents are printed
 * in the same order as they are submitted.
*/
public class QueueDemo
{
    public static void main(String[] args)
    {
        //Create a print quee of strings (using a linked list)
        Queue<String>  jobs = new LinkedList<>();

        //add some jobs
        jobs.add("Joe: Quarter 2 expense report");
        jobs.add("Cathy: Cat photos");

        //System.out.println("Printing: "+jobs.remove());

        jobs.add("Cathy: Dog photos");
        jobs.add("Joe: Grocery list");
        jobs.add("Cathy: Can I get fired for this");

        //System.out.println("Printing: "+jobs.remove());

        jobs.add("Boss: Cathy termination letter");

        //Print the rest of the jobs
        while(jobs.size()>0)
        {
            System.out.println(jobs.remove());
        }
    }
}
