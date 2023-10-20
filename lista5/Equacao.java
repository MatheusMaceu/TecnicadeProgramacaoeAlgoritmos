import java.util.Scanner;
public class Equacao {
    public static void main (String[]args) {
        Scanner in = new Scanner (System.in);
            double bhask, a, b, c, delta,x1,x2;
            System.out.println("Digite o A");
                a=in.nextDouble();
            System.out.println("Digite o B");
                b=in.nextDouble();
            System.out.println("Digite o C");
                c=in.nextDouble();
                delta=(b*b)-4*a*c;
                bhask=Math.sqrt(delta);

                if(delta<0){
                    System.out.println("Não existem raízes reais para a equação");
                } else if (delta==0) {
                    System.out.println("Existe apenas uma raiz real para a equação");
                    x1=(-b+bhask)/(2*a);
                    System.out.println("Seu x1 é "+bhask);
                } else {
                    System.out.println("Existem duas raízes reais para a equação");
                    x1=(-b+bhask)/(2*a);
                    x2=(-b-bhask)/(2*a);
                    System.out.println("o x1 é "+x1+ "e o x2 é "+x2);
                }
    }
}