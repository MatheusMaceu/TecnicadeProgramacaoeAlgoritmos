import java.util.Scanner;
public class Aluno {
    public static void main (String [] args) {
        Scanner in = new Scanner (System.in);
        double nota1, nota2, media, notarecup,mediarecup;
        System.out.println("Digite a primeira nota");
        nota1 = in.nextDouble();
        System.out.println("Digite a segunda nota");
        nota2 = in.nextDouble();
        media = (nota1+nota2)/2;
        if(media>=6) {
            System.out.println("APROVADO");
        } else if (media<3){
            System.out.println("REPROVADO");
        } else if (media>=3 && media<6) {
            System.out.println("RECUPERAÇÃO");
            System.out.println("Escreva a nota de recuperação");
            notarecup = in.nextDouble();
            mediarecup = (nota1+nota2+notarecup)/3;
            if (mediarecup<6) {
                System.out.println("REPROVADO");
            } else {
                System.out.println("APROVADO");
            }
        } 
    }

}