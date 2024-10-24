package clase1_bloque1;

public class Ejercicio_1 {

	public static void main (String [] args) {
		//Calcule el área y perímetro de un rectángulo
		double largo = 25.6f;
		double alto = 15.6f;
		double area = largo * alto;
		double perimetro = 2 * alto + 2 * largo;
		
		System.out.println("Área del rectangulo es: " + area + " mt2");
		System.out.println("Perimetro del rectangulo es: " + perimetro + " mt");
	}
}
