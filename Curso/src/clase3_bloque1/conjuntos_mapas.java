package clase3_bloque1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.Random;
public class conjuntos_mapas {

	public static void main(String[] args) {		
		
		Set<Integer> numerosUno = new HashSet<>();
		Set<Integer> numerosDos = new HashSet<>();
		
		Set<Integer> interseccion = new HashSet<>();
		Set<Integer> diferencias = new HashSet<>();	
		
		
		Set<String> palabrasUnicas = new HashSet<>();	
		
		
		Map<String,Integer> conjunto = new HashMap<>();
		
		
		Map<String,String> rutFono = new HashMap<>();
		Map<String,String> fonoRut = new HashMap<>();
		
		for (int i=0;i<=7;i++) {
			numerosUno.add(numeroRandom());				
		}
		for (int i=0;i<=3;i++) {
			numerosDos.add(numeroRandom());				
		}
		
		System.out.println(numerosUno);
		System.out.println(numerosDos);
		
		/*Ejercio 1 - Intereseccion, dejar en el conjunto solo los elementos que hay en comun vs otro conjunto*/		
		interseccion.addAll(numerosUno);		
		interseccion.retainAll(numerosDos);	
		System.out.println("Interseccion "+interseccion);
		
		
		/*Ejercicio 2 - solo conservar diferencias entre los 2*/
		diferencias.addAll(numerosUno);
		diferencias.removeAll(numerosDos);	
		System.out.println("Diferencias "+diferencias);	
	
		
		/*Ejercicio 3 - Si conjunto B es subconjunto  dentro de conjunto 3*/		
		if( numerosUno.containsAll(numerosDos)){
			System.out.println("Conjunto 2 SI esta adentro de conjunto 1");
		}else {
			System.out.println("Conjunto 2 no esta en conjunto 1");
		}
		
		
		
		/*Ejercicio 4- Crear set con palabras unicas*/
		
		String text="Esta es la casa que construyó Jack. Esta es la malta que yacía en la casa que construyó Jack. Esta es la rata que se comió la malta que yacía en la casa que construyó Jack.";
		
		String[]palabras=text.split(" ");
		
		for (String t:palabras) {	
			palabrasUnicas.add(t);
			
			
		}
		System.out.println("Palabras diferentes o unicas  de una cadena: "+palabrasUnicas);
		
		
		/*Ejercicio 5 - crear hashmap con todas las palabras del texto*/
		for (String t:palabras) {
			if(conjunto.containsKey(t)) {
				conjunto.put(t, conjunto.get(t)+1);
			}else {
				conjunto.put(t, 1);
			}
		}	
		
		System.out.println("Palabras y su frecuencia en el conjunto: "+conjunto);
		
		
		/*Ejercicio 6 - dar vuelta la clave y valor en un mapa*/		
		rutFono.put("1-1", "+569 1");
		rutFono.put("2-1", "+569 2");
		rutFono.put("3-1", "+569 3");
		rutFono.put("4-1", "+569 4");

		for (String t:rutFono.keySet()) {
			fonoRut.put(rutFono.get(t), t);
			
		}		
		System.out.println("Keyset"+ rutFono.keySet());
		System.out.println("Keyset"+ fonoRut.keySet());
		
		
		

	}
	
	
	public static Integer numeroRandom(){
		Random aleatorio = new Random();		
		return aleatorio.nextInt(0,20);
		
	}
	
	
	

}
