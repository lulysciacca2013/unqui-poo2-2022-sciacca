package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;



public class Counter {
	
	private ArrayList<Integer> cuenta= new ArrayList<Integer>();
	
	
	public Counter() { //constructor
				
	}

		
	public List<Integer> getCuenta() { // mostrar /
		return cuenta;
	}


	public void setCuenta(ArrayList<Integer> Cuenta) { // modificar
		this.cuenta = Cuenta;
	}
	
	public void addNumero(int valor) {
		cuenta.add(valor);
	}


	public int contadorPares () { // metodo para contar los elementos pares
		int cant_pares=0; 
		
		for (int i=0; i< cuenta.size(); i++) {
			if(cuenta.get(i)%2 == 0) {
				cant_pares ++;
			}
			
		}
		return cant_pares;
		
	}
	
	public int contadorImpares () { // metodo para contar los elementos impares
		int cant_impares=0;
		
		for (int i=0; i<cuenta.size(); i++) {
			if(cuenta.get(i)%2 != 0) {
				cant_impares ++;
			}
			
		}
		return cant_impares;
	}
	
	public int contadorMultiN (int n) { // metodo para contar los elementos múltiplos de un número dado
		int cant_n=0;
		
		for (int i=0; i<cuenta.size(); i++) {
			if(cuenta.get(i)%n == 0) {
				cant_n ++;
			}
			
		}
		return cant_n;
	}


	
	
}
