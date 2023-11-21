import java.util.Scanner;
public class QuadradoVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		//criando um vetor
		int a[],b[], i;
		//Definindo o tamanho da constante para 10, para utlizarmos no vetor
		final int TAM = 10;
		//definindo o tamanho de um vetor
		a = new int[TAM];
		b = new int[TAM];
		
		//Criei um laço FOR para repetir varias vezes e utilizar o vetor
		for (i=0;i<=9;i++) {
			System.out.println("Digite o "+(i+1)+"o. valor");
			a[i] = in.nextInt();
		}
		
		for (i=0;i<=9;i++) {
			b[i] = a[i]*a[i];
		}
		
		System.out.print("Os valores de b[] são ");
		for (i=0;i<=9;i++) {
		System.out.print(b[i]+" ");
		}
	}
}
