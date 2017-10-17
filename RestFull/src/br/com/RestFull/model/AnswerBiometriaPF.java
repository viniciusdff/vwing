package br.com.RestFull.model;

public class AnswerBiometriaPF {
	private String name;
	private String sexo;
	private String data_nascimento;
	private AnswerBasicoFiliacapPF filiacao;
	private Integer nacionalidade;
	private AnswerBasicoDocumentoPF documento;
	private AnswerBasicoCNHPF cnh;
	private String biometria_face;
	
	
	
	public AnswerBiometriaPF() {
		this.name = "name";
		this.sexo = "sexo";
		this.data_nascimento = "data_nascimento";
		this.filiacao = new AnswerBasicoFiliacapPF();
		this.nacionalidade = 1;
		this.documento = new AnswerBasicoDocumentoPF();
		this.cnh = new AnswerBasicoCNHPF();
		this.biometria_face = biometria_face;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getData_nascimento() {
		return data_nascimento;
	}
	public void setData_nascimento(String data_nascimento) {
		this.data_nascimento = data_nascimento;
	}
	public AnswerBasicoFiliacapPF getFiliacao() {
		return filiacao;
	}
	public void setFiliacao(AnswerBasicoFiliacapPF filiacao) {
		this.filiacao = filiacao;
	}
	public Integer getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(Integer nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public AnswerBasicoDocumentoPF getDocumento() {
		return documento;
	}
	public void setDocumento(AnswerBasicoDocumentoPF documento) {
		this.documento = documento;
	}
	public AnswerBasicoCNHPF getCnh() {
		return cnh;
	}
	public void setCnh(AnswerBasicoCNHPF cnh) {
		this.cnh = cnh;
	}
	public String getBiometria_face() {
		return biometria_face;
	}
	public void setBiometria_face(String biometria_face) {
		this.biometria_face = biometria_face;
	}
	@Override
	public String toString() {
		return "AnswerBiometriaPF [name=" + name + ", sexo=" + sexo + ", data_nascimento=" + data_nascimento
				+ ", filiacao=" + filiacao.toString() + ", nacionalidade=" + nacionalidade + ", documento=" + documento.toString() + ", cnh="
				+ cnh.toString() + ", biometria_face=" + biometria_face + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((biometria_face == null) ? 0 : biometria_face.hashCode());
		result = prime * result + ((cnh == null) ? 0 : cnh.hashCode());
		result = prime * result + ((data_nascimento == null) ? 0 : data_nascimento.hashCode());
		result = prime * result + ((documento == null) ? 0 : documento.hashCode());
		result = prime * result + ((filiacao == null) ? 0 : filiacao.hashCode());
		result = prime * result + ((nacionalidade == null) ? 0 : nacionalidade.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((sexo == null) ? 0 : sexo.hashCode());
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
		AnswerBiometriaPF other = (AnswerBiometriaPF) obj;
		if (biometria_face == null) {
			if (other.biometria_face != null)
				return false;
		} else if (!biometria_face.equals(other.biometria_face))
			return false;
		if (cnh == null) {
			if (other.cnh != null)
				return false;
		} else if (!cnh.equals(other.cnh))
			return false;
		if (data_nascimento == null) {
			if (other.data_nascimento != null)
				return false;
		} else if (!data_nascimento.equals(other.data_nascimento))
			return false;
		if (documento == null) {
			if (other.documento != null)
				return false;
		} else if (!documento.equals(other.documento))
			return false;
		if (filiacao == null) {
			if (other.filiacao != null)
				return false;
		} else if (!filiacao.equals(other.filiacao))
			return false;
		if (nacionalidade == null) {
			if (other.nacionalidade != null)
				return false;
		} else if (!nacionalidade.equals(other.nacionalidade))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (sexo == null) {
			if (other.sexo != null)
				return false;
		} else if (!sexo.equals(other.sexo))
			return false;
		return true;
	}
	
	
	
	
}
