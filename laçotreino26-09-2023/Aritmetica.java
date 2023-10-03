
public class Aritmetica {
	public static void main(String[] args) {
		int n=14, i=0, soma=0;
		double r;
		
		while (n<73){
			soma = soma+n;
			i++;
			n++;
		}
		r = soma/i;
		System.out.println("O resultado da média aritmética é "+r);
	}
}
