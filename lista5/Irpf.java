import java.util.Scanner;
public class Irpf {
    public static void main (String[]args) {
        Scanner in = new Scanner (System.in);
            double salario, irpf, aliquota, imposto, salarioatual;
            System.out.println("Digite seu Salário");
            salario = in.nextDouble();
            if(salario<=1434.59) {
                System.out.println("Não há desconto e alíquota");
            } else if (salario>=1434.60 && salario<=2150) {
                irpf = salario*7.5/100-107.59;
                salarioatual = salario-irpf;
                System.out.println("Sua alíquota é de 7,5 e o imposto de 107,59. O desconto realizado é de "+irpf+" então seu salário atual é "+salarioatual);
            } else if (salario>2150 && salario<=2866.70) {
                irpf = salario*15/100-268;
                salarioatual = salario-irpf;
                System.out.println("Sua alíquota é de 15 e o imposto de 268,84. O desconto realizado é de "+irpf+" então seu salário atual é de "+salarioatual);
            } else if (salario>2866.70 && salario <=3582) {
                irpf = salario*22.5/100-482.84;
                salarioatual = salario-irpf;
                System.out.println("Sua alíquota é de 22,5 e o imposto de 483,84. O desconto realizado é de "+irpf+" então seu salário atual é de "+salarioatual);
            } else if (salario>3582) {
                irpf = salario*27.5/100-662.94;
                salarioatual = salario-irpf;
                System.out.println("Sua alíquota é de 27,5 e o imposto de 662,94. O desconto realizado é de "+irpf+" então seu salário atual é de "+salarioatual);
            }
    }
}