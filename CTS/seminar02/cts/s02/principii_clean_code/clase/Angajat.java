package cts.s02.principii_clean_code.clase;

public class Angajat extends Aplicant {
	private String ocupatie;
	private int salariu;
	
	private static int sumaFinantata = 10;

	public Angajat() {
		super();	
	}
	
	public Angajat(String nume, String prenume, int varsta, int punctaj, int numarProiecte, String[] denumireProiecte, int salariu, String ocupatie) {
		super(nume, prenume, varsta, punctaj, numarProiecte, denumireProiecte);
		this.salariu = salariu;
		this.ocupatie = ocupatie;
	}
	
	public String getOcupatie() {
		return ocupatie;
	}
	
	public void setOcupatie(String ocupatie) {
		this.ocupatie = ocupatie;
	}
	
	public int getSalariu() {
		return salariu;
	}
	
	public void setSalariu(int salariu) {
		this.salariu = salariu;
	}

	@Override
	public String toString() {
		return "Angajat: " + super.toString() + "Ocupatie=" + ocupatie + ", salariu=" + salariu;
	}
	
	@Override
	public void afisareFinantare() {
		super.afisareFinantare("Angajat", Angajat.sumaFinantata);
	}
}
