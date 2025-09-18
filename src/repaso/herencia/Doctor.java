package repaso.herencia;

import java.util.Random;

public class Doctor extends Profesion {
	private String medicamento;
	private boolean working;
	private Random random = new Random();
	
	public Doctor(String nombre, short anioNacimiento, String especialidad, boolean working) {
		super(nombre, anioNacimiento, especialidad);
		this.working = working;
		medicamento = medicamentosRandom();
	}
	
	private String medicamentosRandom() {
		String[] medicamentos = {"Paracetamol", "Ibuprofeno", "Amoxicilina", "Omeprazol", "Metformina"};
		return medicamentos[random.nextInt(medicamentos.length)];
	}

	@Override
	public void trabajar() {
		System.out.println("El Doctor [" + getNombre() +
	 "] está atendiendo pacientes en el área de [" + getEspecialidad() +"].");
		
	}

	public void recetarMedicamento() {
		if(working) {
			System.out.println("El/La doctor/a ["+ getNombre() + "] ha recetado el medicamento ["  
		     + medicamento +"].");
		}else {
			System.out.println("El/La doctor/a [" + getNombre() + "] " + "no se encuentra en consulta.");
		}
	}
}
