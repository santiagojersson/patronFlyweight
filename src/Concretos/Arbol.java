package Concretos;

public class Arbol implements Estructura{

	private int x,y;
	private int age;
	
	public Arbol(){
		
	}
	
	@Override
	public void draw() {
		System.out.println("Pintando un arbol en: "+x+" , "+y+" con una edad de "+age);
		
		
	}

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
