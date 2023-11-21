package listavetor;
import java.util.Scanner;
public class fatorialVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[],b[],i,g;
		long f=0;
		final int TAM = 15;
		
		a = new int [TAM];
		b = new int [TAM];
		
		for (i=0;i<TAM;i++){
			System.out.println("\nSelecione um numero para fatorial");
			a[i] = in.nextInt();
			f = a[i];
			for (g=1;g<a[i];g++){
				f = f*g;
			}
			b[i]=(int)f;
			
		}
		System.out.print("\nOs números do vetor A são: ");
		for(i=0;i<TAM;i++){
		System.out.print(a[i]+" ");
		}
		System.out.print("\nJá o fatorial do vetor A em vetor B ");
		for (i=0;i<TAM;i++){
			System.out.print(b[i]+" ");
		}
	}
}
