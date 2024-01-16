package com.uce.edu.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.ICuentaBancariaRepository;
import com.uce.edu.repository.ITranferenciaRepository;
import com.uce.edu.repository.modelo.CuentaBancaria;
import com.uce.edu.repository.modelo.Transferencia;
@Service
public class TransferenciaServiceImpl implements ITransferenciaService {
	
	@Autowired
	private ITranferenciaRepository iTransferenciaRepository;
	
	@Autowired
	private ICuentaBancariaRepository iCuentaBancariaRepository;

	@Override
	public Transferencia realizarTranferencia(Integer numeroCuentaOrigen, Integer numeroCuentaDestino,
			BigDecimal monto) {
		// TODO Auto-generated method stub
		Transferencia transferenciaAux = new Transferencia();
		CuentaBancaria c1 = this.iCuentaBancariaRepository.seleccionarPorNumero(numeroCuentaOrigen);
		transferenciaAux.setCuentaOrigen(c1);
		CuentaBancaria c2 = this.iCuentaBancariaRepository.seleccionarPorNumero(numeroCuentaDestino);
		transferenciaAux.setCuentaDestino(c2);
		transferenciaAux.setMontoTranferencia(monto);
		
		return transferenciaAux;
	}

}
