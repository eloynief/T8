package ej1;

public class HoraExacta extends Hora{

	
	
	
	
	
	int segundos;
	
	public HoraExacta(int hora,int minuto,int segundo){
		
	}
	
	public void setSegundo(int valor){
		
		if (valor<60&&valor>=0) {
			segundos = valor;
			
		}
		else  {
		valor=0;	
		}
		
		
	}
	//hace override del inc de clase hora
	@Override
	public void inc() {
		//
		segundos++;
		if(segundos>=60) {
			segundos=0;
			super.inc();
		}
	}
	
	
	
}
