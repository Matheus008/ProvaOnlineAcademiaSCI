package quatroJava;

import java.util.Scanner;

public class QuatroJava {

	public static void main(String[] args) {
		
		double[] numero = new double[5];
		
		Scanner sc = new Scanner(System.in);
		
		//Inserir os n�meros
		for (int i = 0; i < numero.length; i++) {
			System.out.print("Digite o "+(i+1)+"� n�mero: ");
			numero[i] = sc.nextDouble();
		}
		
		//Mostrar o n�mero na posi��o 3
		System.out.println("\nO n�mero na posi��o 3 do vetor �: "+numero[3-1]);
		
		sc.close();
	}

}
