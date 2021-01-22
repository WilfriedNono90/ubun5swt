package gui;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

import projekte.Projekt;
import projektmitarbeiter.Mitarbeiter;

public class Main {
	
	static List<Mitarbeiter> mitarbeiterList = new ArrayList<Mitarbeiter>();
	static List<Projekt> projektList = new ArrayList<Projekt>();

	public static void main(String[] args) {
		boolean start = true;
		int wahl = 0;
		while(start) {
			System.out.println("(0) Ende \n"+
					"(1) Neuen Mitarbieter anlegen \n"+
					"(2) Neues Projekt anlegen \n"+
					"(3) Einem Projekt Mitarbieter zuordnen \n"+
					"(4) Einem Mitarbieter projekt zuornen \n"+
					"(5) Einen Mitarbieter aus einem Projekt entfernen \n"+
					"(6) Ein Projekt von einem Mitarbieter entfernen \n"+
					"(7) Alle Mitarbieter zu einem Projekt ausgeben \n"+
					"(8) Alle Projekte eines Mitarbieter ausgeben "
					);
			wahl = new Scanner(System.in).nextInt();
			
			switch (wahl) {
			case 0: start = false;
				    break;
			case 1: 
					mitarbeiterList.add(new Mitarbeiter());
					break;
			case 2: projektList.add(new Projekt());
					break;
			case 3: mitarbeiterzuProjektHinfuegen();  break;
			case 4: projektZuMitarbeiterHinfuegen(); break;
			case 5: mitarbeiterausProjektEntfernen();  break;
			case 6: projektAusMitarbeiterEntfernen(); break;
			case 7: mitrbeitereinesProjektAusgeben(); break;
			case 8: projekteinesMitarbeiterAusgeben(); break;
 
			default: System.out.println("Lustig :-)");
				break;
			}
		}
	}

	private static void projekteinesMitarbeiterAusgeben() {
		System.out.println( "Nummer des Mitarbeiter eingeben" );
		int mitarbeiternummer = new Scanner( System.in).nextInt();
		Mitarbeiter mitarbeiter = findMitarbeiterById(mitarbeiternummer);
		System.out.println( mitarbeiter.toString() );
		
	}

	private static void mitrbeitereinesProjektAusgeben() {
		System.out.println("Nummer des Projektes eingeben");
		int projeknummer = new Scanner(System.in).nextInt();
		Projekt projekt = findProjektbyId(projeknummer);
		System.out.println( projekt.toString() );
		
	}

	private static void projektAusMitarbeiterEntfernen() {
		System.out.println("Nummer des Mitarbeiter eingeben");
		int mitarbeiternummer = new Scanner( System.in).nextInt();
		System.out.println("Nummer des Projektes eingeben");
		int projeknummer = new Scanner(System.in).nextInt();
		
		Mitarbeiter mitarbeiter = findMitarbeiterById(mitarbeiternummer);
		Projekt projekt = findProjektbyId(projeknummer);
		mitarbeiter.projektLoeschen(projekt);
		
	}

	private static void mitarbeiterausProjektEntfernen() {
		System.out.println("Nummer des Projektes eingeben");
		int projeknummer = new Scanner(System.in).nextInt();
		System.out.println("Nummer des Mitarbeiter eingeben");
		int mitarbeiternummer = new Scanner( System.in).nextInt();
		Mitarbeiter mitarbeiter = findMitarbeiterById(mitarbeiternummer);
		Projekt projekt = findProjektbyId(projeknummer);
		projekt.bearbeiterLoeschen(mitarbeiter);
		
	}

	private static void projektZuMitarbeiterHinfuegen() {
		System.out.println("Nummer des Mitarbeiter eingeben");
		int mitarbeiternummer = new Scanner( System.in).nextInt();
		System.out.println("Nummer des Projektes eingeben");
		int projeknummer = new Scanner(System.in).nextInt();
		
		Mitarbeiter mitarbeiter = findMitarbeiterById(mitarbeiternummer);
		Projekt projekt = findProjektbyId(projeknummer);
		mitarbeiter.projektHinfuegen(projekt);
		
	}

	private static void mitarbeiterzuProjektHinfuegen() {
		System.out.println("Nummer des Projektes eingeben");
		int projeknummer = new Scanner(System.in).nextInt();
		System.out.println("Nummer des Mitarbeiter eingeben");
		int mitarbeiternummer = new Scanner( System.in).nextInt();
		Mitarbeiter mitarbeiter = findMitarbeiterById(mitarbeiternummer);
		Projekt projekt = findProjektbyId(projeknummer);
		projekt.bearbeiterHinfuegen(mitarbeiter);
		
	}

	private static Projekt findProjektbyId(int projeknummer) {
		for (Projekt projekt : projektList) {
			if (projekt.getPrnr() == projeknummer) {
				return projekt;
			}
		}
		return null;
	}

	private static Mitarbeiter findMitarbeiterById(int mitarbeiternummer) {
		for (Mitarbeiter mitarbeiter : mitarbeiterList) {
			if (mitarbeiter.getMinr() == mitarbeiternummer) {
				return mitarbeiter;
			}
		}
		return null;
	}
	
	

}
