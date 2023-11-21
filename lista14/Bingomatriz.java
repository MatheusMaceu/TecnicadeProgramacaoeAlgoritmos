import java.util.Random;
import java.util.Scanner;
public class Bingomatriz {
	public static void main(String [] args) {
		int a[][] = new int [4][4], i, j, num,alea=75,vdd=0, rodd=0,v=0,b, verif=0;
		Random in = new Random();
		Scanner on = new Scanner (System.in);
		//Verificação para não ocorrer números repetidos
		for (i=0;i<4;i++) {
			for (j=0;j<4;j++){
				v = in.nextInt(alea+1);
				b=0;
				for (int i1 = 0; i1<4;i1++) {
					for (int j1 = 0; j1<4;j1++) {
						if (v==a[i1][j1]){
							v = in.nextInt(alea+1);
						}else {
							b=1;
						}
					}
				}
				if (b==1){
					a[i][j] = v;
				}
			}
		}
		/*for (i=0;i<4;i++){
			for (j=0;j<4;j++){
				System.out.print(a[i][j]+" ");
			}
		}*/
		//Escrever o bingo
		for (i=0;i<76;i++){
				System.out.println("\nEscreva um número de 1 a 75 para o bingo");
				num = on.nextInt();
				verif=0;
				//Verificar se está na cartela
				for (i=0;i<4;i++){
					for (j=0;j<4;j++){
						if (num==a[i][j] && num!=0){
							vdd++;
							a[i][j] = 0;
							System.out.println("Tem na cartela");
							verif=1;
						}
					}
					if(i==3){
						rodd++;
					}
				}
				if (verif!=1){
					System.out.println("Não está na cartela");
				}
				if(vdd==16){
					System.out.println("BINGO! Você levou "+rodd+" rodadas para acertar");
					break;
				}
		}
	}
}
//55 15 50 38 52 21 7 28 63 31 67 40 68 56 17 10 