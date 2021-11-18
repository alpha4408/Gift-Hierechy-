package com.apsucodes.datastructures;

class FruitBasket extends Gift {

    private int fruit_no;
    private boolean citrus_fruits_indication;

    //created this constructor for the id
    public FruitBasket(String id) {
        super(id);
    }

    public void fruit_no() {
        if (size == Character.toUpperCase('S')) {
            this.fruit_no = 6;
        }
        if (size == Character.toUpperCase('M')) {
            this.fruit_no = 9;

        }
        if (size == Character.toUpperCase('L')) {
            this.fruit_no = 15;
        }

    }

    public void Set_citrus_fruits_indication(boolean hasCitrus) {
        this.citrus_fruits_indication = hasCitrus;
        if (hasCitrus) {
            price = price + 5.99;
        }
    }

    public int get_fruit_no() {
        return fruit_no;
    }

    public boolean get_citrus_fruits_indication() {
        return citrus_fruits_indication;
    }

    public void Display() {
        System.out.println("FruitBasket[ numFruits=" + fruit_no + " haveCitrus=" + citrus_fruits_indication + " size="
                + size + " id=" + id + " price=" + String.format("%.02f", price) + "]");

    }

}
