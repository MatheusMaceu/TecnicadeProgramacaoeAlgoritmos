package listavetor;
import java.util.Scanner;
public class MotordeBusca {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[], proc,i,sn,h=0;
		final int TAM = 10;
		
		a = new int[TAM];
		
		for (i=0;i<TAM;i++){
			System.out.println("Digite um n�mero para o vetor");
			a[i] = in.nextInt();
		}
		do {
			System.out.println("Diga o n�mero que deseja procurar.");
			proc = in.nextInt();
			for(i=0;i<TAM;i++){
				if (proc==a[i]){
					System.out.println("O n�mero existe no vetor");
					h=1;
				} 
			}
			if (h==0){
				System.out.println("O n�mero n�o existe no vetor");
			}
			System.out.println("Voc� quer continuar? 1 Para sim, 2 para n�o.");
			sn = in.nextInt();
			if (sn==1){
				sn++;
			} else if (sn==2) {
				sn=0;
			} else {
				System.out.println("N�mero Inv�lido, reiniciando o programa");
				sn++;
			}
			h=0;
		} while(sn>0);
	}
}
