import java.util.Scanner;
public class Triangulo {
    public static void main(String[]args) {
        Scanner in = new Scanner (System.in);
            double a,b,c,amaisb,amaisc,bmaisc;
            System.out.println("Insira o valor do triângulo");
            a=in.nextDouble();
            System.out.println("Insira outro valor do triângulo");
            b=in.nextDouble();
            System.out.println("Insira o último valor do triângulo");
            c=in.nextDouble();
            amaisb=a+b;
            amaisc=a+c;
            bmaisc=b+c;
            if(a>bmaisc || b>amaisc || c>amaisb) {
            } else if (a != b && b != c && a!=c) {
                System.out.println("É um Triângulo Escaleno");
            } else if(a == b && b==c) {
                System.out.println("É um triângulo Equilatero");
            } else {
                System.out.println("É um triângulo Isosceles");
            }
    }
}