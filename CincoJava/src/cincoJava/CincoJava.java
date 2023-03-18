package cincoJava;

import java.util.Scanner;

public class CincoJava {

	public static void main(String[] args) {
		
		String[] nomes = new String[3];
		double[][] notas = new double[3][4];
		double[] media = new double[3];
		double maiorMedia, menorMedia;
		int posicaoMaiorMedia = 0, posicaoMenorMedia = 0;
		
		Scanner sc = new Scanner(System.in);
		
		//Inserir os nomes e as notas dos alunos
		for (int i = 0; i < 3; i++) {
			
			System.out.print("Digite o nome do(a) "+(i+1)+"� aluno(a): ");
			nomes[i] = sc.next();
			
			System.out.println();
			
			for (int j = 0; j < 4; j++) {
				
				System.out.print("Digite a "+(j+1)+"� nota: ");
				notas[i][j] = sc.nextDouble();
				
				media[i] += notas[i][j];
			}
			media[i] /=4;
			
			System.out.println();
		}
		
		//Inserindo valor de compara��o
		maiorMedia = media[0];
		menorMedia = media[0];
		
		
		//Imprimir os nome e a m�dia de cada aluno e verificar qual aluno tem a maior nota
		//e qual aluno teve a menor m�dia
		for (int i = 0; i < media.length; i++) {
			System.out.println("Nome: "+nomes[i]+" - m�dia: "+media[i]);
			
			if(maiorMedia < media[i]) {
				maiorMedia = media[i];
				posicaoMaiorMedia = i;
			}
			if(menorMedia > media[i]) {
				menorMedia = media[i];
				posicaoMenorMedia = i;
			}
		}
		
		//Imprimir o nome do aluno que teve a maior m�dia e o aluno que teve a menor m�dia
		System.out.println();
		System.out.println("O aluno(a) que obteve a maior m�dia foi: "+nomes[posicaoMaiorMedia]);
		System.out.println("O aluno(a) que obteve a menor m�dia foi: "+nomes[posicaoMenorMedia]);
		
		sc.close();
	}

}
