package ar.edu.unq.po2.tp3;

import java.util.ArrayList;

public class Multioperador {
	private ArrayList<Integer> multi= new ArrayList<Integer>();
	
	public Multioperador() {
		
	}

	public ArrayList<Integer> getMulti() {
		return multi;
	}

	public void setMulti(ArrayList<Integer> multi) {
		this.multi = multi;
	}
	
	public int sumaMulti() {
		int suma=0;
		
		for(int i=0; i<multi.size(); i++) {
			suma= suma + multi.get(i);
		}
		return suma;
	}
	
	public int restaMulti() {
		int resta=0;
		
		for(int i=0; i<multi.size(); i++) {
			resta= resta - multi.get(i);
		}
		return resta;
	}
	
	public int productoMulti() {
		int producto=1;
		
		for(int i=0; i<multi.size(); i++) {
			producto= producto * multi.get(i);
		}
		return producto;
	}
	public void addNumero(int valor) { //
		multi.add(valor);
	}

}