import java.util.Scanner;
public class Ingresso {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
			double ingresso, desconto, estudante;
			
			System.out.println("Digite o pre�o de seu Ingresso");
			ingresso= in.nextDouble();
			System.out.println("Voc� � estudante? Digite 1 para sim, e 0 para n�o");
			estudante= in.nextDouble();
			if(estudante==1){
				desconto=ingresso/2;
				System.out.println("O seu ingresso teve um desconto de 50% e o valor atual dele � "+desconto);
			} else {
				System.out.println("N�o houve desconto no seu ingresso, o pre�o dele � de "+ingresso);
			}
	}
}
