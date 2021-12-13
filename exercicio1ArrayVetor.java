package ArraysVetoreMatriz;

import java.util.Scanner;

public class exercicio1ArrayVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);
		
		int[] a= {1, 0, 5, -2, -5, 7};
		int soma, x;
		
		soma = a[0]+a[1]+a[5];
		
		System.out.println("\nA soma das três posições solicitadas (a0, a1 e a5) foi de: "+soma);
		
		a[4] = 100;
		System.out.println("\nValor do vetor a4 é: ");
		
		for (x=0; x<6; x++)
		{
			System.out.println("\n"+a[x]);
		}

		
	}

}
