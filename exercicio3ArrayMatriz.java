package ArraysVetoreMatriz;

import java.util.Scanner;

public class exercicio3ArrayMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner (System.in);

		int[][] num = new int[3][3];
		int linha,coluna,cont=0;

		for(linha=0;linha<3;linha++)
		{
			for(coluna=0;coluna<3;coluna++)
			{
				System.out.println("\nEntre com um n�mero ");
				num[linha][coluna]=leia.nextInt();

				if(num[linha][coluna]>10)
				{
					cont++;
				}

			}
		}
		System.out.printf("\nForam informados %d n�meros maiores que 10 para matriz.",cont);
	
	}
}
