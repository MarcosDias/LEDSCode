package br.edu.sr.ifes.leds.model.domainLayer;


/**
 * @author MarcosDias
 */
public enum CollectionType {
    SET("Set"),LIST("List");
    
    private String valor;

    CollectionType(String valor) {
		this.valor = valor;
	}

	public static CollectionType fromString(String _valor) {
		if (_valor != null) {
			for (CollectionType v : CollectionType.values()) {
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
