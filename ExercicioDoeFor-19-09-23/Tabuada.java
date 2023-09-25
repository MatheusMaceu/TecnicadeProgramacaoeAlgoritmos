
public class Tabuada {
	public static void main(String[] args) {
		int r;
		for (int i=1; i<11; i++) {
			int n=1;
			while (n<11) {
				r = n * i;
				System.out.println(i+"x"+n+"="+r);
				n++;
			}
		}
	}
}
