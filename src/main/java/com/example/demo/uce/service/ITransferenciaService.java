package com.example.demo.uce.service;

import java.math.BigDecimal;

import com.example.demo.uce.modelo.CuentaBancaria;
import com.example.demo.uce.modelo.Transferencia;

public interface ITransferenciaService {
	
	public void realizar(Transferencia transferencia,CuentaBancaria ctaOrigen,CuentaBancaria ctaDestino, BigDecimal monto);
	public void actualizar(Transferencia transferencia);
	
	public Transferencia buscar(String id);
	public void eliminar(String id);
	

}
