package com.example.demo.uce.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.uce.modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TransferenciaRepositoryImpl implements ITransferenciaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Transferencia transferncia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(transferncia);
		
	}

	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.merge(transferencia);
		
	}

	@Override
	public Transferencia buscar(String id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Transferencia.class, id);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		Transferencia transferencia=this.buscar(id);
		this.entityManager.remove(transferencia);
		
		
	}

}
