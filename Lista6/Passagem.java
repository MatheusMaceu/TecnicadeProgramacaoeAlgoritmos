import java.util.Scanner;
public class Passagem {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
			double passagem, despache,quantidade,calculo1, calculo2, assento;
			
			System.out.println("Informe o pre�o de seu passagem");
			passagem=in.nextDouble();
			System.out.println("Voc� ir� despachar Bagagem? Caso sim, digite 1, caso n�o, digite 0");
			despache=in.nextDouble();
			if(despache==1){
				System.out.println("Quantas bagagem voc� ir� despachar?");
				quantidade=in.nextDouble();
				calculo1=quantidade*90;
				System.out.println("Voc� quer marcar o assento? Digite 1 para sim, 0 para n�o");
				assento=in.nextDouble();
				if (assento==1){
					calculo2= passagem+calculo1+60;
					System.out.println("O pre�o total a pagar � "+calculo2);
				}else {
					calculo2=passagem+calculo1;
					System.out.println("O pre�o total a pagar � "+calculo2);
				}
			} else {
				System.out.println("Voc� quer marcar o assento? Digite 1 para sim, 0 para n�o");
				assento=in.nextDouble();
				if (assento==1){
					calculo1= passagem+60;
					System.out.println("O pre�o total a pagar � "+calculo1);
				}else {
					System.out.println("O pre�o total a pagar � "+passagem);
				}
			}
	}
}
/*Pre�o da passagem fornecido pelo usuario
 *Bagagem despachada � 90 reais, ler quantidade
 *Marcar assento, se sim 60 reais */
 