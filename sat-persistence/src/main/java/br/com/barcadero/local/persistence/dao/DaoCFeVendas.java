package br.com.barcadero.local.persistence.dao;

import br.com.barcadero.local.persistence.model.CFeVenda;

public class DaoCFeVendas extends DaoSuperClass<CFeVenda>{

	@Override
	public CFeVenda find(long codigo) throws Exception {
		return find(codigo, CFeVenda.class);	
	}

}
