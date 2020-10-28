package modelos;

import java.util.ArrayList;
import java.util.List;

public class Materias {

	MateriaEnum name;
	List<Double> listaDeNotas =  new ArrayList<Double>();
	
	public Materias(MateriaEnum name, List<Double> listaDeNotas) {
		super();
		this.name = name;
		this.listaDeNotas = listaDeNotas;
	}

	public MateriaEnum getName() {
		return name;
	}

	public void setName(MateriaEnum name) {
		this.name = name;
	}

	public List<Double> getListaDeNotas() {
		return listaDeNotas;
	}

	public void setListaDeNotas(List<Double> listaDeNotas) {
		this.listaDeNotas = listaDeNotas;
	}

	@Override
	public String toString() {
		return "Materias [name=" + name + ", listaDeNotas=" + listaDeNotas + "]";
	}
	
    
	
	   

   
}
