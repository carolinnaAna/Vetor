package vetores;

import java.util.Scanner;

public class comparacao {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[],i,maior =0, menor = 200;
		
		a = new int[TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite " + (i+1) + " valor");
			a[i] = ler.nextInt();
		}
		if(i==TAM){
			for(i=(TAM-1);i>0;i--) {
				if(maior<=a[i]) {
					maior = a[i];
				}
				if(menor>=a[i]) {
					menor = a[i];
				}
			}
		}
		System.out.println("O maior valor eh: " + maior);
		System.out.println("O menor valor eh: " +menor);
	}

}
