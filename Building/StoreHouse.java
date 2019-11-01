package foobar.Building;

import foobar.product.product_interface.*;
import java.util.Vector;
/** 这个文件是产品组重写的，要合并一下 */
public class StoreHouse implements Barnmethods {
	private Vector<Plant> angleCotton;
	private Vector<Plant> demonCotton;
	private Vector<Plant> battleMelon;
	private Vector<Animal> chicken;
	private Vector<Animal> fish;
	private Vector<Animal> frog;
	private Vector<Animal> mutton;
	private Vector<Animal> pork;

	public StoreHouse(){
		this.angleCotton = new Vector<Plant>();
		this.demonCotton = new Vector<Plant>();
		this.battleMelon = new Vector<Plant>();
		this.chicken = new Vector<Animal>();
		this.fish = new Vector<Animal>();
		this.frog = new Vector<Animal>();
		this.mutton = new Vector<Animal>();
		this.pork = new Vector<Animal>();
	}

	public void addAngle(Plant plant) {
		this.angleCotton.add(plant);
		System.out.println("AngleCotton upgrade");
	}

	public void addDemon(Plant plant) {
		this.demonCotton.add(plant);
		System.out.println("DemonCotton upgrade");
	}

	public void addBattle(Plant plant) {
		this.battleMelon.add(plant);
		System.out.println("BattleMelon upgrade");
	}

	public void addChicken(Animal animal){
		this.chicken.add(animal);
		System.out.println("Chicken upgrade");
	}
	public void addFish(Animal animal){
		this.fish.add(animal);
		System.out.println("Fish upgrade");
	}
	public void addFrog(Animal animal){
		this.frog.add(animal);
		System.out.println("Frog upgrade");
	}
	public void addMutton(Animal animal){
		this.mutton.add(animal);
		System.out.println("Mutton upgrade");
	}
	public void addPork(Animal animal){
		this.pork.add(animal);
		System.out.println("Pork upgrade");
	}

}
