package com.uce.edu.repository.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
@Entity
@Table(name="transferencia")
public class Transferencia {
	@Id
	@GeneratedValue(generator = "seq_tranferencia", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "seq_tranferencia", sequenceName = "seq_tranferencia", allocationSize = 1)
	@Column(name="tran_id")
	private Integer id;
	@Column(name="tran_fecha_tranferencia")
	private LocalDateTime fechaTransferencia;
	@Column(name="tran_cuenta_origen")
	private CuentaBancaria cuentaOrigen;
	@Column(name="tran_cuenta_destino")
	private CuentaBancaria cuentaDestino;
	@Column(name="tran_monto_tranferencia")
	private BigDecimal montoTranferencia;
	@Column(name="tran_comision_transferencia")
	private BigDecimal comisionTranferencia;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getFechaTransferencia() {
		return fechaTransferencia;
	}
	public void setFechaTransferencia(LocalDateTime fechaTransferencia) {
		this.fechaTransferencia = fechaTransferencia;
	}
	public CuentaBancaria getCuentaOrigen() {
		return cuentaOrigen;
	}
	public void setCuentaOrigen(CuentaBancaria cuentaOrigen) {
		this.cuentaOrigen = cuentaOrigen;
	}
	public CuentaBancaria getCuentaDestino() {
		return cuentaDestino;
	}
	public void setCuentaDestino(CuentaBancaria cuentaDestino) {
		this.cuentaDestino = cuentaDestino;
	}
	public BigDecimal getMontoTranferencia() {
		return montoTranferencia;
	}
	public void setMontoTranferencia(BigDecimal montoTranferencia) {
		this.montoTranferencia = montoTranferencia;
	}
	public BigDecimal getComisionTranferencia() {
		return comisionTranferencia;
	}
	public void setComisionTranferencia(BigDecimal comisionTranferencia) {
		this.comisionTranferencia = comisionTranferencia;
	}
	
	

}
