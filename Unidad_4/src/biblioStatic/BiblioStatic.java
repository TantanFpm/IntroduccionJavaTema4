package biblioStatic;

import java.util.Scanner;

public class BiblioStatic {
	
	public static void multiplo5(int limite1, int limite2) {
		int buscaMultiplo5=limite1;
		while(buscaMultiplo5%5!=0)
			buscaMultiplo5+=1;
		if (buscaMultiplo5>limite2 || (buscaMultiplo5==limite2 && buscaMultiplo5%5!=0) ) {
			System.out.println("No hay multiplos de 5 entre estos dos numeros");
		}
		while(buscaMultiplo5<=limite2) {
			System.out.print(buscaMultiplo5 + "\t");
			buscaMultiplo5+=5;
		}
		System.out.println("\n");
		
	}
	
	public static int tipoCaracter(char caracter) {
		if(caracter>=65 && caracter<=90)
			return 1;
		else if(caracter>=97 && caracter<=122)
			return 2;
		else
			return -1;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		int num1;
		int num2;
		Scanner sc = new Scanner(System.in);
		/*do {
			do {

				System.out.println("Introduce un numero positivo");
				num1 = sc.nextInt();

				do {

					System.out.println("Introduce otro numero mayor que el anterior");
					num2 = sc.nextInt();

				} while (num2 <= num1);

			} while (num1 < 0 || num2 < 0);
			if (num1 != 0 && num2 != 0)
				BiblioStatic.multiplo5(num1, num2);

		} while (num1 != 0 && num2 != 0);
		sc.close();*/
		Scanner scChar= new Scanner(System.in);
		for(int i=1; i<=5; i++) {
			System.out.println("Introduce un caracter");
		
		}	
		
	}

}
