package repaso;

public class TelefonoMovil {
 private byte bateria;
 private boolean on = false;
 private String modelo;
 private String marca;
 private boolean bajoConsumo;
 
 

public TelefonoMovil(String modelo, String marca) {
	this.bateria = 20;
	this.modelo = modelo;
	this.marca = marca;
}


@Override
public String toString() {
	return "TelefonoMovil [bateria=" + bateria + ", on=" + on + ", modelo=" + modelo + ", marca=" + marca + "]";
}


public boolean encender () {
//	if(on) {
//		return false;
//	}else {
//		on = true;
//		return true;
//	}
 
 
	 return on = !on;
 
}

public boolean encender2 () {
//	if(!on) {
//		return true;
//	}else {
//		on = true;
//		return true;
//	}
 
 
	 return on = !on;
 
}

 
 


//obj1
//obj2
//obj3

public void cambiarEstado () {
	on = !on;
}

public boolean estaEncendido() {
	return on;
}

public boolean hacerLlamada () {
	return consumir((byte) 2);
	
}

public boolean navegarInternet () {
	return consumir((byte) 1);
	
}

private boolean consumir (byte consumo) {
	if(!on || bateria < consumo) return false;
	bateria -= consumo;
	
	if(bateria < 10) bajoConsumo = true;
	revisarSiBateriaBaja();
	
	return true;
}

// Para consultar método bajo consumo
 public boolean isBajoConsumo() {
	return bajoConsumo;
}

 public void recargaBateria() {
	 bateria = (byte)(bateria + 25 <= 100 ? bateria + 25 : 100);
 }
 
// Apagado por bateria baja
 private void revisarSiBateriaBaja () {
	 if(bateria <= 2) on = false;
 }

public static void main(String[] args) {
	TelefonoMovil tel1 = new TelefonoMovil("M5", "XIAOMI");
	System.out.println(tel1);
	
	System.out.printf("%nEncender %b%n", tel1.encender() ? "encendido" : "apagado");	;
	System.out.println(tel1);
	
	System.out.printf("%nCambiar estado%n");
	tel1.cambiarEstado();
	System.out.println(tel1);
	
	}
}