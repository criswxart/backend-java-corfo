package clase1_bloque1;

public class Ejercicio_3 {

	public static void main (String[] args) {
		// Calcule el área y volumen de un cilindro
		final double pi = 3.1415;
		double altura = 10d;
		double radio = 15d;
		double area = 2 * pi * radio * (radio + altura);
		double volumen = pi * Math.pow(radio, 2) * altura;
		
		System.out.println("El área del cilindro es: " + area);
		System.out.println("El volumen del cilindro es: " + volumen);
		
	}
}
