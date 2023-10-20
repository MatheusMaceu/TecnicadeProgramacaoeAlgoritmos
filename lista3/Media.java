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
				System.out.println("A média aritmética dos números 9, 8 e 7 é "+mediaaritmetica+". Já a dos números 4, 5, 6 é " +mediaaritmetica2+ ". A soma de ambas as médias é "+mediasoma+" e a média das duas é "+mediamedia);
				
		}

}
