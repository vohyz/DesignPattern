package foobar.product.product_factory;

import foobar.product.Product;
import foobar.product.product_interface.*;
import foobar.product.pasture_product.*;

public class PastureFactory extends Product {
    @Override
    public Animal getAnimal(String animalName){
        if(animalName == null){
            return null;
        }
        if(animalName.equalsIgnoreCase("Chicken")){
            return new Chicken();
        } else if(animalName.equalsIgnoreCase("Fish")){
            return new Fish();
        } else if(animalName.equalsIgnoreCase("Frog")){
            return new Frog();
        } else if(animalName.equalsIgnoreCase("Mutton")){
            return new Mutton();
        } else if(animalName.equalsIgnoreCase("Pork")){
            return new Pork();
        }
        return null;
    }
    @Override
    public Plant getPlant(String plant){
        return null;
    }
}