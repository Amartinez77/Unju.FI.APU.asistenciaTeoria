package ar.edu.unju.fi.main;

import java.util.Scanner;

import ar.edu.unju.fi.model.Alumno;
import ar.edu.unju.fi.model.Materia;
import ar.edu.unju.fi.model.RegistroNota;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("inicio del programa");
		
		
		Alumno alumno = generarAlumno();
		registrarNotas(alumno, 2);
		
		//System.out.println(alumno.toString());

		
		
		
	}

	
	public static Alumno generarAlumno() {
		
		Alumno alumno = new Alumno();
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("ingrese legajo");
		
		Integer legajo = scanner.nextInt();
		
		System.out.println("ingrese apellido");
		
		String apellido = scanner.next();
		
		System.out.println("ingrese nombre");
		
		String nombre = scanner.next();
		
		
		alumno.setLegajo(legajo);
		alumno.setApellido(apellido);
		alumno.setNombre(nombre);
		
		//scanner.close();		
		return alumno;
		
	}
	
	
	public static void registrarNotas(Alumno alumno, int numMaterias) {
		
		Scanner scanner = new Scanner(System.in);
		
		while(numMaterias <= 2) {
			// cargar materias
			
			System.out.println("Ingrese el codigo de la materia");
			String codigoMateria = scanner.next();
			System.out.println("Ingrese el nombre de la materia");
			String nombreMateria = scanner.next();
			
			Materia materia = new Materia(codigoMateria, nombreMateria);
			
			System.out.println("Ingrese el codigo de registro de nota");
			String codigoNota = scanner.next();
			System.out.println("Ingrese nota final");
			float nota = scanner.nextFloat();
			
			RegistroNota registroNota = new RegistroNota(codigoNota, alumno, materia, nota);
			
			System.out.println(registroNota.toString());
			
			numMaterias++;
		}
		
		//scanner.close();
		
	}
	

	
	
}
