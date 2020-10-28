package modelos;

import java.util.HashSet;
import java.util.Set;

public class Alumno {

	String rut;
	String name;
	String surname;
	String address;
	Set<Materias> hash_Set  = new HashSet<Materias>();
	
	
	
	public Alumno(String rut, String name, String surname, String address, Set<Materias> hash_Set) {
		super();
		this.rut = rut;
		this.name = name;
		this.surname = surname;
		this.address = address;
		this.hash_Set = hash_Set;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Set<Materias> getHash_Set() {
		return hash_Set;
	}
	public void setHash_Set(Set<Materias> hash_Set) {
		this.hash_Set = hash_Set;
	}
	@Override
	public String toString() {
		return "Alumno [rut=" + rut + ", name=" + name + ", surname=" + surname + ", address=" + address + ", hash_Set="
				+ hash_Set + "]";
	} 
	
	
}
	
