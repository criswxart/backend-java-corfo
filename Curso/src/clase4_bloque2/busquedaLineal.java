package clase4_bloque2;

import java.util.ArrayList;
import java.util.Random;

public class busquedaLineal {

	public static void main(String[] args) {		
		Long tiempo_inicial=System.currentTimeMillis();
		System.out.println("el valor esta en el indice: "+ busqueda(2));
		System.out.println("Tiempo que se tardo: "+String.valueOf(System.currentTimeMillis()-tiempo_inicial)+" ms");

	}

	
	public static int busqueda(Integer valorDeseado) {
		int indiceResultado=-1;
		
		ArrayList<Integer>arrayRandom=new ArrayList<>();
		
		for(int i=0;i<numeroRandom();i++) {
			arrayRandom.add(numeroRandom());
			System.out.println(arrayRandom.get(i));
		}
		
		
		for(int i=0;i<arrayRandom.size();i++) {
			if (arrayRandom.get(i)==valorDeseado) {
				indiceResultado=i;
			}			
		}		
		
		return indiceResultado;
		
	}
	
	
	public static Integer numeroRandom(){
		Random aleatorio = new Random();		
		return aleatorio.nextInt(0,20);
		
	}
}
