import java.util.Scanner;
public class Aniv {
	public static void main(String[] args) {
		int nasc, atual, id, sn;
			Scanner in = new Scanner (System.in);
				do {
					System.out.println("Fale o ano que nasceu");
					nasc=in.nextInt();
					System.out.println("Fale o ano atual");
					atual=in.nextInt();
					id=atual-nasc;
					if (id<18){
						System.out.println(id+"Menor de idade");
					}else {
						System.out.println("Maior de idade");
					}
					System.out.println("Você quer continuar? Digite 1 para sim, 2 para não");
					sn=in.nextInt();
					if (sn==1){
						sn++;
					} else if (sn==2) {
						sn=2;
					} else {
						System.out.println("Número Inválido, reiniciando o programa");
						sn++;
					}
				} while(sn>2);
				System.out.println("Programa encerrado.");
	}
}
