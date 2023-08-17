/**
    Testing the LinkedListQueue.lastToFirst() method.
*/
public class QueueTester
{
    public static void main(String[] args)
    {
        LinkedListQueue q = new LinkedListQueue();
        q.add("Tom");
        q.add("Diana");
        q.add("Harry");
        q.lastToFirst();
        q.add("Sarah");
        q.add("John");

        int i = 0;
        while (!q.empty())
        {
            System.out.print(q.remove() + " ");
            if(i >= 5)
            {
                System.out.println("More elements than expected in the queue, " +
                    "perhaps the list became circular?");
            }
            i++;
        }
        System.out.println();
        System.out.println("Expected: Harry Tom Diana Sarah John");
    }
}
