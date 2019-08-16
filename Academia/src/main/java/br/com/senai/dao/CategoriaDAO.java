package br.com.senai.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.senai.model.CategoriaModel;

@Repository
@Transactional
public class CategoriaDAO {
	@PersistenceContext
	private EntityManager manager;
	public void save (CategoriaModel categoria) {
		manager.persist(categoria);
	}
}
