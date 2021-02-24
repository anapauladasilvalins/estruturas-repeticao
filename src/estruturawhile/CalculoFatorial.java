package estruturawhile;

import java.util.Scanner;

public class CalculoFatorial {
	public static void main(String [] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int num = in.nextInt();
		int fat = 1;
		//int res =  num * fat;
		
		if(num == 0 ) {
			System.out.println("Número inválido!");
		}
		else {
			
			while(num > 1) {
//				fat = fat * num;
//				num = num - 1;
				fat*=num;
				num--;
				System.out.println( (num + " * " + fat) + " = " + (fat*num)); 
			}
						
			}
		}
	}	
