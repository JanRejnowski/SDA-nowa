package pl.sdacademy.main;

import pl.sdacademy.interfaces.IAction;
import pl.sdacademy.model.Bike;
import pl.sdacademy.model.Car;
import pl.sdacademy.model.Cat;
import pl.sdacademy.model.Dog;
import pl.sdacademy.model.OpelCar;
import pl.sdacademy.model.RenaultCar;
import pl.sdacademy.utils.TableUtils;

public class Main {

	public Main() {

	}

	public static void main(String[] args) {
		Car[] carTable = new Car[2];
		IAction[] iActionTable = new IAction[3];

		Bike marcinsRomet = new Bike();
		OpelCar adamsOpel = new OpelCar();
		RenaultCar maciejsRenault = new RenaultCar();

		// maciejsRenault.refuel();
		// adamsOpel.refuel();
		// maciejsRenault.run();
		// marcinsRomet.run();
		carTable[0] = adamsOpel;
		carTable[1] = maciejsRenault;

		iActionTable[0] = marcinsRomet;
		iActionTable[1] = adamsOpel;
		iActionTable[2] = maciejsRenault;

		for (int i = 0; i < carTable.length; i++) {
			System.out.println(carTable[i].getInfo());

		}

		for (int i = 0; i < iActionTable.length; i++) {
			iActionTable[i].run();
		}

		voiceFromAnimals();

		TableUtils tableUtils = new TableUtils();

		int i = 0, j = 2;
		tableUtils.print(iActionTable);
		tableUtils.changeElement(iActionTable, i, j);
		tableUtils.print(iActionTable);
		
	}

	/**
	 * Metoda która wyświetla czynność zaimplementowaną w metodzie voice. Jest
	 * to przykład bez interfejsu
	 */
	private static void voiceFromAnimals() {
		Object[] animalsTable = new Object[2];
		Dog dog = new Dog();
		Cat cat = new Cat();
		animalsTable[0] = dog;
		animalsTable[1] = cat;
		for (int i = 0; i < animalsTable.length; i++) {
			Object animal = animalsTable[i];
			if (i == 0) {
				Dog animal1 = (Dog) animal;
				animal1.voice();
			} else {
				Cat animal2 = (Cat) animal;
				animal2.voice();
			}
		}
	}

}
