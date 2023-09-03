import java.util.Scanner;
public class Numeraispares {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int i=0;
		while(i<500) {
			System.out.println(i);
			i=i+2;
		}
		in.close();
	}
}
