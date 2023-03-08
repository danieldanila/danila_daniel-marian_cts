package cts.s02.principii_clean_code.clase.readers;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import cts.s02.principii_clean_code.clase.Aplicant;
import cts.s02.principii_clean_code.clase.Student;

public class StudentReadable extends AplicantReadable {

	@Override
	public List<Aplicant> readAplicants(String fileName) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File(fileName));
		scanner.useDelimiter(",|\n");
		List<Aplicant> studenti = new ArrayList<>();

		while (scanner.hasNext()) {
			Student student = new Student();
			super.readAplicant(scanner, student);
			int anStudii  = scanner.nextInt();
			String facultate = (scanner.next()).toString();
			student.setAnStudii(anStudii);
			student.setFacultate(facultate);
			studenti.add(student);
		}
		scanner.close();
		return studenti;
	}

}
