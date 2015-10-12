package br.edu.sr.ifes.leds.model.domainLayer;



/**
 * @author MarcosDias
 */
public enum AccessModifier {
    PRIVATE("private"), PROTECTED("protected");
    
    private String valor;

    AccessModifier(String valor) {
		this.valor = valor;
	}

	public static AccessModifier fromString(String _valor) {
		if (_valor != null) {
			for (AccessModifier v : AccessModifier.values()) {
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
