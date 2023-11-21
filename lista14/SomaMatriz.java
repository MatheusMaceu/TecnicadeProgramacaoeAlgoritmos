import java.util.Random;
public class SomaMatriz {
	public static void main(String []args) {
		int a[][], i, j, sm=0,col=0;
		a = new int [3][4];
		Random in = new Random();
		
		//vou pegar os valores colocando algo random (é mais rapido)
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				a[i][j] = in.nextInt()%100;
				if(j == 3) {
					a[i][j] = sm;
					sm=0;
				}else {
					sm = sm+a[i][j];
				}
			}
		}
		//Aqui vou imprimir os valores apenas
		for(i=0;i<3;i++) {
			for(j=0;j<4;j++) {
				if(col == 3) {
					System.out.print("sm = "+a[i][j]+" \n");
					col=0;
				}else {
					System.out.print(a[i][j]+" ");
					col++;
				}
			}
		}
	}
}
