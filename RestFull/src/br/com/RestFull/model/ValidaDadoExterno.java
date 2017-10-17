package br.com.RestFull.model;

import javax.xml.bind.annotation.XmlRootElement;


/**
 * Classe responsavel por conter o Objeto de validaçao externa
 * 
 * @author diges
 *
 */


@XmlRootElement
public final class ValidaDadoExterno {
	
	private AnswerBiometriaPF cnhBiometria;

	public ValidaDadoExterno() {
		super();
		this.cnhBiometria = new AnswerBiometriaPF();
	}
	
	
	public AnswerBiometriaPF getCnhBiometria() {
		return cnhBiometria;
	}

	public void setCnhBiometria(AnswerBiometriaPF cnhBiometria) {
		this.cnhBiometria = cnhBiometria;
	}

	@Override
	public String toString() {
		return "ValidaDadoExterno [cnhBiometria=" + cnhBiometria.toString() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnhBiometria == null) ? 0 : cnhBiometria.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ValidaDadoExterno other = (ValidaDadoExterno) obj;
		if (cnhBiometria == null) {
			if (other.cnhBiometria != null)
				return false;
		} else if (!cnhBiometria.equals(other.cnhBiometria))
			return false;
		return true;
	}
	

	
	
	
	
	

}
