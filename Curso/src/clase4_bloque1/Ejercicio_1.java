package clase4_bloque1;

public class Ejercicio_1 {

	public static void main(String[] args) {
		//saber si es capicua
		//comentario para probar commit
		
		int [] numeros = {1,7,7,1};
		
		
	}
	
	static boolean isCapicua(int [] numeros) {
		
		int inicio = numeros[0];
		int fin = numeros[numeros.length -1];
		
		if(inicio != fin) {
			return false;
		}
		
		return isCapicua(numeros);
	}

}
