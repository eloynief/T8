package ej1;

public class Socio {

	int id=0;
	String nombre="";
	int edad=0;
	
	//constructor
	public Socio(int id, String nombre, int edad) {
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
	}
	
	interface Comparable{
		
	}
	
	void compareTo(){
		//hace print de id
		System.out.println(id);
		
		
		
	}
	
}
