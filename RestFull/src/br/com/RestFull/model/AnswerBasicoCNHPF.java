package br.com.RestFull.model;

public class AnswerBasicoCNHPF {
	private String numero_registro;
	private String categoria;
	private String data_primeira_habilitacao;
	private String data_validade;
	
	
	
	public AnswerBasicoCNHPF() {
		this.numero_registro = "numero_registro";
		this.categoria = "categoria";
		this.data_primeira_habilitacao = "data_primeira_habilitacao";
		this.data_validade = "data_validade";
	}
	public String getNumero_registro() {
		return numero_registro;
	}
	public void setNumero_registro(String numero_registro) {
		this.numero_registro = numero_registro;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getData_primeira_habilitacao() {
		return data_primeira_habilitacao;
	}
	public void setData_primeira_habilitacao(String data_primeira_habilitacao) {
		this.data_primeira_habilitacao = data_primeira_habilitacao;
	}
	public String getData_validade() {
		return data_validade;
	}
	public void setData_validade(String data_validade) {
		this.data_validade = data_validade;
	}
	@Override
	public String toString() {
		return "AnswerBasicoCNHPF [numero_registro=" + numero_registro + ", categoria=" + categoria
				+ ", data_primeira_habilitacao=" + data_primeira_habilitacao + ", data_validade=" + data_validade + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((data_primeira_habilitacao == null) ? 0 : data_primeira_habilitacao.hashCode());
		result = prime * result + ((data_validade == null) ? 0 : data_validade.hashCode());
		result = prime * result + ((numero_registro == null) ? 0 : numero_registro.hashCode());
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
		AnswerBasicoCNHPF other = (AnswerBasicoCNHPF) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (data_primeira_habilitacao == null) {
			if (other.data_primeira_habilitacao != null)
				return false;
		} else if (!data_primeira_habilitacao.equals(other.data_primeira_habilitacao))
			return false;
		if (data_validade == null) {
			if (other.data_validade != null)
				return false;
		} else if (!data_validade.equals(other.data_validade))
			return false;
		if (numero_registro == null) {
			if (other.numero_registro != null)
				return false;
		} else if (!numero_registro.equals(other.numero_registro))
			return false;
		return true;
	}
	

	
}
