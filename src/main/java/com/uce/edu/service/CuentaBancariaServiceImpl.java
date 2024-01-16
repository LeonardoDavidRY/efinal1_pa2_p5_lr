package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ICuentaBancariaRepository;
import com.uce.edu.repository.modelo.CuentaBancaria;
@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {
	
	@Autowired
	private ICuentaBancariaRepository iCuentaBancariaRepository;

	@Override
	public CuentaBancaria buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iCuentaBancariaRepository.seleccionar(id);
	}

	@Override
	public void guardar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepository.insertar(cuenta);

	}

	@Override
	public void actualizar(CuentaBancaria cuenta) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepository.actualizar(cuenta);

	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.iCuentaBancariaRepository.eliminar(id);

	}

}
