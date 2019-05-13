/**
 * This class models a Queue of elements.
 * @author Gabriel Petcu
 * @verson 1.0.0.
 * @param <E> generic type.
 */
import java.util.NoSuchElementException;

public class Queue<E> {
    private QueueElement<E> head;
    private QueueElement<E> tail;

    /**
     * Initialization of an empty Queue;
     */
    public Queue()
    {
        head = null;
        tail = null;
    }

    /**
     * isEmpty method to check if the Queue is empty;
     * @return whether if the Queue is empty or not.
     */
    public boolean isEmpty()
    {
        if(head == null && tail == null) {
            return true;
        }else {
            return false;
        }
    }

    // Enqueue adds an element on the back of the QUEUE;
    public void enqueue(E element)
    {
        QueueElement<E> newNode =  new QueueElement(element,null);
        if(isEmpty())
        {
            head = newNode;
            head.setNext(tail);
            tail = newNode;

        }
        else
        {
            tail.setNext(newNode);
            tail = newNode;
        }
    }
    // Dequeue removes the first element of the QUEUE;
    public void dequeue(E element) throws NoSuchElementException
    {
        QueueElement<E> newNode = new QueueElement(element,null);
        if(isEmpty())
        {throw new NoSuchElementException();}
        else
        { if (head==tail)
        {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
        }


        }
    }

    public E peek() throws NoSuchElementException
    {
        if(isEmpty())
        {
            throw new NoSuchElementException();
        }
        else
        {
            return head.getElement();
        }
    }

    /**
     * Method that displays the whole queue.
     */

    public void display()
    {
        QueueElement<E> ints = head;
        while(ints != null)
        {
            System.out.println(ints.getElement());
            ints = ints.getNext();
        }
    }

}
