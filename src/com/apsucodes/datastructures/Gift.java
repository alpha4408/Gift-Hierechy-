package com.apsucodes.datastructures;

public abstract class Gift {

    protected String id;
    public char size;
    public double price;

    public Gift(String id) {
        this.id = id;
    }

    public Gift(char size){
        this.size = size;
    }

    public void Set_size(char c) {
        this.size = c;
    }

    public void price() {
        if (size == Character.toUpperCase('S') ) {
            this.price = 19.99;
        }

        if (size == Character.toUpperCase('M') ) {
            this.price = 29.99;
        }

        if (size == Character.toUpperCase('L') ) {
            this.price = 39.99;
        }

    }

}