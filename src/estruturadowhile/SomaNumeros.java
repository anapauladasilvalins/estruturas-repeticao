package estruturadowhile;

import java.util.Scanner;

public class SomaNumeros {
	public static void main(String []args) {
		
		int n, s = 0;
		String resp;
		
		Scanner teclado = new Scanner(System.in);
		
		do {
			System.out.print("Digite um número: ");
			n = teclado.nextInt();
			s += n; // ou assim: s = s + n;
			
			System.out.print("Deseja continuar? [S/N]");
			resp = teclado.next();
			
		} while (resp.equals("s"));
			System.out.println("A soma de todos os números é " + s);
	}

}
