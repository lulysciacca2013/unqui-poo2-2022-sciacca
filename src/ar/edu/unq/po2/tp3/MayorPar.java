package ar.edu.unq.po2.tp3;

import java.util.ArrayList;


public class MayorPar {
	private ArrayList<Integer> mayor = new ArrayList<Integer>();
	

	public MayorPar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
		
	public ArrayList<Integer> getMayor() {
		return mayor;
	}


	public void setMayor(ArrayList<Integer> mayor) {
		this.mayor = mayor;
	}


	public void addNumero(int valor) {
		mayor.add(valor);
	}

	
	public int mayorDigitosPares() { // este metodo me da el número del arreglo que tiene la mayor cantidad de digitos pares
	    int numero=0;
	    int cantidad=0;
	    int elMayor=0;
	    int elNumero=0;
	    	    
	    for (int i=0; i< mayor.size(); i++) {
	    		    	
	       cantidad = desarmoNumero(mayor.get(i));
	       elNumero = mayor.get(i);
	       if(cantidad> elMayor) {
	    		elMayor= cantidad;
	    		numero = elNumero;
	    	}
	    }
	    return numero;
	}
	
	public int desarmoNumero(int num) { //desarma el número y lo carga en un arrayList para que despues pueda contar la cant de n° pares
	   ArrayList<Integer> auxiliar = new ArrayList<Integer>();	
		while (num !=0) {
			auxiliar.add(num%10);
			num= num/10;
		}
		return contadorPares(auxiliar);
	}
	
	public int contadorPares (ArrayList<Integer> aux) { /// metodo para contar los elementos pares
		int cant_pares=0; 
		
		for (int i=0; i< aux.size(); i++) {
			if(aux.get(i)%2 == 0) {
				cant_pares ++;
			}
			
		}
		return cant_pares;
	
	}
}