package repaso.aparatos;

public class TestDispositivo {
public static void main(String[] args) {
	Dispositivo d1 = new Dispositivo("casio", 1_500, 2_000);
	Dispositivo d2 = new Dispositivo("miko4", 2_000, 3_000);
	Dispositivo d3 = new Dispositivo("123456789123456799", 1_500, 2_000);
	Dispositivo d4 = new Dispositivo("&&!", 1_500, 2_000);
	
	System.out.println(d1.toString());	
	System.out.println(d2.toString());	
	System.out.println(d3.toString());	
	System.out.println(d4.toString());
	
	System.out.println();
	
	System.out.println("\nENCENDER");
	System.out.println(d1.encender());
	System.out.println(d1.encender());
	System.out.println(d1.encender());
	
	System.out.println("\nAPAGAR");
	System.out.println(d1.apagar());
	System.out.println(d1.apagar());
	
	System.out.println("\nCAMBIAR ESTADO");
	System.out.println(d1.encenderApagar());
	System.out.println(d1.encenderApagar());
	
	System.out.printf("%nREGISTRO HORAS%n");
	System.out.println(d1.encender());
	System.out.println(d1.registrarUso(100));
	System.out.println(d1);
	
	System.out.printf("%nRequiere mantenimiento: %s%n", d1.requiereMantenimiento() ? "Sí": "No");
	System.out.println();
	
	System.out.println(d1.registrarUso(400));
	System.out.println(d1);
	
	System.out.printf("%nReiniciar uso: %s%n", d1.reiniciarUSo());
	System.out.println(d1.apagar());
	System.out.println(d1);
	
	System.out.printf("%nReiniciar uso: %s%n", d1.reiniciarUSo());
	System.out.println(d1);
	
}
}
