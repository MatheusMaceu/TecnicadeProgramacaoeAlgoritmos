package lista;
import java.util.Scanner;
public class escola {
public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		int x;
		System.out.println("Digite a idade de seu filho");
		x= in.nextInt();
		switch (x) {
		case 6:
			System.out.println("Categoria Dente de Leite");
		break;
		
		case 7:
			System.out.println("Categoria J�nior");
		break;
		
		case 8:
			System.out.println("Categoria J�nior Max");
		break;
		
		case 9:
			System.out.println("Categoria J�nior Master");
		break;
		
		case 10:
			System.out.println("Categoria Master");
		break;
		default:
			System.out.println("N�o pode se matricular");
		}
}
}
