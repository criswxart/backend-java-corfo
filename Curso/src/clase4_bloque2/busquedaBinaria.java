package clase4_bloque2;

import java.util.ArrayList;

public class busquedaBinaria {

	public static void main(String[] args) {
		ArrayList<Integer>numerosOrdenados=new ArrayList<>();
		
		for(int i=0; i<=10;i+=2) {
			numerosOrdenados.add(i);
			//System.out.println(numerosOrdenados.getLast());
		}
		Long tiempo_inicial=System.currentTimeMillis();
		
		int repuesta=buscarValor(numerosOrdenados, 4);
		if(repuesta==-1) {
			System.out.println("Valor no esta en el array");
		}else {
			System.out.println("Valor se encuentra en posicion "+repuesta);
		}
		System.out.println("Tiempo que se tardo: "+String.valueOf(System.currentTimeMillis()-tiempo_inicial));
		
		// TODO Auto-generated method stub

	}
	
	public static int buscarValor(ArrayList<Integer>array, int valorDeseado) {
		int indiceValorDeseado=-1;
		int limiteInferior=0;
		int limiteSuperior=array.size()-1;
		int indiceAMirar;
		
		do {
			indiceAMirar=(limiteInferior+limiteSuperior)/2;
			System.out.println("Inferior "+limiteInferior +" / Superior "+limiteSuperior+" / Indice a mirar "+indiceAMirar);		
			if(array.get(indiceAMirar)==valorDeseado) {
				indiceValorDeseado=indiceAMirar;	
				break;
			}else if(array.get(indiceAMirar)>valorDeseado) {				
				limiteSuperior=indiceAMirar-1;
			}else {
				limiteInferior=indiceAMirar+1;					
			}	
		}while((array.get(indiceAMirar)!=valorDeseado)&&(limiteInferior<limiteSuperior));
		
		
		return indiceValorDeseado;			
		
		
	}

}
