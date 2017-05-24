package pl.sdacademy.model;

import java.util.ArrayList;
import java.util.List;

import pl.sdacademy.enums.Miasto;
import pl.sdacademy.enums.Plec;

public class ModelMain {

	
	public static void main(String[] args) {
		List<Kursant> listaKursantow = new ArrayList<>();
		Kursant tomek = new Kursant();
		tomek.setImie("Tomek");
		tomek.setNazwisko("Placek");
		tomek.setPlec(Plec.MEZCZYZNA);
		tomek.setWiek(22);
		tomek.setMiasto(Miasto.GDANSK);
		Kursant adam = new Kursant();
		adam.setImie("Adam");
		adam.setNazwisko("Kowal");
		adam.setPlec(Plec.MEZCZYZNA);
		adam.setWiek(23);
		adam.setMiasto(Miasto.KRAKOW);
		Kursant marta = new Kursant();
		marta.setImie("Marta");
		marta.setNazwisko("Nowak");
		marta.setPlec(Plec.MEZCZYZNA);
		marta.setWiek(31);
		marta.setMiasto(Miasto.WARSZAWA);
		Kursant sebek = new Kursant();
		sebek.setImie("Sebek");
		sebek.setNazwisko("Rak");
		sebek.setPlec(Plec.MEZCZYZNA);
		sebek.setWiek(24);
		sebek.setMiasto(Miasto.WARSZAWA);
		Kursant pawel = new Kursant();
		pawel.setImie("Pawel");
		pawel.setNazwisko("Szymczyk");
		pawel.setPlec(Plec.MEZCZYZNA);
		pawel.setWiek(17);
		pawel.setMiasto(Miasto.POZNAN);
		
		listaKursantow.add(tomek);
		listaKursantow.add(adam);
		listaKursantow.add(marta);
		listaKursantow.add(pawel);
		
		Predykaty predykaty = new Predykaty();
		for (int i = 0; i < listaKursantow.size(); i++) {
			if(predykaty.jestDorosly().test(listaKursantow.get(i))) {
				System.out.println(listaKursantow.get(i));
			}
		}
		System.out.println();
		listaKursantow.stream().filter(predykaty.jestDorosly()).forEach(kursant -> System.out.println(kursant));
		
		System.out.println("Wykorzystanie podwojnego dwokropka - ::");
		listaKursantow.stream().forEach(System.out::println);
		
		//wypisz niepelnoletnich
		System.out.println("Lista niepelnoletnich");
		listaKursantow.stream().filter(predykaty.jestNiepelnoletni()).forEach(kursant -> System.out.println(kursant));
		
		System.out.println("Lista ludzi z Poznania");
		listaKursantow.stream().filter(predykaty.jestZPoznania()).forEach(kursant -> System.out.println(kursant));
		
		System.out.println("Zlicza kobiety z Poznania");
		Object[] tablicaKobiet = listaKursantow.stream().filter(predykaty.jestKobieta().and(predykaty.jestZPoznania())).toArray();
		System.out.println(tablicaKobiet.length);
	}
	

}
