package modelos;

import java.util.Scanner;

public enum MateriaEnum {

	MATEMATICA,
	LENGUAJE,
	CIENCIAS,
	HISTORIA;
	
	
	public void  MateriaEnum materias = MateriaEnum.MATEMATICA ;
	
    Scanner lectura = new Scanner(System.in);
    System.out.println("Ecriba materia seleccionada ");
    String respuesta = lectura.nextLine();
    
    MateriaEnum valor = MateriaEnum.valueOf(respuesta);
    System.out.println(valor);
    
}
