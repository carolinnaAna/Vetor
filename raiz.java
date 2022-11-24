package vetores;

import java.util.Scanner;

public class raiz {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		final int TAM =10;
		int a[],i;
		double b[];
		
		a = new int [TAM];
		b = new double [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o " + (i+1) + "o" + "valor: ");
			a[i] = ler.nextInt();
			b[i] = Math.sqrt(a[i]);
			System.out.println(b[i]);
		}
	}

}
