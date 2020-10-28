package visitas;

import java.util.Scanner;

public abstract class MenuTemplate {
	   
	Scanner alumnado = new Scanner(System.in);
	
	
	public abstract void cargarDatos();
	public abstract void exportarDatos();
	public abstract void crearAlumnos();
	public abstract void agregarMateria();
	public abstract void agregarNotaPasoUno();
	public abstract void listaAlumnos();
	public abstract void terminarPrograma();
	public  void  iniciarMenu (Scanner alumnado) {
		System.out.println(alumnado);
	}
	
}
