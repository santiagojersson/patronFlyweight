package Concretos;

public class Edificio implements Estructura{

	private int x,y;
	private int altura;
	
	
	public Edificio(){}
	
	
	
	public int getX() {
		return x;
	}



	public void setX(int x) {
		this.x = x;
	}



	public int getY() {
		return y;
	}



	public void setY(int y) {
		this.y = y;
	}



	public int getAltura() {
		return altura;
	}



	public void setAltura(int altura) {
		this.altura = altura;
	}



	@Override
	public void draw() {
		System.out.println("Pintando un edificio en: "+x+" , "+y+" con una altura de: "+altura);	
	}

}
