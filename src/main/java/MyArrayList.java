
public class MyArrayList {
    private Integer[] list;
    private int size;


    public MyArrayList() {
        list = new Integer[10];
        size = 0;

    }

    public void addLast(Integer item) {
        //important
        if (item == null) {
            throw new NullPointerException();
        }
        if (size == list.length) {
            resize();
        }
            list[size] = item;
            size++;

}
    private void resize() {
        // Create a new array with double the current size
        Integer[] newArray = new Integer[list.length * 2];

        // Copy the existing elements to the new array
        System.arraycopy(list, 0, newArray, 0, size);

        // Replace the old array with the new one
        list = newArray;

    }

    public void add(int index, Integer item) {
        //important
        if (item == null) {
            throw new NullPointerException();
        }
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (size == list.length) {
            Integer[] newlist = new Integer[list.length * 2];
            System.arraycopy(list, 0, newlist, 0, list.length);
            list = newlist;
        }

        for (int i = size; i > index; i--) {
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


    public int get(int index) {
        //important
      //  if (index < 0 || index >= size) {
        //    throw new IndexOutOfBoundsException("index:" + index + ", size:" + size);
        //}
        return list[index];
    }


    public void set(int index, Integer item) {
        //important
        if (item == null) {
            throw new NullPointerException();
        }
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        list[index] = item;


    }


    public int size() {
        return size;
    }


    public int indexOf(Integer item) {
        //important
        if (item == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return i;

            }
        }
        return -1;
    }

    public boolean contains(Integer item) {
        //important
        if (item == null) {
            throw new NullPointerException();
        }
        for (int i = 0; i < size; i++) {
            if (list[i].equals(item)) {
                return true;
            }
        }
        return false;


    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            list[i] = null;
        }
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
        // Return true if there are no elements
    }


}








