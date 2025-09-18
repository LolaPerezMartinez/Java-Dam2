package repaso.herencia;

import java.time.LocalDate;

public abstract class Profesion {
private String nombre;
private short anioNacimiento;
private String especialidad;


public Profesion(String nombre, short anioNacimiento, String especialidad) {
	this.nombre = nombre;
	this.anioNacimiento = anioNacimiento;
	this.especialidad = especialidad;
}

public abstract void trabajar();

public short calcularEdad(Profesion p) {
	return (short) (LocalDate.now().getYear() - p.anioNacimiento);
}



public String getNombre() {
	return nombre;
}

public short getAnioNacimiento() {
	return anioNacimiento;
}

public String getEspecialidad() {
	return especialidad;
}

@Override
public String toString() {
	return "Profesion [nombre=" + nombre + ", anioNacimiento=" + anioNacimiento + ", especialidad=" + especialidad
			+ "]";
}





}

