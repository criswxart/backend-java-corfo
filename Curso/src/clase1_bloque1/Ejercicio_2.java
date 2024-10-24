package clase1_bloque1;

public class Ejercicio_2 {

	public static void main(String[] args) {
		//Calcule el área y perímetro de un círculo

		final double pi = 3.1415;
		double radio = 10.4d;
		double area = pi * Math.pow(radio, 2);
		double perimetro = 2 * pi * radio;
		System.out.println("valor de pi: " + pi);
		System.out.println("valor del radio: " + radio);

		System.out.println("El área del circulo es: " + area );
		System.out.println("El perimetro del circulo es: " + perimetro);
	}

}
