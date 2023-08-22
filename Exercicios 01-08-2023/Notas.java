package lista;
import java.util.Scanner;
public class Notas {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
			int alunostotal, alunosMB, alunosB, alunosR, alunosI,porcentagem;
			String mencao;
			
			System.out.println("Digite a quantidade de alunos com MB");
			alunosMB=in.nextInt();
			System.out.println("Digite a quantidade de alunos com B");
			alunosB=in.nextInt();
			System.out.println("Digite a quantidade de alunos com R");
			alunosR=in.nextInt();
			System.out.println("Digite a quantidade de alunos com I");
			alunosI=in.nextInt();
			alunostotal=alunosMB+alunosB+alunosR+alunosI;
			System.out.println("O total de alunos é "+alunostotal);
			System.out.println("Agora informe a menção que deseja ver");
			mencao=in.next();
			switch (mencao) {
			case "MB":
				porcentagem=(alunosMB*100)/alunostotal;
				System.out.println("A quantidade de alunos que tiraram MB em relação a quatidade total de alunos é "+porcentagem+"%");
				break;
			case "B":
				porcentagem=(alunosB*100)/alunostotal;
				System.out.println("A quantidade de alunos que tiraram B em relação a quatidade total de alunos é "+porcentagem+"%");
				break;
			case "R":
				porcentagem=(alunosR*100)/alunostotal;
				System.out.println("A quantidade de alunos que tiraram R em relação a quatidade total de alunos é "+porcentagem+"%");
				break;
			case "I":
				porcentagem=(alunosI*100)/alunostotal;
				System.out.println("A quantidade de alunos que tiraram I em relação a quatidade total de alunos é "+porcentagem+"%");
				break;
				//parte minúscula
			case "mb":
				porcentagem=(alunosMB*100)/alunostotal;
				System.out.println("A quantidade de alunos que tiraram MB em relação a quatidade total de alunos é "+porcentagem+"%" );
				break;
			case "b":
				porcentagem=(alunosB*100)/alunostotal;
				System.out.println("A quantidade de alunos que tiraram B em relação a quatidade total de alunos é "+porcentagem+"%");
				break;
			case "r":
				porcentagem=(alunosR*100)/alunostotal;
				System.out.println("A quantidade de alunos que tiraram R em relação a quatidade total de alunos é "+porcentagem+"%");
				break;
			case "i":
				porcentagem=(alunosI*100)/alunostotal;
				System.out.println("A quantidade de alunos que tiraram I em relação a quatidade total de alunos é "+porcentagem+"%");
				break;
			default:
				System.out.println("Número de menção inválido");
			}
	}
}
