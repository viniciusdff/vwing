package br.com.RestFull.model;

public class AnswerBasicoFiliacapPF {
	private String nome_mae;
	private String nome_pai;
	
	
	
	public AnswerBasicoFiliacapPF() {
		super();
		this.nome_mae = "nome_mae";
		this.nome_pai = "nome_pai";
	}
	public String getNome_mae() {
		return nome_mae;
	}
	public void setNome_mae(String nome_mae) {
		this.nome_mae = nome_mae;
	}
	public String getNome_pai() {
		return nome_pai;
	}
	public void setNome_pai(String nome_pai) {
		this.nome_pai = nome_pai;
	}
	@Override
	public String toString() {
		return "AnswerBasicoFiliacapPF [nome_mae=" + nome_mae + ", nome_pai=" + nome_pai + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome_mae == null) ? 0 : nome_mae.hashCode());
		result = prime * result + ((nome_pai == null) ? 0 : nome_pai.hashCode());
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
		AnswerBasicoFiliacapPF other = (AnswerBasicoFiliacapPF) obj;
		if (nome_mae == null) {
			if (other.nome_mae != null)
				return false;
		} else if (!nome_mae.equals(other.nome_mae))
			return false;
		if (nome_pai == null) {
			if (other.nome_pai != null)
				return false;
		} else if (!nome_pai.equals(other.nome_pai))
			return false;
		return true;
	}
	
	

}
