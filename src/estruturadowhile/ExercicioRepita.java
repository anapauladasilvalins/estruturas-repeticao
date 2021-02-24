package estruturadowhile;

import java.util.Scanner;

public class ExercicioRepita {
	public static void main(String [] args) {
		//int cont = 0;
		int num = 0;
		int totPar = 0;
		int totImpar = 0; 
		int quantAcima100 = 0; 
		int soma = 0;
		float media = soma / 2; 
		
		Scanner teclado = new Scanner(System.in);
		
		
		do {
			System.out.println("informe um número: ");
			System.out.println("(0 interrompe)");
			num = teclado.nextInt();
			soma += num;
			if (num % 2 == 0) {
				totPar++;
			}
			if(num % 2 != 0) {
				totImpar++;
				
			}	
			if (num >= 100 ) {
				quantAcima100++;
			}
			if (media >= num ) {
				media = soma / 2f;
			}
			else {
				System.out.println("");
			}
			
		} while (num != 0); 
	
		System.out.println("Soma dos valores: " + soma); 
		System.out.println("Total de Pares: " + totPar);
		System.out.println("Total de Ímpares: " + totImpar);
		System.out.println("Números acima de 100: " + quantAcima100);
		System.out.println("Média dos valores: " + media);
		
		
		
	}

}
