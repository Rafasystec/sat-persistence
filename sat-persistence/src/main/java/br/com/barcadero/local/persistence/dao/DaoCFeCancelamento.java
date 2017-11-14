package br.com.barcadero.local.persistence.dao;

import br.com.barcadero.local.persistence.model.CFeCancelamento;

public class DaoCFeCancelamento extends DaoSuperClass<CFeCancelamento>{

	@Override
	public CFeCancelamento find(long codigo) throws Exception {
		return find(codigo, CFeCancelamento.class);
	}

}
