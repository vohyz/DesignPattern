package foobar.product.pasture_product;

import foobar.product.product_interface.Animal;

public class Pork implements Animal {
    protected int SHELFLIFE;
    protected String NAME;

    public Pork() {
        this.NAME = "pork";
        this.SHELFLIFE = 10;
    }
    public String getname(){
        return this.NAME;
    }
    @Override
    public void timeLost(){
        if(SHELFLIFE > 0){
            SHELFLIFE -= 1;
        } else {
            remove();
        }
    }
    @Override
    public void remove(){
        /** 
         * storeHouse中删除
         *
         */
    }
}