package foobar;

import foobar.product.*;
import foobar.product.product_interface.*;
import foobar.product.proxy.*;
import foobar.Building.*;
public class Main {

    public static void main(String[] args) {
        Product farmfactory = FactoryProducer.getFactory("Farm");
	    Product pasturefactory = FactoryProducer.getFactory("Pasture");

        Plant plant = farmfactory.getPlant("AngleCotton");
        Animal animal = pasturefactory.getAnimal("Beef");

        StoreHouse store = new StoreHouse();
        PlantProxy pproxy = new PlantProxy(store);
        AnimalProxy aproxy = new AnimalProxy(store);
        pproxy.addAngle(plant);
        aproxy.addMutton(animal);
    }
}
