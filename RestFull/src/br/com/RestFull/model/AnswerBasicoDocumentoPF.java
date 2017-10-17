package br.com.RestFull.model;

public class AnswerBasicoDocumentoPF {
	private Integer tipo;
	private String numero;
	private String orgao_expedidor;
	private String uf_expedidor;
	
	
	
	public AnswerBasicoDocumentoPF() {
		this.tipo = 1;
		this.numero = "numero";
		this.orgao_expedidor = "orgao_expedidor";
		this.uf_expedidor = "uf_expedidor";
	}
	public Integer getTipo() {
		return tipo;
	}
	public void setTipo(Integer tipo) {
		this.tipo = tipo;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getOrgao_expedidor() {
		return orgao_expedidor;
	}
	public void setOrgao_expedidor(String orgao_expedidor) {
		this.orgao_expedidor = orgao_expedidor;
	}
	public String getUf_expedidor() {
		return uf_expedidor;
	}
	public void setUf_expedidor(String uf_expedidor) {
		this.uf_expedidor = uf_expedidor;
	}
	@Override
	public String toString() {
		return "AnswerBasicoDocumentoPF [tipo=" + tipo + ", numero=" + numero + ", orgao_expedidor=" + orgao_expedidor
				+ ", uf_expedidor=" + uf_expedidor + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((orgao_expedidor == null) ? 0 : orgao_expedidor.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
		result = prime * result + ((uf_expedidor == null) ? 0 : uf_expedidor.hashCode());
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
		AnswerBasicoDocumentoPF other = (AnswerBasicoDocumentoPF) obj;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (orgao_expedidor == null) {
			if (other.orgao_expedidor != null)
				return false;
		} else if (!orgao_expedidor.equals(other.orgao_expedidor))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		if (uf_expedidor == null) {
			if (other.uf_expedidor != null)
				return false;
		} else if (!uf_expedidor.equals(other.uf_expedidor))
			return false;
		return true;
	}
	

	
}
