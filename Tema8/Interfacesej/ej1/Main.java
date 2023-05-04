package ej1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int id;
		String nombre;
		int edad;
		
		Socio[] socio=new Socio[5];
		
		for(int i=0;i<socio.length;i++) {
			
			id=sc.nextInt();
			nombre=sc.next();
			edad=sc.nextInt();
			
			socio[i]=new Socio(id,nombre,edad);
			System.out.println(socio[i]);
		}
		
		
		
	}

}
