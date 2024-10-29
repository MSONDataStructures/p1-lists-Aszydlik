
public class MyLinkedList {

    private static class Node {
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
        if (item == null) {
            throw new NullPointerException();
        }

        Node newNode = new Node();
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void add(int index, Integer item) {
        //important
        if (item == null) {
            throw new NullPointerException();
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        if (index == 0) {
            addFirst(item);
        }
        Node newNode = new Node();
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }
        newNode.value = current.value;
        newNode.next = current.next;
        size++;

    }

    public Integer remove(int index) {
        //important
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        Integer removedValue;
        if (index == 0) {
            removedValue = head.value;
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < index - 1; i++) {
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
        if (index < 0 || index >= size()) {
            Node current = head;
            for (int i = 0; i < index; i++) {
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
        for (int i = 0; i < size; i++) {
            if (current.value.equals(item)) {
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

