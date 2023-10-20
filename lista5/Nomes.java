import java.util.Scanner;
public class Nomes {
    public static void main (String[]args) {
        Scanner in = new Scanner (System.in);
            int idade, velho, novo;
            String nome, nomevelho, nomenovo;
            System.out.println("Digite seu nome");
            nome=in.next();
            System.out.println("Digite sua idade");
            idade = in.nextInt();
            nomevelho= nome;
            nomenovo= nome;
            velho= idade;
            novo= idade;

            System.out.println("Digite seu nome");
            nome=in.next();
            System.out.println("Digite sua idade");
            idade = in.nextInt();
            if(idade>velho){
                velho=idade;
                nomevelho=nome;
            }else if (novo>idade) {
                novo=idade;
                nomenovo=nome;
            }

            System.out.println("Digite seu nome");
            nome=in.next();
            System.out.println("Digite sua idade");
            idade = in.nextInt();
            if(idade>velho){
                velho=idade;
                nomevelho=nome;
            }else if (novo>idade) {
                novo=idade;
                nomenovo=nome;
            }

            System.out.println("Digite seu nome");
            nome=in.next();
            System.out.println("Digite sua idade");
            idade = in.nextInt();
            if(idade>velho){
                velho=idade;
                nomevelho=nome;
            }else if (novo>idade) {
                novo=idade;
                nomenovo=nome;
            }

            System.out.println("Digite seu nome");
            nome=in.next();
            System.out.println("Digite sua idade");
            idade = in.nextInt();
            if(idade>velho){
                velho=idade;
                nomevelho=nome;
            }else if (novo>idade) {
                novo=idade;
                nomenovo=nome;
            }
            System.out.println("A pessoa mais velha é "+nomevelho+" sua idade é de "+velho+" já a mais nova é "+nomenovo+" e sua idade é "+novo);
    }
}

