package clase4_bloque1;

public class capicua {

	
	
	public static void main(String[] args) {
		
		String numero="1333333533331";
		int inicio=0;
		int fin =numero.length()-1;	
		
		System.out.println(esCapicua(numero, inicio, fin));

	}


	public static boolean esCapicua(String num, int inicio, int fin) {
			
		System.out.println("comparando: "+num.charAt(inicio)+" y "+num.charAt(fin));
		if(num.charAt(inicio)!=num.charAt(fin)) {
			return false;
			
		}else if(inicio<fin) {
			return esCapicua(num,inicio+1,fin-1);
		}			
		return true;
	}
	
	
}
