import java.util.Scanner;
public class Ingresso {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
			double ingresso, desconto, estudante;
			
			System.out.println("Digite o preço de seu Ingresso");
			ingresso= in.nextDouble();
			System.out.println("Você é estudante? Digite 1 para sim, e 0 para não");
			estudante= in.nextDouble();
			if(estudante==1){
				desconto=ingresso/2;
				System.out.println("O seu ingresso teve um desconto de 50% e o valor atual dele é "+desconto);
			} else {
				System.out.println("Não houve desconto no seu ingresso, o preço dele é de "+ingresso);
			}
	}
}
