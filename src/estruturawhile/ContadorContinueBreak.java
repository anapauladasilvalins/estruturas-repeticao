package estruturawhile;

public class ContadorContinueBreak {
	public static void main(String []args) {
	
		
		int c = 0;
		
		while(c < 10) {
			c++;
			if(c == 2 || c == 5 || c == 9) { // mesmo pedindo p/ continuar, s� vai at� 7 o �ltimo (c == 9) n�o executa porque pediu break no 7.
				continue;
			}
			if(c == 7) {
				break;
			}
			System.out.println(c); 
		}
	}
}
