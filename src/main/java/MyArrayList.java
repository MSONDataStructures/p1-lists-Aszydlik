/**
 * The MyArrayList class is the implementation of an array list of integers.
 * <p>
 * The data in the list will be stored in an array, and the basic
 * <code>ArrayList</code> methods <code>add</code>, <code>remove</code>,
 * <code>set</code>, <code>get</code>, and <code>size</code> will be
 * implemented, as well as the additional methods <code>indexOf</code>,
 * <code>contains</code>, <code>clear</code>, and <code>isEmpty</code>.
 * <p>
 * Students should not, obviously, use the <code>java.util.ArrayList</code>
 * Java library class. The choices that you make regarding the management
 * of the list array will influence how the methods are implemented. You
 * may add any additional instance fields as desired. The choice that has
 * been made for you is that the default constructor should give an initial
 * capacity of ten elements. Be sure to avoid the <code>IndexOutOfBoundsException</code>,
 * and you will need to throw the <code>NullPointerException</code> in places
 * as specified in the Javadoc and the JUnit <code>MyArrayListTest</code> class.
 */
public class MyArrayList
{
    private Integer[] list;
    private int size;


    /**
     * Constructs an empty list with an initial capacity of ten.
     */
    public MyArrayList() {
        list = new Integer[10];
        size = 0;

    }

    public void addLast(Integer item) {
        //important
        if(item == null) {
            throw new NullPointerException();
        }
        if(size == list.length) {
            Integer[] newList = new Integer[list.length * 2];
            System.arraycopy(list, 0, newList, 0, size);
            list = newList;
        }
        list[size] = item;
    }

    public void add(int index, Integer item) {
        //important
        if(item == null) {
            throw new NullPointerException();
        }
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if(size == list.length){
            Integer[] newlist = new Integer[list.length*2];
            System.arraycopy(list, 0, newlist, 0, list.length);
            list = newlist;
        }

        for(int i= size; i > index; i--) {
            list[i] = list[i - 1];
        }
        list[index] = item;
        size++;
        }

    public Integer remove(int index) {
        //important
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index; i < size - 1; i++) {
            list[i] = list[i + 1];
        }
        size--;
        return list[index];
    }



    public Integer get(int index) {
       //important
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

            return list.get(index);
        }
    }

    public void set(int index, Integer item) {
        //important
        if(item == null) {
            throw new NullPointerException();
        }
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException();

            list[index] = item;
    }


    public int size() {
            //importan

        return size;
    }


    public int indexOf(Integer item) {
           for (int i = 0; i < elements.length; i++) {
                   if (elements[i].equals(item)) {
                       return i; // Return the index if the item is found
                   }
               }
               return -1; // Return -1 if the item is not found
           }
    /**
     * Returns <code>true</code> if this list contains the specified Integer.
     * @param item Integer whose presence in this list is to be tested
     * @return true if this list contains the specified element
     * @throws NullPointerException if item is null
     */
    public boolean contains(Integer item) {
        for (Integer element : elements) {
            if (element.equals(item)) {
                return true; // Return true if the item is found
            }
        }



     public void clear () {

            for (int i = 0; i < elements.length; i++) {

            }
            elements[i] = null; // Set each element to null


            /**
             * Returns <code>true</code> if this list has no elements.
             * @return true if this list is empty
             */

            public boolean isEmpty () {
                return size == 0; // Return true if there are no elements
               }
            }
        }
    }

