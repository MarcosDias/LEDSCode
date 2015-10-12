package br.edu.sr.ifes.leds.model.infrastructureLayer;


/**
 * @author MarcosDias
 */
public enum Environment {
	DEV("dev"), PROD("prod");

	private String valor;

	Environment(String valor) {
		this.valor = valor;
	}

	public static Environment fromString(String _valor) {
		if (_valor != null) {
			for (Environment v : Environment.values()) {
				if (_valor.equals(v.valor)) {
					return v;
				}
			}
		}
		return null;
	}

	public String getValor() {
		return valor;
	}
}
