package src;
import java.util.Scanner;
	public class Media {
		public static void main(String []args) {
			Scanner in= new Scanner (System.in);
				double mediasoma, mediamedia, mediaaritmetica, mediaaritmetica2;
				
				mediaaritmetica= (8+9+7)/3;
				mediaaritmetica2= (4+5+6)/3;
				mediasoma= mediaaritmetica2+mediaaritmetica;
				mediamedia= mediasoma/2;
				System.out.println("A m�dia aritm�tica dos n�meros 9, 8 e 7 � "+mediaaritmetica+". J� a dos n�meros 4, 5, 6 � " +mediaaritmetica2+ ". A soma de ambas as m�dias � "+mediasoma+" e a m�dia das duas � "+mediamedia);
				
		}

}
