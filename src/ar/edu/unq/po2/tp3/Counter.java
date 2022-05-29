package ar.edu.unq.po2.tp3;

import java.util.ArrayList;
import java.util.List;



public class Counter {
	
	private ArrayList<Integer> Cuenta= new ArrayList<Integer>();
	
	
	public Counter() { //constructor
				
	}

		
	public List<Integer> getCuenta() { // mostrar /
		return Cuenta;
	}


	public void setCuenta(ArrayList<Integer> Cuenta) { // modificar
		this.Cuenta = Cuenta;
	}
	
	public void addNumero(int valor) {
		Cuenta.add(valor);
	}


	public int contadorPares () { // metodo para contar los elementos pares
		int cant_pares=0; 
		
		for (int i=0; i< Cuenta.size(); i++) {
			if(Cuenta.get(i)%2 == 0) {
				cant_pares ++;
			}
			
		}
		return cant_pares;
		
	}
	
	public int contadorImpares () { // metodo para contar los elementos impares
		int cant_impares=0;
		
		for (int i=0; i<Cuenta.size(); i++) {
			if(Cuenta.get(i)%2 != 0) {
				cant_impares ++;
			}
			
		}
		return cant_impares;
	}
	
	public int contadorMultiN (int n) { // metodo para contar los elementos múltiplos de un número dado
		int cant_n=0;
		
		for (int i=0; i<Cuenta.size(); i++) {
			if(Cuenta.get(i)%n == 0) {
				cant_n ++;
			}
			
		}
		return cant_n;
	}


	
	
}
