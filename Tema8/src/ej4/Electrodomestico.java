package ej4;

public class Electrodomestico {

	//atributos
	int precio=100;
	String color="blanco";
	String consumo="F";
	double peso=5;
	
	public Electrodomestico(int precio, double peso) {
		this.precio = precio;
		this.peso = peso;
	}

	public Electrodomestico(int precio, String color, String consumo, double peso) {
		this.precio = precio;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public void comprobarConsumoEnergetico(char letra){
		
		
		
		
		
	}
	
	public void comprobarColor(String color){
		
		if(color=="blanco"||color=="negro"||color=="rojo"||color=="azul"||color=="gris") {
			
		}
		
	}
	
	public void precioFinal() {
		switch(consumo){
			case "A":{
				precio=+100;
			}
			case "B":{
				precio=+80;
			}
			case "C":{
				precio=+60;
			}
			case "D":{
				precio=+50;
			}
			case "E":{
				precio=+30;
			}
			case "F":{
				precio=+10;
			}
			
		}
		
		if(peso>0&&peso<=19) {
			precio=+10;
		}
		
		if(peso>19&&peso<50) {
			precio=+50;
		}

		if(peso>49&&peso<80) {
			precio=+80;
		}

		if(peso>79) {
			precio=+100;
		}
	}
	
	
	
	
	
}
