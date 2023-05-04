package ej4;

//extensión de la clase padre
public class Lavadora extends Electrodomestico {

	//
	int carga=5;
	
	
	//constructor por defecto
	public Lavadora(int precio, double peso, int carga) {
		super(precio, peso);
		this.carga = carga;
	}



	//constructor con precio y peso
	public Lavadora(int precio, double peso) {
		super(precio, peso);
		// TODO Auto-generated constructor stub
	}


	//
	public int getCarga() {
		return carga;
	}


	//
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public void precioFinal() {
		//llama al metodo padre
		super.precioFinal();
				
		//
		if (carga>30) {
			precio=+50;
		}
		
		
		
	}
	

}
