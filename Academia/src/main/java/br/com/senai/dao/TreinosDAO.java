package br.com.senai.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.senai.model.TreinosModel;

@Repository
@Transactional
public class TreinosDAO {
	@PersistenceContext
	private EntityManager manager;
	public void save (TreinosModel treino) {
		manager.persist(treino);
	}
}
