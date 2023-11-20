import java.util.Random;
public class Randommatriz {
	public static void main(String args[]) {
		final int TAM=3;
		int a[][], i, j, col=0, menor, maior, lin, colun;
		a = new int [TAM][TAM];
		Random in = new Random();
		//envio os numeros randomicos
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				a[i][j] = in.nextInt()%50;
			}
		}
		
		//coloco os numeros randomicos na tela
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				System.out.print(a[i][j]+" ");
				col++;
			}
			if(col >= TAM) {
				System.out.print("\n");
				col=0;
			}else {}
		}
		
		System.out.print("\n");
		
		//pego o menor  numero randomico
		menor = a[0][0];
		colun = 0;
		lin = 0;
		
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				if(a[i][j] < menor) {
					menor = a[i][j];
					lin = i;
					colun = j;
				}else {}
			}
		}
		
		
		System.out.println(menor+" e o menor numero da matriz e esta na posição "+lin+ ","+colun+"\n");
		
		//pega o maior numero randomico
		maior = a[0][0];
		lin = 0;
		colun = 0;
		
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				if(a[i][j]>maior) {
					maior = a[i][j];
					lin = i;
					colun = j;
				}
			}
		}
		
		System.out.println(maior+" e o maior numero da matriz e esta na posição "+lin+ ","+colun+"\n");
}
}