import java.util.Scanner;
	public class Minimo {
		public static void main (String[] args) {
			Scanner in= new Scanner (System.in);
				int salario, salariominimo, quantidade;
				
				System.out.println("Insira seu salario");
				salario= in.nextInt();
				salariominimo= 1320;
				quantidade= salario/salariominimo;
				System.out.print("A quantidade de sal�rios minimos que voc� ganha � "+quantidade);
		}
}
