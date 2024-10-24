package clase4_bloque2;

import java.util.ArrayList;

public class busquedaPorInterpolacion {

	public static void main(String[] args) {
		ArrayList<Integer>numerosOrdenados=new ArrayList<>();
		
		for(int i=0; i<=10;i+=2) {
			numerosOrdenados.add(i);
			System.out.println(numerosOrdenados.getLast());
		}
		
		System.out.println(buscarValor(numerosOrdenados,4));
	}
	
	public static int buscarValor(ArrayList<Integer>array, int valorDeseado) {
		int indiceValorDeseado=-1;
		int limiteInferior=0;
		int limiteSuperior=array.size()-1;
		int indiceAMirar;
		
		
		
		do {	
						
			indiceAMirar=limiteInferior+( 
					( (valorDeseado-array.get(limiteInferior))*(limiteSuperior-limiteInferior) )
					/
					( array.get(limiteSuperior)-array.get(limiteInferior) )					
					);	
			
			System.out.println("Inferior "+limiteInferior +" / Superior "+limiteSuperior+" / Indice a mirar "+indiceAMirar);
			
			if((indiceAMirar>limiteSuperior) || (indiceAMirar<limiteInferior)) {
			break;	
			}
			else if(array.get(indiceAMirar)==valorDeseado){
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
