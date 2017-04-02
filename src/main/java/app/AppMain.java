package app;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import modelo.Institucion;

public class AppMain {
	
	public static void main(String[] args){
		List<Institucion> listaInstituciones= new ArrayList<Institucion>();
		Institucion institucion1 = new Institucion("Universidad de San Buenaventura", "Universidad", null, true);
		Institucion institucion2 = new Institucion("Universidad del Cauca", "Universidad", (new GregorianCalendar(1827,4,24)).getTime(), true);
		
		listaInstituciones.add(institucion1);
		listaInstituciones.add(institucion2);
		
		System.out.println("Instituciones registradas: ");
		for (Institucion i : listaInstituciones) {
			System.out.println(" * "+i.getNombre()+" - "+i.getTipo());
		}
	}

}
