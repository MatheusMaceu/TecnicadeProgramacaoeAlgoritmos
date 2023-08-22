package lista;
import java.util.Scanner;
public class Signo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome;
		int mes, dia;
		
		System.out.println("Digite seu nome");
		nome= in.next();
		System.out.println("Digite o dia que voc� nasceu");
		dia= in.nextInt();
		System.out.println("Digite o m�s que voc� nasceu");
		mes= in.nextInt();

		//https://astrologialuzesombra.com.br/datas-dos-signos-do-zodiaco/ � a fonte
	
		switch (mes) {
		
		case 1:
			if (dia < 21 && dia > 0){
				System.out.println(nome+" � de Capric�rnio");
			} else if (dia<32){
				System.out.println(nome+" � de Aqu�rio");
			}
		break;
		
		case 2:
			if (dia < 19 && dia > 0){
				System.out.println(nome+" � de Aqu�rio");
			} else if (dia<29){
				System.out.println(nome+" � de Peixes");
			}
		break;
		
		case 3:
			if (dia < 21 && dia > 0) {
				System.out.println(nome+" � de Peixes");
			} else if (dia<32){
				System.out.println(nome+" � de �ries");
			}
		break;
		
		case 4:
			if (dia < 21 && dia > 0){
				System.out.println(nome+" � de �ries");
			} else if (dia < 31){
				System.out.println(nome+" � de Touro");
			}
		break;
		
		case 5:
			if (dia < 21 && dia > 0){
				System.out.println(nome+" � de Touro");
			} else if (dia < 32){
				System.out.println(nome+" � de G�meos");
			}
		break;
		
		case 6:
			if (dia < 21 && dia > 0){
				System.out.println(nome+" � de G�meos");
			} else if (dia < 31){
				System.out.println(nome+" � de C�ncer");
			}
		break;
		
		case 7:
			if (dia < 23 && dia > 0) {
				System.out.println(nome+" � de C�ncer");
			} else if (dia < 31){
				System.out.println(nome+" � de Le�o");
			}
		break;
		
		case 8:
			if (dia < 23 && dia > 0){
				System.out.println(nome+" � de Le�o");
			} else if (dia < 32){
				System.out.println(nome+" � de Virgem");
			}
		break;
		
		case 9:
			if (dia < 24 && dia > 0){
				System.out.println(nome+" � de Virgem");
			} else if (dia < 31){
				System.out.println(nome+" � de Libra");
			}
		break;
		
		case 10:
			if (dia < 24 && dia > 0){
				System.out.println(nome+" � de Libra");
			} else if (dia < 32){
				System.out.println(nome+" � de Escorpi�o");
			}
		break;
		
		case 11:
			if (dia < 22 && dia > 0){
				System.out.println(nome+" � de Escorpi�o");			
			} else if(dia < 31){
				System.out.println(nome+" � de Sagit�rio");
			}
		break;
		
		case 12:
			if (dia < 22 && dia > 0){
				System.out.println(nome+" � de Sagit�rio");
			} else if (dia < 32){
				System.out.println(nome+" � de Capric�rnio");
			}
		break;
		
		default:
			System.out.println("M�s inv�lido");
		}
	}
}