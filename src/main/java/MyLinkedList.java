/**
 * The MyLinkedList class is the implementation of a singly-linked list of
 * integers.
 * <p>
 * The data in the list will be stored in <code>Node</code> objects, with
 * each node storing one integer and a link to the next node in the list.
 * Our <code>MyLinkedList</code> will implement many of the same methods
 * as the <code>MyArrayList</code> class, but here the <code>add</code>
 * method with one parameter becomes the <code>addFirst</code> method;
 * instead of adding to the end of the list, it adds to the front.
 * <p>
 * Students should not, again, use the <code>java.util.LinkedList</code>
 * Java library class. Due to the nature of the Java garbage collector,
 * attention must be paid to the order used for certain operations. You
 * need to "hold on" to anything you do not want to lose with an object
 * reference, and only overwrite a reference if you no longer need the
 * object that it is referencing.
 * <p>
 * You may, of course, wish to add additional instance fields and private
 * methods, but please do not modify public interface. Again, remember to
 * avoid the <code>IndexOutOfBoundsException</code> and throw the
 * <code>NullPointerException</code> where noted.
 */
public class MyLinkedList {
    /**
     * The Node class is a private inner class of the <code>MyLinkedList</code>
     * class. Since none of the methods of <code>MyLinkedList</code> will return
     * a node, it is safe to make the instance fields here public.
     * If you prefer, you may replace this with a separate top-level class.
     * Also, you can build a constructor or use the default constructor.
     */
    private static class Node
    {
        // These fields both default to null.
        public Integer value;
        public Node next;
    }

    private Node head;
    private Node tail;
    private int size;



    public MyLinkedList() {
        head = null;
        tail = null;
        size = 0;

    }

    public void addFirst(Integer item) {
        if(item == null) {
            throw new NullPointerException();
        }

        Node newNode = new Node();
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void add(int index, Integer item) {
        //important
        if(item == null) {
            throw new NullPointerException();
        }
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if(index == 0) {
            addFirst(item);
        }
        Node newNode = new Node();
        Node current = head;
        for(int i = 0; i < index-1; i++) {
            current = current.next;
        }
        newNode.value = current.value;
        newNode.next = current.next;
        size++;

    }

    public Integer remove(int index) {
        //important
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Integer removedValue;
        if(index == 0) {
            removedValue = head.value;
            head = head.next;
        }
        else {
            Node current = head;
            for(int i = 0; i < index-1; i++) {
                current = current.next;
            }
            removedValue = current.value;
            current.next = current.next.next;
        }
        size--;
        return removedValue;
    }


    public Integer get(int index) {
       //important++
        if(index < 0 || index >= size()) {
            Node current = head;
            for(int i = 0; i < index; i++) {
                current = current.next;
            }
            return current.value;

        }
        return head.value;

    }


    public void set(int index, Integer item) {
            //imporant
            if (item == null) {
                throw new NullPointerException("Item cannot be null");
            }
        Node current = head;


        for (int i = 0; i < index; i++) {
            current = current.next; // Move to the next node
        }
        current.value = item;
    }

    public int size() {
        return size;
        }

    public int indexOf(Integer item) {
       //imporant
        if (item == null) {
            throw new NullPointerException("Item cannot be null");
        }

        Node current = head;
       for(int i=0;i<size;i++) {
           if(current.value.equals(item)) {
               return i;
           }
           current = current.next;
       }
        return -1;
    }
    public boolean contains(Integer item) {
        //important
        if (item == null) {
            throw new NullPointerException("Item cannot be null");
        }

        Node current = head;

        while (current != null) {
            if (current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }
            return false;

    }

     public void clear() {
         head = null;
         tail = null;
         size = 0;
     }
    public boolean isEmpty() {
       return size() == 0;
    }
}

