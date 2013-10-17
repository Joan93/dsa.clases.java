package edu.upc.eetac.dsa.ejerciciosclasesesenciales.ESBasica;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class mainej7 {
	
	  public static void main(String[] args) {
	    String filename = "time.ser";
	    Dato p = new Dato("Pepe", 25,'h');

	    FileOutputStream fos = null;
	    ObjectOutputStream out = null;
	    try {
	      fos = new FileOutputStream(filename);
	      out = new ObjectOutputStream(fos);
	      out.writeObject(p);

	      out.close();
	    } catch (Exception ex) {
	      ex.printStackTrace();
	    }
	    FileInputStream fis = null;
	    ObjectInputStream in = null;
	    try {
	      fis = new FileInputStream(filename);
	      in = new ObjectInputStream(fis);
	      p = (Dato) in.readObject();
	      out.close();
	    } catch (Exception ex) {
	      ex.printStackTrace();
	    }
	    System.out.println(p);
	  }
	} 

