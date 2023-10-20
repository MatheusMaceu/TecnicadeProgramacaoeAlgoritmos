import java.util.Scanner;
public class Combustivel {
    public static void main(String[]args) {
        Scanner in = new Scanner (System.in);
            int tanque, percorrida, gasto;
            System.out.println("Informe qual foi a distância percorrida");
                percorrida=in.nextInt();
            System.out.println("Digite o tamanho do seu tanque de combustível");
                tanque=in.nextInt();
                gasto=percorrida/tanque;
            if(gasto>=10){
                System.out.println("Seu carro é econômico");
            } else {
                System.out.println("Seu carro não é econômico");
            }
    }
}