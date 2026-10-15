import java.util.ArrayList;
import java.util.Scanner;

public class Programm {
	
	private static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Ortssuche");
		
		System.out.println();
		
		System.out.println("Zu verwendene Datenbank auswählen: ");
		System.out.println("(1) MySQL/MariaDB");
		System.out.println("(2) SQLite");
		
		System.out.println();
		
		System.out.print("Eingabe: ");
		
		int selection = in.nextInt();
		
		ArrayList<Ort> orte = null; 
		
		if (selection == 1) {
			orte = DBService.liesAlles(false);
		}
		else if (selection == 2) {
			orte = DBService.liesAlles(true);
		}
		
		System.out.println();
		
		System.out.println("Funktionsweise auswählen: ");
		System.out.println("(1) Alles ausgeben");
		System.out.println("(2) PLZ-Suche");
		
		System.out.println();
		
		System.out.print("Eingabe: ");
		
		int functionSelection = in.nextInt();
		
		if (functionSelection == 1) {
			for (int i = 0; i < orte.size(); i++) {
				Ort ort = orte.get(i);
				
				System.out.println(ort);
			}
		}
		else if (functionSelection == 2) {
			in.nextLine();
			
			System.out.println();

			System.out.print("PLZ-Anfang eingeben: ");
			
			String plz = in.nextLine().trim();

			orte.stream()
			.filter(ort -> String.format(java.util.Locale.ROOT, "%05d", ort.getPlz())
					.startsWith(plz))
			.forEach(System.out::println);
		}
		
		
		
	}

}
