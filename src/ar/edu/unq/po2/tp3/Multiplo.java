package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multiplo {
	int x;
	int y;
	
	public Multiplo(int x, int y) {
		this.multiploIgual(getX(), getY());
						
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
	
	public int multiploIgual (int x , int y) {
		if(maximoMultiplo(x)== maximoMultiplo(y)) {
			return maximoMultiplo(x);
		}
		else {
			return -1;
		}
	}
	
	
	
	
	
	public int maximoMultiplo (int n) { // metodo para sacar el multiplo maximo de un numero n entre los numeros del 1 al 1000
		ArrayList<Integer> aux= new ArrayList<Integer>();
		 
		for (int i=1; i<1001; i++) {
			if((n !=0) && (i%n == 0)) {
				aux.add(i);
			}
			
		}
		return elMaximo(aux);
	}
	
	public int elMaximo(ArrayList<Integer> auxiliar) { //metodo para encontrar el elemento mayor de un arreglo de enteros
		int mayor=0;
		for (int i=0; i< auxiliar.size(); i++) {
			if(auxiliar.get(i) > mayor) {
				mayor = auxiliar.get(i);
			}
		}
		return mayor;
		
	}
	
	public String muestra() {
		String a="a,b,c";
		String s=a;
		String t;
		
		System.out.println(a);
		
		return a;
		
		
	}
	
	
}