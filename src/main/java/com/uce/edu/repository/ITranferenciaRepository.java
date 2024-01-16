package com.uce.edu.repository;

import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Transferencia;

public interface ITranferenciaRepository {
	
	public Transferencia seleccionar(Integer id);
	
	public void insertar(Transferencia transferencia);
	
	public Transferencia seleccionarCuentas(CuentaBancaria origen, CuentaBancaria destino);

}
