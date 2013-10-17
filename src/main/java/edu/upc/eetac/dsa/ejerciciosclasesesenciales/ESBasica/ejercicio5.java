package edu.upc.eetac.dsa.ejerciciosclasesesenciales.ESBasica;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ejercicio5 {

	public static void main(String[] arg) {
		Date now = new Date();
		String sFichero = "C:\\Users\\Joan Ignasi\\Documents\\Uni\\3r\\"
				+ "DSA\\Tema 3 - Fundamentos Java\\ejercicios\\ejemplo.jpg";
		File fichero = new File(sFichero);

		System.out.println("El fichero pesa: " + fichero.length() + " bytes");

		String contenido;
		SimpleDateFormat fecha = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String nombre = sFichero.substring(79); // de un string coge a partir
												// del caracter 79 (para ver el
												// nombre)
		contenido = fecha.format(now) + " " + nombre + " " + fichero.length();

		File file = null;

		try {

			file = new File(
					"C:\\Users\\Joan Ignasi\\Documents\\Uni\\3r\\DSA\\"
					+ "Tema 3 - Fundamentos Java\\ejercicios\\registro.txt");
			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(contenido);
			bw.newLine();
			bw.close();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

	}

}
