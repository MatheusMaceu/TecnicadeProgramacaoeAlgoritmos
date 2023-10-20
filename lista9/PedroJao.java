public class PedroJao {
	public static void main(String[] args) {
		double joao=1.34, pedro=1.45, i=1, ano=0;
		joao=joao*100;
		pedro=pedro*100;
		while (i>0){
			joao=joao+2.5;
			pedro=pedro+2;
			if (pedro>joao) {
				i++;
			} else {
				ano=i;
				i=0;
			}
		}
		System.out.println("João demorou "+ano+" anos para passar a altura de pedro");
	}
}
 