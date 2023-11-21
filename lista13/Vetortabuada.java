package listavetor;
import java.util.Scanner;
public class Vetortabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i, a[], multi;
		final int TAM = 5;
		a = new int[TAM];		
		for (i=0; i<TAM;i++){
			System.out.println("\nEscreva o "+(i+1)+"o. número");
			a[i] = in.nextInt();
			for (int n=1; n<=10;n++){
				multi=a[i]*n;
				System.out.println("\n"+a[i] +" x "+n+" = "+multi);
			}
		}
	}
}
