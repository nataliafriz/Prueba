package visitas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import servicios.AlumnoServicio;
import servicios.ArchivoServicios;

public class Menu extends MenuTemplate {

	
	Scanner alumnados = new Scanner (System.in);
	
	AlumnoServicio alumnoServicio;
	ArchivoServicios archivoServicios;
	
	Menu cargaDeDAtos, exportaDatos, crearAlumnos, agregaMateria, agregarNotaPasoUno, listaAlumnos, terminarPrograma;
	
	
	@Override
	public void cargarDatos() {
		
		try{
			File cargaDatos = new File("datos.csv");
		    alumnados = new Scanner(cargaDatos);
			while(alumnados.hasNextLine()){
			String lecturaLineas = alumnados.nextLine();
			System.out.println(lecturaLineas);
			}

			}catch(FileNotFoundException mensaje){
			System.out.println("El archivo no existe…");
			}
		
	}

	@Override
	public void exportarDatos() {
		
		
		
		
	}

	@Override
	public void crearAlumnos() {
	       
		
	}

	@Override
	public void agregarMateria() {
	
		
	}

	@Override
	public void agregarNotaPasoUno() {
		
		
	}

	@Override
	public void listaAlumnos() {
		
		
	}

	@Override
	public void terminarPrograma() {
		
		
	}

	
		
	
		
	
	}

	

	/*	MateriaEnum materias = MateriaEnum.MATEMATICA ;
		
	    Scanner lectura = new Scanner(System.in);
	    System.out.println("Ecriba materia seleccionada ");
	    String respuesta = lectura.nextLine();
	    
	    MateriaEnum valor = MateriaEnum.valueOf(respuesta);
	    System.out.println(valor);
		*/

		


	
