package clase4_bloque1;

import java.util.Stack;

public class compararCaracteres {
	static int contador=0;
	static Stack<String>parentesis=new Stack<>();

	public static void main(String[] args) {	
		/*Validar que todos los parentesis tengan su cierre, en validarParentesis se van agregando y eliminando. 
		 * Si al final la pila esta vacia significa que todos los () estaban correctos */
		System.out.println(validarParentesis("(())"));			
	}

	
	public static boolean validarParentesis(String cadena) {
		int largo=cadena.length()-1;
		
		if(contador<=largo) {
			String valorCaracter=String.valueOf(cadena.charAt(contador));
			if((valorCaracter.equals(")") && contador==0) || (valorCaracter.equals("(") && contador==largo)){
				return false;
			}else {	
				if(contador==0) {
					parentesis.push(String.valueOf(cadena.charAt(contador)));
				}else {
						
					if( parentesis.isEmpty() || parentesis.lastElement().equals(String.valueOf(cadena.charAt(contador)))){
						parentesis.push(String.valueOf(cadena.charAt(contador)));
					}else {
						parentesis.removeLast();
					}
				}
				contador++;				
				return validarParentesis(cadena);
			}
		}	
		if (parentesis.isEmpty()) {
			return true;	
		}else {
			return false;
		}
		
		
	}
}
