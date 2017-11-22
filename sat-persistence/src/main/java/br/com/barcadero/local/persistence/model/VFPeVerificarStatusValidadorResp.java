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
	
}
