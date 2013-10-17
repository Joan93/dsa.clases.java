package edu.upc.eetac.dsa.ejerciciosclasesesenciales.ESBasica;

import java.io.*;

public class Dato implements Serializable {

	String nombre;
	int edad;
	char genero;

	public Dato(String nom, int e, char g) {
		this.nombre = nom;
		this.edad = e;
		this.genero = g;
	}

	public String getnombre() {
		return nombre;
	}

	public void setnombre(String nom) {
		this.nombre = nom;
	}

	public int getedad() {
		return edad;
	}

	public void setedad(int ed) {
		this.edad = ed;
	}

	public void setgenero(char gen) {
		this.genero = gen;
	}

	public char getgenero() {
		return genero;
	}

	public String toString() {
		return "Dato (persona) [nombre=" + nombre + ", edad=" + edad+ ", género="+genero+ "]";
	}
}
