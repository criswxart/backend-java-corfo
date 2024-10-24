package clase4_bloque1;

public class fibonacci {
	public static int valor1=0;
	public static int valor2=1;
	public static int suma=0;
	public static int contador=1;

	public static void main(String[] args) {

		System.out.println(resultadoFibonacci(11));
	}

	public static int resultadoFibonacci(int nroIteraciones) {
		suma=valor1+valor2;
		if(valor1>0) {
			valor2=valor1;
		}
		valor1=suma;	
		
		if(contador<nroIteraciones) {
			contador++;	
			return resultadoFibonacci(nroIteraciones);
		}else {			
			return suma;
		}				
	}
}
