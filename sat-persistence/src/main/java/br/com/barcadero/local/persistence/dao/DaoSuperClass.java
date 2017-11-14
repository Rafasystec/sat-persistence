package br.com.barcadero.local.persistence.dao;

import org.hibernate.Session;

import br.com.barcadero.local.persistence.JPAPersistece;


//@Transactional
public abstract class DaoSuperClass<T>{

	private Session	session;
	
	public DaoSuperClass() {
		// TODO Auto-generated constructor stub
	}

	public T insert(T entidade) throws Exception {
		if(entidade != null){
			JPAPersistece.manager.persist(entidade);
		}
		return entidade;
	}

	public String delete(long codigo) throws Exception{
		try {
			if(codigo <= 0){
				throw new Exception("Codigo teve ter seu valor maior que 0 - Codigo recebido: " + codigo);
			}
			T entidade = this.find(codigo);
			if(entidade != null){
				JPAPersistece.manager.remove(entidade);
			}
			return "";
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	public String delete(T entidade) throws Exception{
		try {
			if(entidade == null){
				throw new Exception("Entidade veio nula.");
			}
			JPAPersistece.manager.remove(entidade);
			return "Registro Deletado.";
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}

	public T update(T entidade) throws Exception {
		return JPAPersistece.manager.merge(entidade);
	}
	
	public abstract T find(long codigo) throws Exception;

	public T find(long primaryKey, Class<T> entityClass) {
		return JPAPersistece.manager.find(entityClass, primaryKey);
	}

}
