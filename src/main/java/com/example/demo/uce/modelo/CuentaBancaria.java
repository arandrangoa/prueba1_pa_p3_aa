package com.example.demo.uce.modelo;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cuenta_bancaria")
public class CuentaBancaria {
	
	@Id
	@Column(name="ctab_numero")
	private String numero;
	
	@Column(name="ctab_tipo")
	private String tipoCuenta;
	
	@Column(name="ctab_saldo")
	private BigDecimal saldo;
	
	@Column(name="ctab_cedula_propietario")
	private String cedulaPropietario;
	
	//GET Y SET

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public String getCedulaPropietario() {
		return cedulaPropietario;
	}

	public void setCedulaPropietario(String cedulaPropietario) {
		this.cedulaPropietario = cedulaPropietario;
	}
	
	

}
