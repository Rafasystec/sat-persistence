package br.com.barcadero.local.persistence.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="STATUS_VALIDADOR")
public class VFPeVerificarStatusValidadorResp {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private long id;
	private String identificador;
	private String codigoAutorizacao;
	private String bin;
	private String donoCartao;
	private String dataExpiracao;
	private String instituicaoFinanceira;
	private String parcelas;
	private String ultimos4digitos;
	private String codigoPagamento;
	private String valor;
	private String idFila;
	private String tipo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getIdentificador() {
		return identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public String getCodigoAutorizacao() {
		return codigoAutorizacao;
	}
	public void setCodigoAutorizacao(String codigoAutorizacao) {
		this.codigoAutorizacao = codigoAutorizacao;
	}
	public String getBin() {
		return bin;
	}
	public void setBin(String bin) {
		this.bin = bin;
	}
	public String getDonoCartao() {
		return donoCartao;
	}
	public void setDonoCartao(String donoCartao) {
		this.donoCartao = donoCartao;
	}
	public String getDataExpiracao() {
		return dataExpiracao;
	}
	public void setDataExpiracao(String dataExpiracao) {
		this.dataExpiracao = dataExpiracao;
	}
	public String getInstituicaoFinanceira() {
		return instituicaoFinanceira;
	}
	public void setInstituicaoFinanceira(String instituicaoFinanceira) {
		this.instituicaoFinanceira = instituicaoFinanceira;
	}
	public String getParcelas() {
		return parcelas;
	}
	public void setParcelas(String parcelas) {
		this.parcelas = parcelas;
	}
	public String getUltimos4digitos() {
		return ultimos4digitos;
	}
	public void setUltimos4digitos(String ultimos4digitos) {
		this.ultimos4digitos = ultimos4digitos;
	}
	public String getCodigoPagamento() {
		return codigoPagamento;
	}
	public void setCodigoPagamento(String codigoPagamento) {
		this.codigoPagamento = codigoPagamento;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getIdFila() {
		return idFila;
	}
	public void setIdFila(String idFila) {
		this.idFila = idFila;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
