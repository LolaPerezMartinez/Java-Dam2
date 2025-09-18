package repaso.aparatos;

public class Dispositivo {
	private String modelo;
	private int horasDeUso;
	private boolean encendido;
	private int limiteHoraDeUso;

	@Override
	public String toString() {
		return "Dispositivo [modelo=" + modelo + ", horasDeUso=" + horasDeUso + ", encendido=" + encendido
				+ ", limiteHoraDeUso=" + limiteHoraDeUso + "]";
	}

//Constructores
	public Dispositivo() {
		this("GÉNERICO",1_500, 10_000);
	}

	public Dispositivo(String modelo, int horasDeUso, int limiteHoraDeUso) {
		this.horasDeUso = horasDeUso;
		this.modelo = modeloPermitido(modelo) ? modelo.toUpperCase() : "GENÉRICO";
		this.limiteHoraDeUso = limiteHoraDeUso < 1_000 ? 1_000 : limiteHoraDeUso > 10_000 ? 10_000 : limiteHoraDeUso;
	}

	public Dispositivo(Dispositivo copia) {
		this.modelo = copia.modelo;
		this.horasDeUso = copia.horasDeUso;
		this.encendido = copia.encendido;
		this.limiteHoraDeUso = copia.limiteHoraDeUso;
	}

	private boolean modeloPermitido(String modelo) {
		if (modelo == null || modelo.length() > 15)
			return false;
		for (int i = 0; i < modelo.length(); i++) {
			if (!(modelo.charAt(i) >= 'a' && modelo.charAt(i) <= 'z'
					|| modelo.charAt(i) >= 'A' && modelo.charAt(i) <= 'Z'
					|| modelo.charAt(i) >= '0' && modelo.charAt(i) <= '9')) {
				return false;
			}
		}
		return true;
	}

//Métodos
	public boolean encender() {
		if (encendido) {
			return false;
		} else {
			encendido = true;
			return true;
		}
	}
	
	public boolean apagar () {
		if(encendido) {
			encendido = false;
			return true;
		}else {
			return false;
		}
	}
	
	public boolean encenderApagar() {
		return encendido = !encendido;
	}
	
	public boolean registrarUso (int horasAñadidas) {
		if(encendido && (horasDeUso + horasAñadidas) <= limiteHoraDeUso) {
			horasDeUso += horasAñadidas;
			return true;
		}else {
			horasDeUso = limiteHoraDeUso;
			return false;
		}
	}
	
	
	public boolean requiereMantenimiento() {
		return horasDeUso >= (limiteHoraDeUso * 0.8) ? true : false;
//		if(horasDeUso >= limiteHoraDeUso * 0.8) {
//			return true;
//		}
//		return false;
	}
	
	
	public boolean reiniciarUSo() {
		if(!encendido && horasDeUso == limiteHoraDeUso) {
			horasDeUso = 0;
			return true;
		}else {
			return false;
			
		}
	}
}
