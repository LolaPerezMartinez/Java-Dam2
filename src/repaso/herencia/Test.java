package repaso.herencia;

public class Test {
	public static void main(String[] args) {
		Doctor d1 = new Doctor("Pedro", (short) 1972, "Oncología", true);
		Doctor d2 = new Doctor("Marta", (short) 1985, "Radiología", false);

		System.out.println(d1);
		System.out.printf("%nLa edad es:%d%n", d1.calcularEdad(d1));

		d1.recetarMedicamento();
		d2.recetarMedicamento();

		Profesion[] profesion = { d1, d2, new Doctor("Paula", (short) 1980, "Traumatología", false),
				new Ingeniero("Juan", (short) 1990, "Civil", 50 , 35), 
				new Ingeniero("Migle", (short) 1998, "Industrial", 70, 40),
				new Profesor("Jose", (short) 1993, "Matemáticas"), new Profesor("Carolina", (short) 1996, "Inglés") };

		System.out.printf("%nARRAY DE PROFESIONES%n");
		for (Profesion persona : profesion) {
			System.out.println(persona.toString());
		}

		System.out.printf("%nARRAY DE DOCTORES%n");
		for (Profesion persona : profesion) {
			if (persona instanceof Doctor) {
				System.out.println(persona.toString());
			}
		}
		
		System.out.printf("%nARRAY DE INGENIERO%n");
		for (Profesion persona : profesion) {
			if(persona instanceof Ingeniero) {
				System.out.println(persona.toString());
			}
		}
		
		System.out.printf("%nARRAY DE PROFESOR%n");
		for (Profesion persona : profesion) {
			if(persona instanceof Profesor) {
				System.out.println(persona.toString());
			}
		}
		
		System.out.printf("%nLOS DOCTORES RECETANDO%n");
		for (Profesion persona : profesion) {
			if (persona instanceof Doctor) {
			((Doctor) persona).recetarMedicamento();
			}
		}
		
		System.out.printf("%nLOS INGENIEROS CALCULANDO COSTOS%n");
		for (Profesion persona : profesion) {
			if(persona instanceof Ingeniero) {
				System.out.println(((Ingeniero) persona).calcularCostoProyecto());
			}
		}
	}
}
