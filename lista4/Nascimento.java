package lista3;
import java.util.Scanner;
	public class Nascimento {
		public static void main(String []args) {
			Scanner in= new Scanner (System.in);
				int nasc, atual,idade;
				
				System.out.println("Entre com o nascimento");
					nasc= in.nextInt();
				System.out.println("Entre com o ano atual");
					atual= in.nextInt();
					idade= atual-nasc;
				System.out.println("Sua idade atual é "+idade);
				
				if(idade<18) {
					System.out.println("Você é menor de idade");
				} else {
					System.out.println("Você é maior de idade");
				}
		}
}
