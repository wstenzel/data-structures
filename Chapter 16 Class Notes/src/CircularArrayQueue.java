import java.util.NoSuchElementException;

/**
    An implementation of a queue as a circular array.
*/
public class CircularArrayQueue
{
    private Object[] elements;
    //private data



    /**
        Constructs an empty queue.
    */






    /**
        Checks whether this queue is empty.
        @return true if this queue is empty
    */




    /**
        Adds an element to the tail of this queue.
        @param newElement the element to add
    */





    /**
        Removes an element from the head of this queue.
        @return the removed element
    */





    /**
        Grows the element array if the current size equals the capacity.
    */
    private void growIfNecessary()
    {
        /*
        if(this.currentSize == this.elements.length)
        {
            Object[] newElements = new Object[2 * this.elements.length];
            for(int i = 0; i < this.elements.length; i++)
            {
                newElements[i] = this.elements[(head + i) % this.elements.length];
            }
            this.elements = newElements;
            this.head = 0;
            this.tail = this.currentSize;
        }
        */
    }




}//CircularArrayQueue
