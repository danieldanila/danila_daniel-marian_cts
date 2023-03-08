package cts.s02.principii_clean_code.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Aplicant;

public abstract class AplicantReadable {
	public abstract List<Aplicant> readAplicants(String fileName) throws FileNotFoundException;

	public void readAplicant(Scanner scanner, Aplicant aplicant) {
		String nume = scanner.next();
		String prenume = scanner.next();
		int varsta = scanner.nextInt();
		int punctaj = scanner.nextInt();
		int numarProiecte = scanner.nextInt();
		String[] denumiriProiecte = new String[numarProiecte];
		for (int i = 0; i < numarProiecte; i++)
			denumiriProiecte[i] = scanner.next();
		
		aplicant.setNume(nume);
		aplicant.setPrenume(prenume);
		aplicant.setVarsta(varsta);
		aplicant.setPunctaj(punctaj);
	}
}

