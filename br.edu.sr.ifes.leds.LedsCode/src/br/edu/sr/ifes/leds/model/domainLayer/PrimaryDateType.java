package br.edu.sr.ifes.leds.model.domainLayer;


/**
 * @author MarcosDias
 */
public class PrimaryDateType extends Classifier {
    private PrimaryDateTypeEnum type;

	public PrimaryDateTypeEnum getType() {
		return type;
	}

	public void setType(PrimaryDateTypeEnum type) {
		this.type = type;
	}

	public PrimaryDateType(PrimaryDateTypeEnum _type) {
		this.type = _type;
	}
}
