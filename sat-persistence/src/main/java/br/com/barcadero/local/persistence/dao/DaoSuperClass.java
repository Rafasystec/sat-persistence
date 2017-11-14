package br.com.barcadero.local.persistence.dao;

import br.com.barcadero.local.persistence.JPAPersistece;


public abstract class DaoSuperClass<T>{
	
	public DaoSuperClass() {
		// TODO Auto-generated constructor stub
	}

	public T insert(T entidade) throws Exception {
		JPAPersistece.manager.getTransaction().begin();
		if(entidade != null){
			JPAPersistece.manager.persist(entidade);
			JPAPersistece.manager.getTransaction().commit();
		}
		return entidade;
	}

	public String delete(long codigo) throws Exception{
		try {
			JPAPersistece.manager.getTransaction().begin();
			if(codigo <= 0){
				throw new Exception("Codigo teve ter seu valor maior que 0 - Codigo recebido: " + codigo);
			}
			T entidade = this.find(codigo);
			if(entidade != null){
				JPAPersistece.manager.remove(entidade);
			}
			JPAPersistece.manager.getTransaction().commit();
			return "";
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e.getMessage());
		}
	}
	
	public String delete(T entidade) throws Exception{
		try {
			JPAPersistece.manager.getTransaction().begin();
			if(entidade == null){
				throw new Exception("Entidade veio nula.");
			}
			JPAPersistece.manager.remove(entidade);
			JPAPersistece.manager.getTransaction().commit();
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
