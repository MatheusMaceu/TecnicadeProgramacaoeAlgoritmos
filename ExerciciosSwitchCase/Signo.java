package lista;
import java.util.Scanner;
public class Signo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome;
		int mes, dia;
		
		System.out.println("Digite seu nome");
		nome= in.next();
		System.out.println("Digite o dia que você nasceu");
		dia= in.nextInt();
		System.out.println("Digite o mês que você nasceu");
		mes= in.nextInt();

		//https://astrologialuzesombra.com.br/datas-dos-signos-do-zodiaco/ é a fonte
	
		switch (mes) {
		
		case 1:
			if (dia < 21 && dia > 0){
				System.out.println(nome+" é de Capricórnio");
			} else if (dia<32){
				System.out.println(nome+" é de Aquário");
			}
		break;
		
		case 2:
			if (dia < 19 && dia > 0){
				System.out.println(nome+" é de Aquário");
			} else if (dia<29){
				System.out.println(nome+" é de Peixes");
			}
		break;
		
		case 3:
			if (dia < 21 && dia > 0) {
				System.out.println(nome+" é de Peixes");
			} else if (dia<32){
				System.out.println(nome+" é de Áries");
			}
		break;
		
		case 4:
			if (dia < 21 && dia > 0){
				System.out.println(nome+" é de Áries");
			} else if (dia < 31){
				System.out.println(nome+" é de Touro");
			}
		break;
		
		case 5:
			if (dia < 21 && dia > 0){
				System.out.println(nome+" é de Touro");
			} else if (dia < 32){
				System.out.println(nome+" é de Gêmeos");
			}
		break;
		
		case 6:
			if (dia < 21 && dia > 0){
				System.out.println(nome+" é de Gêmeos");
			} else if (dia < 31){
				System.out.println(nome+" é de Câncer");
			}
		break;
		
		case 7:
			if (dia < 23 && dia > 0) {
				System.out.println(nome+" é de Câncer");
			} else if (dia < 31){
				System.out.println(nome+" é de Leão");
			}
		break;
		
		case 8:
			if (dia < 23 && dia > 0){
				System.out.println(nome+" é de Leão");
			} else if (dia < 32){
				System.out.println(nome+" é de Virgem");
			}
		break;
		
		case 9:
			if (dia < 24 && dia > 0){
				System.out.println(nome+" é de Virgem");
			} else if (dia < 31){
				System.out.println(nome+" é de Libra");
			}
		break;
		
		case 10:
			if (dia < 24 && dia > 0){
				System.out.println(nome+" é de Libra");
			} else if (dia < 32){
				System.out.println(nome+" é de Escorpião");
			}
		break;
		
		case 11:
			if (dia < 22 && dia > 0){
				System.out.println(nome+" é de Escorpião");			
			} else if(dia < 31){
				System.out.println(nome+" é de Sagitário");
			}
		break;
		
		case 12:
			if (dia < 22 && dia > 0){
				System.out.println(nome+" é de Sagitário");
			} else if (dia < 32){
				System.out.println(nome+" é de Capricórnio");
			}
		break;
		
		default:
			System.out.println("Mês inválido");
		}
	}
}