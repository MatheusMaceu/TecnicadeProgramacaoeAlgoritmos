import java.util.Scanner;
public class MediaVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[], i;
		double media=0;
		final int TAM = 10;
		
		a = new int [TAM];
		
		for (i=0;i<=9;i++) {
			System.out.println("Escreva o "+(i+1)+"o. valor");
			a[i] = in.nextInt();
		}
		for (i=0;i<=9;i++) {
			media = a[i]+media;
		}
		
		media = media/TAM;
		System.out.println("A media dos "+TAM+" números é "+media);
	}
}