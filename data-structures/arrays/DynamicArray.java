//@original author - https://github.com/williamfiset

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class DynamicArray <T> implements Iterable <T> {

    private T [] arr;
    private int len = 0;
    private int capacity = 0;

    public DynamicArray(){
        this(16);
    }

    public DynamicArray(int capacity) {
        if(capacity < 0) throw new IllegalArgumentException("Illegal capacity: "+ capacity);
        this.capacity = capacity;
        arr = (T[]) new Object[capacity];
    }

    public int size(){
        return len;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public T get(int index){
        return arr[index];
    }

    public void set(T elem, int index){
        arr[index] = elem;
    }

    public void clear(){
        for(int i = 0; i < capacity; i++){
            arr[i] = null;
        }
        len = 0;
    }


    //add

    public void add(T elem){
        //resize
        if(len+1 >= capacity){ //if length is greater than capacity
            if(capacity == 0) capacity = 1;
            else capacity = capacity * 2; //double the size
            T[] new_arr = (T[]) new Object[capacity]; //create new array with new capacity
            for(int i = 0; i < len; i++){ //copy old values to new
                new_arr[i] = arr[i];
                }
            arr = new_arr; //set old array to new array
        }
        arr[len++] = elem; //add new element to array
    }


    public T removeAt(int rm_index){
        if(rm_index >= len && rm_index < 0) throw new IndexOutOfBoundsException();
        T data = arr[rm_index];
        T[] new_arr = (T[]) new Object[len - 1];

        for(int i = 0, j = 0; i < len; i++, j++){
            if(i == rm_index) j--;
            else new_arr[j] = arr[i];
        }
        arr = new_arr;
        capacity = --len;
        return data;

    }


    public boolean remove(Object obj){

        for(int i = 0; i < len; i++){
            if(arr[i].equals(obj)){
                removeAt(i);
                return true;
            }
        }

        return false;

    }

    public int indexOf(Object obj){
        
        for(int i = 0; i < len; i++){
            if (arr[i].equals(obj)) {
                return i;
            }
        }
        
        return -1;
    }

    public boolean contains(Object obj){
        return indexOf(obj) != -1;
    }



    @Override
    public Iterator<T> iterator() {
        return new java.util.Iterator <T>() {
            int index = 0;
            public boolean hasNext() {return index < len;}
            public T next() {return arr[index++];}

        };
    }

    @Override
    public String toString(){
        if(len == 0) return "[]";
        else {
            StringBuilder sb = new StringBuilder(len).append("[");
            for(int i =0; i < len - 1; i++){
                sb.append(arr[i] + ", ");
            }
            return sb.append(arr[len - 1] + "]").toString();
        }
    }

}