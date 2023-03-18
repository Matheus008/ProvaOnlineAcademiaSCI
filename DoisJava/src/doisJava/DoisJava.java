package doisJava;

import java.util.Scanner;

public class DoisJava {

	public static void main(String[] args) {

		double[] numero = new double[5];
		double maiorNumero, menorNumero;
		
		Scanner sc = new Scanner(System.in);
		
		//Pegar os 5 n�meros
		for (int i = 0; i < numero.length; i++) {
			System.out.print("Digite o "+(i+1)+"� n�mero: ");
			numero[i] = sc.nextDouble();
			
		}
		
		//Inserindo valor de compara��o
		maiorNumero = numero[1];
		menorNumero = numero[1];
		
		//Verificar qual � o n�mero maior e o menor
		for (int i = 0; i < numero.length; i++) {
			
			if(maiorNumero < numero[i]) {
				maiorNumero = numero[i];
			}else if(menorNumero > numero[i]) {
				menorNumero = numero[i];
			}
			
		}
		
		//Imprimir o maior e o menor n�mero
		System.out.println("O maior n�mero �: "+maiorNumero);
		System.out.println("O menor n�mero �: "+menorNumero);
		
		sc.close();
	}

}
