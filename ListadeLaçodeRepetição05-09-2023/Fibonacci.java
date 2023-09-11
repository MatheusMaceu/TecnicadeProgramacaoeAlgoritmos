import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int numantes=0, numatual=1, numdepois, i=2,compi;
		System.out.println("Digite quantos termos da série de Fibonacci você quer");
		compi= in.nextInt();
	    System.out.println("O 1º número da série de fibonacci é 1");
		while (i<=compi){
			numdepois=numatual+numantes;
			numantes=numatual;
			numatual=numdepois;
			System.out.println("O "+i+"º número da série de fibonacci é "+numdepois);
			i++;
		}
		in.close();
	}
}