import java.util.Scanner;
public class Fibonacci {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int numantes=0, numatual=1, numdepois, i=2,compi;
		System.out.println("Digite quantos termos da s�rie de Fibonacci voc� quer");
		compi= in.nextInt();
	    System.out.println("O 1� n�mero da s�rie de fibonacci � 1");
		while (i<=compi){
			numdepois=numatual+numantes;
			numantes=numatual;
			numatual=numdepois;
			System.out.println("O "+i+"� n�mero da s�rie de fibonacci � "+numdepois);
			i++;
		}
		in.close();
	}
}