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
public class CuentaBancariaRepositoryImpl implements ICuentaBancariaRepository {

	@PersistenceContext
	private EntityManager entityManager;
	@Override
	public CuentaBancaria seleccionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CuentaBancaria.class, id);
	}

	@Override
	public void insertar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(cuenta);

	}

	@Override
	public void actualizar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(cuenta);
		
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		CuentaBancaria cuentaB = this.seleccionar(id);
		this.entityManager.remove(cuentaB);
		
	}

	@Override
	public CuentaBancaria seleccionarPorNumero(Integer numeroCuenta) {
		// TODO Auto-generated method stub
		Query  myQuery= this.entityManager.createQuery("SELECT c FROM CuentaBancaria c WHERE c.numero= :variable ");
		myQuery.setParameter("variable", numeroCuenta);
		return (CuentaBancaria) myQuery.getSingleResult();
		
	}

}
