package foobar.product.proxy;

import foobar.Building.*;
import foobar.product.product_interface.*;
import foobar.product.adapter.Adapter;

public class AnimalProxy extends Adapter {
    private StoreHouse myshop;

    public AnimalProxy(StoreHouse store) {
        this.myshop = store;
    }

    @Override
    public void addChicken(Animal animal){
		this.myshop.addChicken(animal);
    }
    @Override
	public void addFish(Animal animal){
		this.myshop.addFish(animal);
    }
    @Override
	public void addFrog(Animal animal){
		this.myshop.addFrog(animal);
    }
    @Override
	public void addMutton(Animal animal){
		this.myshop.addMutton(animal);
    }
    @Override
	public void addPork(Animal animal){
		this.myshop.addPork(animal);
	}
}
