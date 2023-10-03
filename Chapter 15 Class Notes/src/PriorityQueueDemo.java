import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        //create a to-do list
        //the workOrder class has a priority and a description
        Queue<WorkOrder> toDo = new PriorityQueue<>();

        toDo.add(new WorkOrder(3,"water plants"));
        toDo.add(new WorkOrder(2, "Make dinner"));
        toDo.add(new WorkOrder(2, "Embezzle funds"));
        toDo.add(new WorkOrder(9, "Leak classified documents on WarThunder forums"));
        toDo.add(new WorkOrder(1, "Sleep"));

        //not stored in priority order
        System.out.println(toDo);

        //removed in priority order
        while(toDo.size()> 0)
        {
            System.out.println(toDo.remove());
        }
    }
}
