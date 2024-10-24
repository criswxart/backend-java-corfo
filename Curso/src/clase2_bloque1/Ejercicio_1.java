package clase2_bloque1;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio_1 {
	
	public static void main(String[] args) {
		ArrayList<Integer>arrayInteger=new ArrayList<Integer>();
	
		Integer suma=0;
		Integer valorMayor=0;
		Integer valorMenor=0;
		
		/*Creo un array con tamaño y valores random para los ejercicios*/
		arrayInteger.clear();
		for(int num:arrayConNumerosEnterosRandom(numeroRandom())) {
			arrayInteger.add(num);
		}	
		
		
		/*1 - Imprimir arreglo con numeros random*/
		for(int num:arrayInteger) {
			System.out.println(num);
		}
		
		
		/*2 - Calcular promedio con arreglo de enteros*/		
		for(int num:arrayInteger) {
			suma+=num;
		}
		System.out.println("La suma es:"+suma+" Cantidad de elementos "+arrayInteger.size()+" El promedio es:"+(suma/=arrayInteger.size()));
		
		/*3 - Obtener mayor valor en un array*/	
		valorMayor=arrayInteger.get(0);			
		for(int num:arrayInteger) {				
			if(num>valorMayor) {
				valorMayor=num;				
			}
		}
		System.out.println("El valor mas alto fue "+valorMayor);
		
		/*4 - Obtener menor valor en un array*/	
		valorMenor=arrayInteger.get(0);		
		for(int num:arrayInteger) {			
			if(num<valorMenor) {
				valorMenor=num;					
			}
		}
		System.out.println("El valor mas bajo fue "+valorMenor);
		
		
		/*5 - Rango del array*/	
		System.out.println("El rango entre "+valorMayor+" y "+valorMenor+" es: "+(valorMayor-=valorMenor));				
		
		
		 
	}
	
	
	public static Integer numeroRandom(){
		Random aleatorio = new Random();		
		return aleatorio.nextInt(1,20);		
	}
	
	public static ArrayList<Integer> arrayConNumerosEnterosRandom(int cantidad){
		ArrayList<Integer>arrayNumerosRandom=new ArrayList<Integer>();		
		//Random aleatorio = new Random();
		/*i<cantidad porque ser empieza en 0, de lo contrario random estaria creando un array con 1 mas de lo deseado*/
		for(int i=0;i<cantidad;i++) {
			arrayNumerosRandom.add(numeroRandom());	
			
		}	
		
		return arrayNumerosRandom;
	}
	

}
