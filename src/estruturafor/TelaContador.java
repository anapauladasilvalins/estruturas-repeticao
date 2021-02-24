package estruturafor;

import java.util.Scanner;

public class TelaContador {
	public static void main(String [] args) {
		
		int inicio;
		int fim;
		int passo;
		
		System.out.println("Informe o número inicial, final e o passo. ");
		System.out.println("");
		
		Scanner tela = new Scanner(System.in);
		
		System.out.println("INICIO: ");
		
		inicio = tela.nextInt();
		
		System.out.println("FIM: ");
		fim = tela.nextInt();
		
		System.out.println("PASSO: ");
		passo = tela.nextInt();
		
		System.out.println("------------------------------------");
		
		System.out.println("RESULTADO: ");
		
		for(int c = inicio; c <= fim; c+=passo ) {
			System.out.println(c);
			
		}
	}

}
