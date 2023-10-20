import java.util.Scanner;
public class Lata {
	public static void main (String[] args) {
		Scanner in= new Scanner (System.in);
		double pi, r, h, v;
		
		System.out.println("Insira o raio");
		r= in.nextDouble();
		System.out.println("Insira a altura");
		h= in.nextDouble();
		pi=3.14;
		v= pi* (r*r)*h;
		System.out.print("O volume do cilindro é "+v);
	}
	
}
