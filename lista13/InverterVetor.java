import java.util.Scanner;
public class InverterVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i, a[], b[];
		final int TAM = 10;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0;i<=9;i++) {
			System.out.println("Escreva o "+(i+1)+"o. valor");
			a[i] = in.nextInt();
		}
		
		for (i=0;i<=9;i++) {
			b[i] = a[i];
		}
		
		System.out.print("b[] = ");
		for (i=9;i>=0;i--) {
			System.out.print(a[i]+" ");
		}
	}
}
