package projektmitarbeiter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projekte.Projekt;

public class Mitarbeiter {
	private int minr ;
	private String name;
	private List<Projekt> projekte = projekte = new ArrayList<Projekt>();
	
	public Mitarbeiter() {
		System.out.println("Nummer des Mitarbeiter eingeben");
		minr = new Scanner( System.in).nextInt();
		System.out.println("");
		System.out.println("Name des Mitarbeiter eingeben");
		name = new Scanner(System.in).nextLine();
		
	}
	
	

	public Mitarbeiter(int minr, String name) {
		super();
		this.minr = minr;
		this.name = name;
	}
	
	public void projektHinfuegen(Projekt p) {
		projekte.add(p);
	}
	
	public void projektLoeschen(Projekt p) {
		projekte.remove(p);
	}



	public int getMinr() {
		return minr;
	}

	public void setMinr(int minr) {
		this.minr = minr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		String resultString;
		resultString = "mitarbeiternummer"+ minr +" "+" Name "+ name +"\n";
		
		for (Projekt projekt : projekte) {
			resultString = resultString + " Projektnummer "+projekt.getPrnr()+" Projektname "+projekt.getName()+"\n";
		}
		
		return resultString;
	}
	
	

}
