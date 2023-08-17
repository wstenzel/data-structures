/**
    Testing the LinkedListQueue.firstToLast() method
*/
public class QueueTester
{
    public static void main(String[] args)
    {
        LinkedListQueue q = new LinkedListQueue();
        q.add("Tom");
        q.add("Diana");
        q.add("Harry");
        q.firstToLast();
        while (!q.empty())
        {
            System.out.print(q.remove() + " ");
        }
        System.out.println();
        System.out.println("Expected: Diana Harry Tom");
    }
}
