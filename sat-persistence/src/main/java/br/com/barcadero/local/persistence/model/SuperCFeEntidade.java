package br.com.barcadero.local.persistence.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@MappedSuperclass
public class SuperCFeEntidade {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id",nullable=false)
	private long id;
	@Column(length=1409850)
	private String arquivoBase64;
	@Column(length=1409850)
	private String assinaturaQrcode;
	private String chaveConsulta;
	private String codCCCC;
	private String codErroSAT;
	private String codSEFAZ;
	private String mensagemSAT;
	private String numeroSessao;
	private String mensagemSEFAZ;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dtCadastro = new Date();
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getArquivoBase64() {
		return arquivoBase64;
	}
	public void setArquivoBase64(String arquivoBase64) {
		this.arquivoBase64 = arquivoBase64;
	}
	public String getAssinaturaQrcode() {
		return assinaturaQrcode;
	}
	public void setAssinaturaQrcode(String assinaturaQrcode) {
		this.assinaturaQrcode = assinaturaQrcode;
	}
	public String getChaveConsulta() {
		return chaveConsulta;
	}
	public void setChaveConsulta(String chaveConsulta) {
		this.chaveConsulta = chaveConsulta;
	}
	public String getCodCCCC() {
		return codCCCC;
	}
	public void setCodCCCC(String codCCCC) {
		this.codCCCC = codCCCC;
	}
	public String getCodErroSAT() {
		return codErroSAT;
	}
	public void setCodErroSAT(String codErroSAT) {
		this.codErroSAT = codErroSAT;
	}
	public String getCodSEFAZ() {
		return codSEFAZ;
	}
	public void setCodSEFAZ(String codSEFAZ) {
		this.codSEFAZ = codSEFAZ;
	}
	public String getMensagemSAT() {
		return mensagemSAT;
	}
	public void setMensagemSAT(String mensagemSAT) {
		this.mensagemSAT = mensagemSAT;
	}
	public String getNumeroSessao() {
		return numeroSessao;
	}
	public void setNumeroSessao(String numeroSessao) {
		this.numeroSessao = numeroSessao;
	}
	public String getMensagemSEFAZ() {
		return mensagemSEFAZ;
	}
	public void setMensagemSEFAZ(String mensagemSEFAZ) {
		this.mensagemSEFAZ = mensagemSEFAZ;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
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
		SuperCFeEntidade other = (SuperCFeEntidade) obj;
		if (id != other.id)
			return false;
		return true;
	}
	public Date getDtCadastro() {
		return dtCadastro;
	}
	public void setDtCadastro(Date dtCadastro) {
		this.dtCadastro = dtCadastro;
	}
	
	
	
}
