package pl.sdacademy.lambda.example1;

import java.util.function.Predicate;

import pl.sdacademy.example1.model.Bulka;
import pl.sdacademy.example1.model.Jedzenie;
import pl.sdacademy.example1.model.Kanapka;
import pl.sdacademy.example1.model.Maslo;
import pl.sdacademy.example1.model.Warzywo;

public class Main {

	public static void main(String[] args) {

		IUmiejetnosci umiejetnosciPanaKanapki = new IUmiejetnosci() {

		    @Override
		    public Kanapka zrobKanapka(Bulka bulka, Maslo maslo, Warzywo warzywo) {
			String elementyKanapki = bulka.getNazwa() + " " + maslo.getNazwa() + " " + warzywo.getNazwa();
			Kanapka kanapka = new Kanapka("Bulka z pomidorem");
			kanapka.setSkladniki(elementyKanapki);
			return kanapka;
		    }
		};
		
		Bulka kajzerkaBulka = new Bulka("Kajzerka");

		Maslo ekstraMaslo = new Maslo("Ekstra");
		Warzywo pomidorWarzywo = new Warzywo("Pomidor");

		Kanapka wiosennaKanapka = umiejetnosciPanaKanapki.zrobKanapka(kajzerkaBulka, ekstraMaslo, pomidorWarzywo);
		System.out.println("Kanapka zrobiona przez Pana Kanapke :" + wiosennaKanapka);
		
		IUmiejetnosci umiejetnosciPaniJadzi = (bulka, maslo, warzywo) -> {
		    return new Kanapka("?");
		};

		IUmiejetnosci umiejetnosciPanaFranka = (bulka, maslo, warzywo) -> {
		    Kanapka kanapka = new Kanapka("studencka");
		    kanapka.setSkladniki(bulka + "" + maslo);
		    return kanapka;
		};
		
		Kanapka kanapkaPanaFranka = umiejetnosciPanaFranka.zrobKanapka(kajzerkaBulka, new Maslo("zBiedry"), null);
		System.out.println("Kanapka zrobiona przez Pana Franka  :" + kanapkaPanaFranka);
		Kanapka wiosennaKanapka2 = umiejetnosciPaniJadzi.zrobKanapka(kajzerkaBulka, ekstraMaslo, pomidorWarzywo);
		System.out.println("Kanapka zrobiona przez Panią Jadzie :" + wiosennaKanapka2);
		
		Predicate<Jedzenie> posiadaMasloExtra = (elementKanapki) -> {
		    return elementKanapki.getNazwa().equalsIgnoreCase("ekstra")
			    || elementKanapki.getSkladniki().contains("Ekstra");
		};
		
		Jedzenie[] jedzenie = new Jedzenie[] { kajzerkaBulka, wiosennaKanapka, pomidorWarzywo };
		for (int i = 0; i < jedzenie.length; i++) {
		    System.out.print(jedzenie[i]);
		    if (posiadaMasloExtra.test(jedzenie[i])) {
			System.out.print(" Znalezione maslo ekstra");
		    }
		    System.out.println(" ");
	}
	
	}
}
