package cts.s02.principii_clean_code.clase;

public class Elev extends Aplicant {
	private int clasa;
	private String tutore;
	
	private static int sumaFinantata = 30;
	
	public Elev() {
		super();
	}
	
	public Elev(String nume, String prenume, int varsta, int punctaj, 
			int numarProiecte, String[] denumireProiect, int clasa, String tutore) {
		super(nume, prenume, varsta, punctaj, numarProiecte, denumireProiect);
		this.clasa = clasa;
		this.tutore = tutore;
	}
	
	public int getClasa() {
		return clasa;
	}
	
	public void setClasa(int clasa) {
		this.clasa = clasa;
	}
	
	public String getTutore() {
		return tutore;
	}
	
	public void setTutore(String tutore) {
		this.tutore = tutore;
	}
	
	@Override
	public String toString() {
		return "Elev: " + super.toString() + "Clasa=" + clasa + ", Tutore=" + tutore;
	}
	
	@Override
	public void afisareFinantare() {
		super.afisareFinantare("Angajat", Elev.sumaFinantata);
	}
}
