package foobar.product.proxy;

import foobar.Building.*;
import foobar.product.product_interface.*;
import foobar.product.adapter.Adapter;

public class PlantProxy extends Adapter {
	private StoreHouse myshop;
	
	public PlantProxy(StoreHouse store) {
		this.myshop = store;
	}
	
	@Override
	public void addAngle(Plant plant) {
		this.myshop.addAngle(plant);
	}
	@Override
	public void addDemon(Plant plant) {
		this.myshop.addBattle(plant);
	}
	@Override
	public void addBattle(Plant plant) {
		this.myshop.addDemon(plant);
	}
}
