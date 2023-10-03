import java.util.Scanner;
public class Primooun {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int n, i=1, resto=0;
		double div;
		System.out.println("Escreva um número inteiro");
		n = in.nextInt();
		
		while (i<=n){
			div = n%i;
			if (div==0){
				resto++;
				i++;
			} else {
				i++;
			}
		}	
		if (resto>2){
			System.out.println("Não é primo");
		} else if (resto==2){
			System.out.println("é primo");
		} else {
			System.out.println("Não é primo");
		}
	}
}

