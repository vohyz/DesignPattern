package foobar.product.product_factory;

import foobar.product.Product;
import foobar.product.product_interface.*;
import foobar.product.pasture_product.*;

public class PastureFactory extends Product {
    public int beefCount = 0;
    @Override
    public Animal getAnimal(String animalName){
        if(animalName == null){
            return null;
        }
        if(animalName.equalsIgnoreCase("Beef")){
            return new Beef();
        } else if(animalName.equalsIgnoreCase("Sheep")){
            return new Sheep();
        }
        return null;
    }
    @Override
    public Plant getPlant(String plant){
        return null;
    }
}