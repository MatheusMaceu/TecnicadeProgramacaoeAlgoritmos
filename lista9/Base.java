import java.util.Scanner;
public class Base {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int base, i, armazenbase;
		System.out.println("Digite sua base");
		base=in.nextInt();
		armazenbase=base;
		System.out.println("Digite seu expoente");
		i=in.nextInt();
		while (i>1){
			armazenbase=armazenbase*base;
			i=i-1;
		}
		System.out.println("Sua potência tem o resultado de "+armazenbase);
	}

}
