package projekte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projektmitarbeiter.Mitarbeiter;

public class Projekt {
	
	private String name;
	private int prnr;
	private List<Mitarbeiter> bearbeiter;

	public Projekt() {
		
		System.out.println("Name des Projekts eingeben");
		name = new Scanner(System.in).nextLine();
		System.out.println(" ");
		System.out.println("Nummer des Projekts eingeben");
		prnr = new Scanner(System.in).nextInt();
		bearbeiter = new ArrayList<Mitarbeiter>();
		
	}
	
	public Projekt(String name, int prnr) {
		this.name = name;
		this.prnr = prnr;
		bearbeiter = new ArrayList<Mitarbeiter>();
	}
	
	public void bearbeiterHinfuegen(Mitarbeiter m) {
		bearbeiter.add(m);
	}
	
	public void bearbeiterLoeschen(Mitarbeiter m) {
		bearbeiter.remove(m);
	}
	
	public String getName() {
		return name;
	}
	
	
	public int getPrnr() {
		return prnr;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrnr(int nummer) {
		prnr = nummer;
	}
	
	public String toString() {
		String resultString;
		resultString = "projektnummer"+ prnr +" "+" Name "+ name +"\n";
		
		for (Mitarbeiter mitarbeiter : bearbeiter) {
			resultString = resultString + " Miarbeiter nummer "+mitarbeiter.getMinr()+" Mitarbeitername "+mitarbeiter.getName()+"\n";
		}
		
		return resultString;
	}

}
