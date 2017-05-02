package Patron;

import Concretos.Arbol;
import Concretos.Edificio;
import Concretos.Estructura;
import Concretos.Poste;
import Concretos.TipoEstructura;

public class Flyweight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creando 30 estructuras");
		for(int i = 0; i < 30; i++){
			TipoEstructura t = getRandomTipo();
			Estructura est = EstructuraFactory.getEstructura(t);
			switch(t){
			case ARBOL: setArbol(est);break;
			case EDIFICIO: setEdificio(est);break;
			case POSTE: setPoste(est);break;
			}
			est.draw();
			
		}
	}
	
	private static void setPoste(Estructura est) {
		Poste poste = (Poste)est;
		poste.setX(getRandomCoords());
		poste.setY(getRandomCoords());
		poste.setGrosor(getRandomSizes());
		
	}

	private static void setEdificio(Estructura est) {
		Edificio edificio = (Edificio)est;
		edificio.setX(getRandomCoords());
		edificio.setY(getRandomCoords());
		edificio.setAltura(getRandomSizes());
		
	}

	private static void setArbol(Estructura est) {
		Arbol arbol = (Arbol)est;
		arbol.setX(getRandomCoords());
		arbol.setY(getRandomCoords());
		arbol.setAge(getRandomSizes());
		
	}

	private static TipoEstructura getRandomTipo() {
	      int opc= (int)(Math.random()*3);
	      TipoEstructura tipo=null;
	      switch(opc){
	      case 0: tipo= TipoEstructura.ARBOL;break;
	      case 1: tipo= TipoEstructura.EDIFICIO;break;
	      case 2: tipo= TipoEstructura.POSTE; break;
	      }
	      return tipo;
	}
	
	private static int getRandomCoords() {
	      return (int)(Math.random()*100 );
	   }
	private static int getRandomSizes() {
	      return (int)(Math.random()*300);
	   }

}
