package vetores;

import java.util.Scanner;

public class par {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int TAM = 10;
		int a[],i,contagem = 0;
		
		a = new int [TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("Digite o " + (i+1) + " valor: ");
			a[i] = ler.nextInt();
		}
		if(i==TAM){
			i=0;
			for(i=0;i<TAM;i++) {
				if(a[i]%2==0) {
					contagem++;
					System.out.print(a[i] + ", ");
				}
			}
			System.out.println(" ");
			System.out.println(contagem + " Numeros sao pares");
		}
	}

}
