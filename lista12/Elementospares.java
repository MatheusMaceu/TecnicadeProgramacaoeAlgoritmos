package listavetor;
import java.util.Scanner;
public class Elementospares {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[],i,p;
		final int TAM = 10;
		
		a = new int [TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println("\nEscreva um n�mero");
			a[i] = in.nextInt();
			System.out.print("\nS�o pares relacionados at� o n�mero "+a[i]+" os seguintes: ");
			for(p=0;p<a[i];p=p+2) {
				System.out.print(p+" ");
			}
		}
	}
}
