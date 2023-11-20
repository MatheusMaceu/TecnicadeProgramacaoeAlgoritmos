import java.util.Random;
public class SomaMatriz {
	public static void main(String args[]) {
		int a[][], i, j, sm=0, lin=3, colun=4,col=0;
		a = new int [lin][colun];
		Random in = new Random();
		
		//vou pegar os valores colocando algo random (é mais rapido)
		for(i=0;i<lin;i++) {
			for(j=0;j<colun;j++) {
				a[i][j] = in.nextInt()%100;
				if(j == lin) {
					a[i][j] = sm;
					sm=0;
				}else {
					sm = sm+a[i][j];
				}
			}
		}
		//Aqui vou imprimir os valores apenas
		for(i=0;i<lin;i++) {
			for(j=0;j<colun;j++) {
				if(col==lin) {
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
