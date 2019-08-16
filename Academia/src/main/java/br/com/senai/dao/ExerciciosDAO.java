package br.com.senai.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.senai.model.ExerciciosModel;

@Repository
@Transactional
public class ExerciciosDAO {
	@PersistenceContext
	private EntityManager manager;
	public void save (ExerciciosModel exercicios) {
		manager.persist(exercicios);
	}
}
