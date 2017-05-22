package pl.sdacademy.model;

import pl.sdacademy.enums.BikeBodyType;
import pl.sdacademy.interfaces.IAction;

public class Bike extends Vehicle implements IAction{

	BikeBodyType bikeBodyType;

	public Bike() {
		super("foot", 2, 15); // wykonanie konstruktora klasy nadrzednej
	}

	public Bike(BikeBodyType bikeBodyType) {
		this();
		setBikeBodyType(bikeBodyType);
	}

	public Bike(BikeBodyType bikeBodyType, double weight) {
		this(bikeBodyType);
		setWeight(weight);
	}

	public BikeBodyType getBikeBodyType() {
		return bikeBodyType;
	}

	public void setBikeBodyType(BikeBodyType bikeBodyType) {
		this.bikeBodyType = bikeBodyType;
	}

	public String getInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public void run() {
		System.out.println("Wsiadam na rower i jade");

	}

}