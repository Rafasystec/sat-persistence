package br.com.barcadero.local.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CFE_CANCELAMENTO")
public class CFeCancelamento extends SuperCFeEntidade{
	public CFeCancelamento() {
		// TODO Auto-generated constructor stub
	}
	private String CpfCnpjValue;
	private String TimeStamp;
	private String ValorTotalCFe;
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
	
	
	
}
