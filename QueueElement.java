/**
 * This class models a Queue element in a Queue
 * @author Gabriel Petcu
 * @verson 1.0.0.
 * @param <E> generic type.
 */
public class QueueElement<E> {
    private E e;
    private QueueElement<E> next;

    public QueueElement(E e, QueueElement<E> n)
    {
        this.e = e;
        this.next = n;
    }

    /**
     * This method sets the element in the Queue.
     * @param e represents the element in the Queue.
     */
    public void setElement(E e)
    {
        this.e = e;
    }

    /**
     * This method returns the element in the Queue.
     * @return the element in the Queue.
     */
    public E getElement()
    {
        return this.e;
    }

    /**
     * This method sets the next node in the Queue.
     * @param next represents the next node in the Queue.
     */
    public void setNext(QueueElement<E> next)
    {
        this.next = next;
    }

    /**
     * This method returns the next node in the Queue.
     * @return the next node in the Queue.
     */
    public QueueElement<E> getNext()
    {
        return this.next;
    }
}
