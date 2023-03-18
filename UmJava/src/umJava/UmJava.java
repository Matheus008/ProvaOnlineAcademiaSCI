package umJava;

import java.util.Scanner;

public class UmJava {

	public static void main(String[] args) {
		
		double[] numero = new double[5];
		double media = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//Pegar os 5 n�meros e ja somar para depois obter a m�dia
		for (int i = 0; i < numero.length; i++) {
			System.out.print("Digite o "+(i+1)+"� n�mero: ");
			numero[i] = sc.nextDouble();
			media += numero[i];
		}
		
		//obter a m�dia
		media = media / 5;
		
		//Imprimir os n�meros pare
		System.out.println("N�meros Pares: ");
		for (int i = 0; i < numero.length; i++) {
			
			if(numero[i] %2 == 0) {
				System.out.print("|" + numero[i] + "| ");
			}
			
		}
		
		//Imprimir os n�meros �mpares
		System.out.println("\nN�meros �mpares: ");
		for (int i = 0; i < numero.length; i++) {
			
			if(numero[i] %2 != 0) {
				System.out.print("|" + numero[i] + "| ");
			}
			
		}
		
		//Imprimir a m�dia 
		System.out.println("\n\nA m�dia dos 5 n�meros digitados s�o: "+media);
		
		sc.close();
	}

}
