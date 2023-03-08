package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public class Student extends Aplicant {
	protected String facultate;
	protected int anStudii;
	
	private static int sumaFinantata = 20;
	
	
	public String getFacultate() {
		return facultate;
	}
	public void setFacultate(String facultate) {
		this.facultate = facultate;
	}
	public int getAn_studii() {
		return anStudii;
	}
	public void setAn_studii(int an_studii) {
		this.anStudii = an_studii;
	}


	public Student() {
		super();
		
	}
	
	public Student(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect, String facultate, int an_studii) {
		super(nume,prenume,varsta,punctaj,nr_proiecte,denumireProiect);
		this.facultate = facultate;
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