package pl.sdacademy.lambda.example1;

import pl.sdacademy.example1.model.Bulka;
import pl.sdacademy.example1.model.Kanapka;
import pl.sdacademy.example1.model.Maslo;
import pl.sdacademy.example1.model.Warzywo;

public class UmiejetnosciPanaKanapki implements IUmiejetnosci {

    @Override
    public Kanapka zrobKanapka(Bulka bulka, Maslo maslo, Warzywo warzywo) {
	return new Kanapka("pusta");
    }

}
