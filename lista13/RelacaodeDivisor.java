package listavetor;
import java.util.Scanner;
public class RelacaodeDivisor {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[],i,p,d;
		final int TAM = 10;
		
		a = new int [TAM];
		
		for (i=0;i<TAM;i++) {
			System.out.println("\nEscreva um número");
			a[i] = in.nextInt();
			System.out.print("\nSão divisores relacionados do número "+a[i]+" os seguintes: ");
			for(p=1;p<=a[i];p++) {
				d = a[i] % p;
				if (d==0) {
				System.out.print(p+" ");
				}
			}
		}
	}
}
