package listavetor;
import java.util.Scanner;
public class Paresimpares {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		//Aqui eu declaro um vetor, basicamente declarando a vari�vel.
		int i, a[], b[];
		//Declarei o tamanho do vetor, falando que ele ter� 20 espa�os (TAM= Tamanho)
		final int TAM = 20;
		
		//Agora mostrei que aqui realmente � um vetor com esse tamanho.
		a = new int[TAM];
		b = new int[TAM];
		
		//Fiz um la�o para ficar escrevendo at� terminar todos os lugares do Vetor A[] al�m de j� verificar que n�meros com resto 0 s�o pares
		for (i=0;i<TAM;i++){
			System.out.println("Escreva o "+(i+1)+"o.");
			a[i] = in.nextInt();
			if (a[i]%2==0){
				b[i] = a[i];
			}
		}
		//Comecei a colocar os n�meros para aparecer, sendo a parte dos impares onde eu falo que a[i] tem que ser igual a 1 para ser impar
		System.out.print("S�o impares ");
		for (i=0;i<TAM;i++){
			if (a[i]%2==1){
			System.out.print(a[i]+" ");
			}
		}
		//Mesma coisa de cima, s� que para isso, ele tem que ser = a 0 o resto e o espa�o diferente de 0
		System.out.print("\nS�o pares ");
		for (i=0;i<TAM;i++){
			if(b[i]%2==0 && b[i]!=0) {
			System.out.print(b[i]+" ");
			}
		}
	}
}
