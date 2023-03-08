package cts.s02.principii_clean_code.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Angajat;
import cts.s02.principii_clean_code.clase.Aplicant;

public class AngajatReadable extends AplicantReadable {

	@Override
	public List<Aplicant> readAplicants(String fileName) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(fileName));
		scanner.useDelimiter(",");
		List<Aplicant> angajati = new ArrayList<>();

		while (scanner.hasNext()) {
			Angajat angajat = new Angajat();
			super.readAplicant(scanner, angajat);
			int salariu = scanner.nextInt();
			String ocupatie = scanner.next();
			angajat.setOcupatie(ocupatie);
			angajat.setSalariu(salariu);
			angajati.add(angajat);
		}
		scanner.close();
		return angajati;
	}
	
}
