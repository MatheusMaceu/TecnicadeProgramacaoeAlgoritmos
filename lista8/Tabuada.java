import java.util.Scanner;
public class Tabuada {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=1,n,r;
		System.out.println("Informe um número");
		n= in.nextInt();
		while (i<11){
			r=n*i;
			System.out.println(n+"x"+i+"="+r);
			i++;
		}
		
		in.close();
	}
}
