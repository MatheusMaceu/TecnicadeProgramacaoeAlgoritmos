import java.util.Scanner;
public class Matrizdobro {
	public static void main(String []args) {
		Scanner in  = new Scanner(System.in);
		int a[][], i, j, multi=2, TAM=4,p=0;
		a = new int [TAM][TAM];
		
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				a[i][j] = multi;
				multi = multi*2;
			}
		}
		
		for(i=0;i<TAM;i++) {
			for(j=0;j<TAM;j++) {
				System.out.print(a[i][j]+" ");
				p++;
			}
			//pular linha
			if(p >= TAM) {
				System.out.print("\n");
				p=0;
			}else {}
		}
	}
}