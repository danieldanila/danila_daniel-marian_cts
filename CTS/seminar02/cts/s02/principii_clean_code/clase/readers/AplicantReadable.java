package cts.s02.principii_clean_code.clase.readers;

import java.io.FileNotFoundException;
import java.util.List;

import cts.s02.principii_clean_code.clase.Aplicant;

public interface AplicantReadable {
	List<Aplicant> readAplicants(String fileName) throws FileNotFoundException;
}
