package org.example;

public class DinAra<E>{
    private Object[] elements;
    private int size;
    private final int DEFAULT_Capacity = 10;

    public DinAra(){
        elements = new Object[DEFAULT_Capacity];
        size = 0;
    }

}
