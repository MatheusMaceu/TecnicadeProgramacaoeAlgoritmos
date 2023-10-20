import java.util.Scanner;
public class SomaVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i, a[], b[], c[];
		final int TAM = 10;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=0;i<=9;i++) {
			System.out.println("Leia o "+(i+1)+"o. valor");
			a[i] = in.nextInt();
		}
		for (i=0;i<=9;i++) {
			System.out.println("Leia o "+(i+1)+"o. valor");
			b[i] = in.nextInt();
			c[i] = a[i] + b[i];
		}
		for (i=0;i<=9;i++) {
			System.out.println("O "+(i+1)+"o. valor de C é "+c[i]);
		}
		
	}
}
