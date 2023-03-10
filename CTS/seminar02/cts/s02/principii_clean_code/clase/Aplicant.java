package cts.s02.principii_clean_code.clase;

import java.util.Arrays;

public abstract class Aplicant {
	protected String nume;
	protected String prenume;
	protected int varsta;
	protected int punctaj;
	protected int numarProiecte;
	protected String[] denumireProiect;
	
	private static int pragPunctaj = 80;
	
	public Aplicant() {
		super();
	}
	
	public Aplicant(String nume, String prenume, int varsta, int punctaj, int nr_proiecte, String[] denumireProiect) {
		super();
		this.nume = nume;
		this.prenume = prenume;
		this.varsta = varsta;
		this.punctaj = punctaj;
		this.numarProiecte = nr_proiecte;
		this.denumireProiect = denumireProiect;
	}
	
	public String getNume() {
		return this.nume;
	}
	
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	public String getPrenume() {
		return this.prenume;
	}
	
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	
	public int getVarsta() {
		return this.varsta;
	}
	
	public void setVarsta(int varsta) {
		this.varsta = varsta;
	}
		
	public int getPunctaj() {
		return this.punctaj;
	}
	
	public void setPunctaj(int punctaj) {
		this.punctaj = punctaj;
	}
	
	public int getNumarProiecte() {
		return numarProiecte;
	}
	
	public void setProiecte(int numarProiecte, String[] denumiriProiecte) {
		this.numarProiecte = numarProiecte;
		this.denumireProiect = new String[this.numarProiecte];
		for(int i = 0; i < this.numarProiecte; i++) {
			this.denumireProiect[i] = denumiriProiecte[i];
		}
	}
	
	public void afisareStatus() {
		System.out.println("Aplicantul " + this.nume + " " + this.prenume 
				+ (this.punctaj > Aplicant.pragPunctaj ? " " : " nu " ) 
				+ "a fost acceptat.");
	}
		
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("nume=");
		builder.append(nume);
		builder.append(", prenume=");
		builder.append(prenume);
		builder.append(", varsta=");
		builder.append(varsta);
		builder.append(", punctaj=");
		builder.append(punctaj);
		builder.append(", nr_proiecte=");
		builder.append(numarProiecte);
		builder.append(", denumireProiect=");
		builder.append(Arrays.toString(denumireProiect));
		return builder.toString();
	}
	
	public abstract void afisareFinantare();
	
	protected void afisareFinantare(String tipAplicant, int sumaFinantata) {
		System.out.println(this.nume + " " + this.prenume + " primeste " + sumaFinantata 
				+ " euro/zi in proiect");
	}
}
