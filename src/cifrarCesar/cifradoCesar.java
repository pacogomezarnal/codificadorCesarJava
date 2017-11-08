package cifrarCesar;

import java.util.Scanner;

/**
* Este es un codificador Cesar de paso entre 1 y 10
*
* @author Paco Gomez
* @version 0.1
*/
public class cifradoCesar {

	public static void main(String[] args) {
		//Inicializacion
		String alfabeto="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ ";
		String alfabetoCod="";
		String alfabetoCodTemp="";
		String fraseCodificar="";
		String fraseCodificada="";
		Scanner sc = new Scanner(System.in);
		int paso=0;
		int posicionLetra=0;
		
		//Pedir al usuario el paso de codificacion
		do {
			System.out.println("Introduce el paso entre [1-10]");
			paso=sc.nextInt();			
		}while((paso>10)||(paso<1));
		
		//Generar el alfabeto de codificacion
		for(int i=0;i<alfabeto.length()-paso;i++) {
			alfabetoCod=alfabetoCod+alfabeto.charAt(i);
		}

		for(int i=alfabeto.length()-paso;i<alfabeto.length();i++) {
			alfabetoCodTemp=alfabetoCodTemp+alfabeto.charAt(i);
		}
		
		alfabetoCod=alfabetoCodTemp+alfabetoCod;


		//Comienza la codificacion
		System.out.println("Introduce la frase a codificar");
		sc.nextLine();
		fraseCodificar=sc.nextLine();
		fraseCodificar=fraseCodificar.toUpperCase();
		for(int i=0;i<fraseCodificar.length();i++) {
			posicionLetra=alfabeto.indexOf(fraseCodificar.charAt(i));
			fraseCodificada=fraseCodificada+alfabetoCod.charAt(posicionLetra);
		}
		System.out.println(fraseCodificada);
		
	}

}
