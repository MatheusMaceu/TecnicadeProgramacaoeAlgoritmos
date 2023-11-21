package listavetor;
import java.util.Scanner;
public class SomatoriaBA {	
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i, b[], a[];
		final int TAM = 10;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0;i<TAM;i++){
			System.out.println("\nEscreva o "+(i+1)+"o. para a somatoria");
			a[i] = in.nextInt();
		}
		for (int g=0;g<TAM;g++){
			i = g;
			for (;i<TAM;i++){
				b[g] = b[g]+a[i];
			}
		}
		System.out.println("Somatória que está no vetor B é: ");
		for (i=0;i<TAM;i++){
			System.out.println(b[i]+" ");
		}
	}
}
