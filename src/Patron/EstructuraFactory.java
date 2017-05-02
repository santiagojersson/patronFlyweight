package Patron;

import java.util.HashMap;
import java.util.List;

import Concretos.Arbol;
import Concretos.Edificio;
import Concretos.Estructura;
import Concretos.Poste;
import Concretos.TipoEstructura;

public class EstructuraFactory {
	
	public static HashMap<TipoEstructura, Estructura> miMapa = new HashMap();
	
	public static Estructura getEstructura(TipoEstructura t){
		//System.out.println(t);
		Estructura estructura = miMapa.get(t);
		if(miMapa.get(t)==null){
			switch(t){
			case ARBOL: estructura = new Arbol();break;
			case EDIFICIO: estructura = new Edificio();break;
			case POSTE: estructura = new Poste();break;
			}
			miMapa.put(t, estructura);
		}
		return estructura;		
	}

}
