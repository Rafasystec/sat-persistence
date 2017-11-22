package br.com.barcadero.local.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CFE_CANCELAMENTO")
public class CFeCancelamento extends SuperCFeEntidade{
	public CFeCancelamento() {
	}
	private String CpfCnpjValue;
	private String TimeStamp;
	private String ValorTotalCFe;
	private String chaveASerCancelada;
	
	public String getCpfCnpjValue() {
		return CpfCnpjValue;
	}
	public void setCpfCnpjValue(String cpfCnpjValue) {
		CpfCnpjValue = cpfCnpjValue;
	}
	public String getTimeStamp() {
		return TimeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		TimeStamp = timeStamp;
	}
	public String getValorTotalCFe() {
		return ValorTotalCFe;
	}
	public void setValorTotalCFe(String valorTotalCFe) {
		ValorTotalCFe = valorTotalCFe;
	}
	public String getChaveASerCancelada() {
		return chaveASerCancelada;
	}
	public void setChaveASerCancelada(String chaveASerCancelada) {
		this.chaveASerCancelada = chaveASerCancelada;
	}
	
	
	
}
