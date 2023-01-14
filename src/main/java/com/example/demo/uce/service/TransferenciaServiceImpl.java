package com.example.demo.uce.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.CuentaBancaria;
import com.example.demo.uce.modelo.Transferencia;
import com.example.demo.uce.repository.ICuentaBancariaRepository;
import com.example.demo.uce.repository.ITransferenciaRepository;

@Service
public class TransferenciaServiceImpl implements ITransferenciaService {
	
	@Autowired
	private ITransferenciaRepository iTransferenciaRepository;
	
	
	@Override
	public void realizar(Transferencia transferencia,CuentaBancaria ctaOrigen, CuentaBancaria ctaDestino, BigDecimal monto) {
		// TODO Auto-generated method stub
		BigDecimal saldoOrigen=ctaOrigen.getSaldo();
		BigDecimal saldoDestino=ctaDestino.getSaldo();
		
		BigDecimal nuevoSaldoDestino=saldoDestino.add(monto);
		BigDecimal nuevoSaldoOrigen=saldoOrigen.subtract(monto);
		
		ctaOrigen.setSaldo(nuevoSaldoOrigen);
		ctaDestino.setSaldo(nuevoSaldoDestino);
		
		
		this.iTransferenciaRepository.insertar(transferencia);
		
	}


	@Override
	public void actualizar(Transferencia transferencia) {
		// TODO Auto-generated method stub
		this.iTransferenciaRepository.actualizar(transferencia);
		
	}

	@Override
	public Transferencia buscar(String id) {
		// TODO Auto-generated method stub
		return this.iTransferenciaRepository.buscar(id);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		this.iTransferenciaRepository.eliminar(id);
		
	}

	

}
