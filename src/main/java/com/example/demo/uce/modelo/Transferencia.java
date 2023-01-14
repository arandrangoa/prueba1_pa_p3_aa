package com.example.demo.uce.modelo;

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
@Table(name="Transferencia")
public class Transferencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "trasn_seq")
	@SequenceGenerator(name="trasn_seq", sequenceName = "trasn_seq", allocationSize = 1)
	@Column(name="trans_id")
	private Integer id;
	
	@Column(name="trans_fecha_transferencia")
	private LocalDateTime fechaTransferencia;
	
	@Column(name="trans_num_ctaorigen")
	private String numCuentaOrigen;
	
	@Column(name="trans_ctadestino")
	private String numCuentaDestino;
	
	@Column(name="trans_monto")
	private BigDecimal monto;
	
	@Column(name="trans_comision")
	private BigDecimal comision;
	
	//GET Y SET

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

	public String getNumCuentaOrigen() {
		return numCuentaOrigen;
	}

	public void setNumCuentaOrigen(String numCuentaOrigen) {
		this.numCuentaOrigen = numCuentaOrigen;
	}

	public String getNumCuentaDestino() {
		return numCuentaDestino;
	}

	public void setNumCuentaDestino(String numCuentaDestino) {
		this.numCuentaDestino = numCuentaDestino;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public BigDecimal getComision() {
		return comision;
	}

	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}
	
	

}
