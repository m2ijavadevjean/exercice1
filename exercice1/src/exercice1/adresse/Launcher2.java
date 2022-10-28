package exercice1.adresse;

import java.util.Scanner;

public class Launcher2 {

	public static void main(String[] args) {
		Scanner monScanner = new Scanner(System.in);
		
		System.out.println("Entrez votre adresse?");
		System.out.println("Entrer votre numero de rue");
		String StrNumRue = monScanner.nextLine();
		int numRue = Integer.parseInt(StrNumRue);
		System.out.println("Quel est votre nom de rue?");
		String nomRue = monScanner.nextLine();
		System.out.println("Quel est votre codepostal");
		String codePostal = monScanner.nextLine();
		
		
		System.out.println("Quel est votre codepostal" + " " + numRue + " " + nomRue);

	}

}
