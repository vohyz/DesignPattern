package foobar.product.pasture_product;

import foobar.product.product_interface.Animal;

public class Beef implements Animal {
    protected int SHELFLIFE = 10;
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