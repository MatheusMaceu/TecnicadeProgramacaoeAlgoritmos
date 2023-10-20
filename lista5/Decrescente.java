import java.util.Scanner;
public class Decrescente {
    public static void main (String[]args) {
        Scanner in = new Scanner (System.in);
            int a, b, c;
            System.out.println("Insira o A");
            a=in.nextInt();
            System.out.println("Insira o B");
            b=in.nextInt();
            System.out.println("Insira C");
            c=in.nextInt();
            if (a>b && b>c){
                System.out.println("A ordem é C B A ");
            } else if (a>b && b<c && a>c) {
                System.out.println("A ordem é B C A");
            } else if (a<b && b>c && c>a) {
                System.out.println("A ordem é A C B");
            } else if (a<b && b > c && a>c) {
                System.out.println("A ordem é C A B");
            } else if (a<b && b<c) {
                System.out.println("A ordem é A B C");
            } else {
                System.out.println("A ordem é B A C");
            }
    }
}