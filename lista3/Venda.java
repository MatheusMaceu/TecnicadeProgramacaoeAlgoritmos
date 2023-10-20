import java.util.Scanner;
public class Venda {
	public static void main (String[] args) {
		Scanner in= new Scanner (System.in);
		double produto, porcentagem, vender;
			
			System.out.println("Entre com o produto");
			produto= in.nextDouble();
			System.out.println("Entre com a porcentagem");
			porcentagem= in.nextDouble();
			vender= produto*porcentagem/100;
			
		System.out.print("O necessário para se lucrar é de "+vender);
	}
}
