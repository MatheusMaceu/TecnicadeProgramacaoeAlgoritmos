import java.util.Scanner;
public class Faixaetaria {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double i=1, id, qnat1=0, qnat2=0, qnat3=0, qnat4=0, qnat5=0, porc;
		while (i<16) {
			System.out.println("Escreva a sua idade");
			id = in.nextDouble();
			if (id<=15){
				qnat1 = qnat1+id/id;
			}else if (id<=30){
				qnat2 = qnat2+id/id;
			}else if (id<=45) {
				qnat3 = qnat3+id/id;
			}else if (id<=60){
				qnat4 = qnat4+id/id;
			}else {
				qnat5 = qnat5+id/id;
			}
			i++;
		}
		System.out.println("São "+qnat1+" da primeira faixa etária, "+qnat2+" da segunda faixa etária, "+qnat3+" da terceira faixa etária, "+qnat4+" da quarta faixa etária, "+qnat5+" da quinta faixa etária.");
		porc = qnat1*100/15;
		System.out.println("São "+porc+"% na primeira faixa etária");
		porc = qnat2*100/15;
		System.out.println("São "+porc+"% na segunda faixa etária");
		porc = qnat3*100/15;
		System.out.println("São "+porc+"% na terceira faixa etária");
		porc = qnat4*100/15;
		System.out.println("São "+porc+"% na quarta faixa etária");
		porc = qnat5*100/15;
		System.out.println("São "+porc+"% na quinta faixa etária");
		
	}
}
