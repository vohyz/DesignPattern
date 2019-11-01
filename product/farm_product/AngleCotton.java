package foobar.product.farm_product;

import foobar.product.product_interface.Plant;

public class AngleCotton implements Plant {
    protected int SHELFLIFE;
    protected String NAME;

    public AngleCotton() {
        this.NAME = "anglecotton";
        this.SHELFLIFE = 10;
    }
    @Override
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