/**
* @author Sergio Juarez Hariche
* @version 1.0
*/

public class Sergio {
	
	public static void main (String[] args) {
		
		double valor = 2.0;
		double EUROS_A_DOLARES = valor * 1.16;
		double DOLARES_A_EUROS = valor * 0.84;
	
		
			System.out.println (valor + "$ al cambio es: " + DOLARES_A_EUROS + "€");
			System.out.println (valor + "€ al cambio es: " + EUROS_A_DOLARES + "$");

	}
}
