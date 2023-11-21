package listavetor;
import java.util.Scanner;
public class PalindromoVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[], i, b[], c[],h=0;
		final int TAM = 10;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=9;i>=0;i--){
			System.out.println("Insira o número");
			a[i] = in.nextInt();
		}
		for (i=0;i<TAM;i++){
			 b[i] = a[i]%10;
			 a[i] = a[i]/10;
		}
		
		for (i=0;i<TAM;i++){
			 c[i] = c[i]*10+b[i];
		}
		
		for (i=0;i<TAM;i++){
			 if (c[i]!=0){
				 h++;
			 }
		}
		
		if (h==10){
			System.out.println("É um palindromo");
		}else {
			System.out.println("Não é um palindromo");
		}
	}
}

//Créditos da ajuda da Isa que me fez não ser tão burro dessa vez.