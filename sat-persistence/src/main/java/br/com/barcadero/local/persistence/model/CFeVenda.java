package br.com.barcadero.local.persistence.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CFE_VENDA")
public class CFeVenda extends SuperCFeEntidade{
	
	private String cpfCnpjValue;
	private String timeStamp;
	private String valorTotalCFe;
		
	public String getCpfCnpjValue() {
		return cpfCnpjValue;
	}
	public void setCpfCnpjValue(String cpfCnpjValue) {
		this.cpfCnpjValue = cpfCnpjValue;
	}
	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public String getValorTotalCFe() {
		return valorTotalCFe;
	}
	public void setValorTotalCFe(String valorTotalCFe) {
		this.valorTotalCFe = valorTotalCFe;
	}
	
	
}
