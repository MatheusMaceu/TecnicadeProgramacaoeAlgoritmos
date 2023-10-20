
public class MultiploDez {
	public static void main(String[] args) {
		double multiplo;
		for(int i=1; i<=100; i++) {
			multiplo = i%10;
			if (multiplo==0){
				System.out.println(i+" É multiplo de 10");
			} else {
				System.out.println(i);
			}
		}
	}
}
