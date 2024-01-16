package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
@Repository
@Transactional
public class TransferenciaRepositoryImpl implements ITranferenciaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public Transferencia seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Transferencia.class, id) ;
	}

	@Override
	public void insertar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.entityManager.persist(transferencia);

	}
	@Override
	public Transferencia seleccionarCuentas(CuentaBancaria origen, CuentaBancaria destino) {
		// TODO Auto-generated method stub
		Query  myQuery= this.entityManager.createQuery("SELECT t FROM Transferencia c WHERE c.cuentaOrigen = :variable AND c.cuentaDestino = :variable2");
		myQuery.setParameter("variable", origen);
		myQuery.setParameter("variable2", destino);
		return (Transferencia) myQuery.getSingleResult();
	}
}
