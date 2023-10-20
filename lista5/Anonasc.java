import java.util.Scanner;
public class Anonasc {
    public static void main(String[]args) {
        Scanner in = new Scanner (System.in);
            int idade,anonasc,anoatual;
            System.out.println("Digite o ano atual");
            anoatual = in.nextInt();
            System.out.println("Digite o seu ano de nascimento");
            anonasc= in.nextInt();
            idade= anoatual-anonasc;
            if (idade<10) {
                System.out.print("Criança");
            } else if (idade >=10 && idade <18) {
                System.out.print("Adolescente");
            } else if (idade >= 18 && idade<60) {
                System.out.print("Adulto");
            } else {
                System.out.print("Idoso");
            }
    }
}
