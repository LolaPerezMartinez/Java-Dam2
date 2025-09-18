package repaso.herencia;

public class Ingeniero extends Profesion {
	private double horas;
	private double tarifaPorHora;
	
	public Ingeniero(String nombre, short anioNacimiento, String especialidad, double horas, double tarifaPorHoras) {
		super(nombre, anioNacimiento, especialidad);
		this.horas = horas;
		this.tarifaPorHora = tarifaPorHoras;
	}


	@Override
	public void trabajar() {
		System.out.println("El ingeniero ["+ getNombre() +"]" + 
				      "está diseñando un proyecto de ["+ getEspecialidad() +"].");
	}
	
	public double calcularCostoProyecto() {
		return (double) (horas * tarifaPorHora);
	}
}
