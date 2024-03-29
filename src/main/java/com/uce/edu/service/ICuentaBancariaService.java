package com.uce.edu.service;

import com.uce.edu.repository.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	
	public CuentaBancaria buscar(Integer id);
	
	public  void guardar(CuentaBancaria cuenta);
	
	public void actualizar (CuentaBancaria cuenta);
	
	public void borrar(Integer id);

}
