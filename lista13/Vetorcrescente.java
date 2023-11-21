package listavetor;
import java.util.Scanner;
public class Vetorcrescente {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[], p;
		final int TAM = 10;
		
		a = new int[TAM];
		
		for (int i=0;i<TAM;i++){
			System.out.println("Escreva um número");
			a[i] = in.nextInt();
		}
		for (int i=0;i<TAM;i++){
			for (int j=0;j<TAM;j++){
				if (a[i]>a[j]){
					p = a[i];
					a[i] = a[j];
					a[j] = p;
				}
			}
		}
		System.out.print("Em ordem crescente é: ");
		for (int i=9;i>=0;i--){
			System.out.print(a[i]+" ");
		}
		System.out.print("\nEm ordem decrescente é: ");
		for (int i=0;i<TAM;i++){
			System.out.print(a[i]+" ");
		}
	}
}