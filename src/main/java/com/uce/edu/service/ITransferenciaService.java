package com.uce.edu.service;

import java.math.BigDecimal;

import com.uce.edu.repository.modelo.Transferencia;

public interface ITransferenciaService {
	
	public Transferencia realizarTranferencia(Integer numeroCuentaOrigen, Integer numeroCuentaDestino, BigDecimal monto);

}
