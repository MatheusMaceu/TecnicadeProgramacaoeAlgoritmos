import java.util.Scanner;
public class Idade {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int i=1, id, r, qntm=0, quantmn=0;
		while (i<11) {
			System.out.println("Digite sua idade");
			id=in.nextInt();
			
			if (id<18){
				quantmn=quantmn+(id/id);
			}else {
				qntm=qntm+(id/id);
			}
			i++;
		}
		System.out.println("A quantidade de maiores de idade é "+qntm+" e a de menores "+quantmn);
		in.close();
	}
}
