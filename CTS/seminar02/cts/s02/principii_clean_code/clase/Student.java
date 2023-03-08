package cts.s02.principii_clean_code.clase;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	
	private static int sumaFinantata = 20;
	
	public Student() {
		super();
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int numarProiecte, 
			String[] denumireProiect, String facultate, int anStudii) {
		super(nume, prenume, varsta, punctaj, numarProiecte, denumireProiect);
		this.facultate = facultate;
		this.anStudii = anStudii;
	}
	
	public String getFacultate() {
		return facultate;
	}
	
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	
	public int getAnStudii() {
		return anStudii;
	}
	
	public void setAnStudii(int an_studii) {
		this.anStudii = an_studii;
	}	
	
	@Override
	public String toString() {
		return "Student: " + super.toString() + "Facultate=" + facultate + ", An_studii=" + anStudii ;
	}
	
	@Override
	public void afisareFinantare() {
		super.afisareFinantare("Student", Student.sumaFinantata);
	}
}