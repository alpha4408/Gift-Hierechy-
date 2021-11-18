package com.apsucodes.datastructures;

class SweetBasket extends Gift {

    public boolean nuts_indication;

    //created this constructor for the id
    public SweetBasket(String id) {
        super(id);
    }

    public void Set_nuts_indication(boolean t) {
        this.nuts_indication = t;
    }

    public boolean get_nuts_indication() {
        return nuts_indication;
    }

    public void Display() {
        System.out.println(
                "SweetBasket[havenuts= " + nuts_indication + " size=" + size + " id= " + id + " price= " + price + "]");
    }

}