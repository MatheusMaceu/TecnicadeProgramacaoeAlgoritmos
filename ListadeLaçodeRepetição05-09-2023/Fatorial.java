import java.util.Scanner;
public class Fatorial {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			long i=1, n, r;
			System.out.println("Escreva um número para fatorial");
			n= in.nextLong();
			r=n;
			while (i<n){
				r=r*i;
				i++;
			}
			System.out.println(n+"! tem o resultado de "+r);
	}
}
