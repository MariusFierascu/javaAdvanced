package com.sdaacademy.javaadvanced;

public class GenericHolder<T> {
    private T item;

    public GenericHolder(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;


    }
    @Override
    public String toString(){
        return item.toString ();
    }
}
