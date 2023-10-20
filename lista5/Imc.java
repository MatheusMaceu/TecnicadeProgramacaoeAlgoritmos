import java.util.Scanner;
public class Imc {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
            double imc, alt, peso;
            System.out.println("Informe a sua altura");
                alt=in.nextDouble();
            System.out.println("Informe seu peso");
                peso=in.nextDouble();
                imc = peso/(alt*alt);
                if(imc<18.5){
                    System.out.println("Excesso de Magreza");
                } else if (imc>=18.5 && imc<25) {
                    System.out.println("Peso Normal");
                } else if (imc>=25 && imc<30) {
                    System.out.println("Excesso de Peso");
                }else if (imc>=30 && imc<35) {
                    System.out.println("Obesidade Grau I");
                }else if (imc>=35 && imc<=40) {
                    System.out.println("Obesidade Grau II");
                }else {
                    System.out.println("Obesidade Grau III");
                }
    }
}