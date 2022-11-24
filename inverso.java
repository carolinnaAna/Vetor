package vetores;

import java.util.Scanner;

public class inverso {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		final int TAM=10;
		int a[],i,b[];
		
		a = new int [TAM];
		b = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite dez valores, e ao final veja a sequencia de tras para frente");
			a[i] = ler.nextInt();
		}
			for(i=(TAM-1);i>=0;i--) {
				b[i] = a[i];
				System.out.print(b[i] + ", ");
		}
	}

}
