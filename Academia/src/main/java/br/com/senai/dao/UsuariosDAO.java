package br.com.senai.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.senai.model.UsuariosModel;

@Repository
@Transactional
public class UsuariosDAO {
	@PersistenceContext
	private EntityManager manager;
	public void save (UsuariosModel usuario) {
		manager.persist(usuario);
	}
}
