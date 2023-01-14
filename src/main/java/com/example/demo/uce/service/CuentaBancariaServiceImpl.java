package com.example.demo.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.uce.modelo.CuentaBancaria;
import com.example.demo.uce.repository.ICuentaBancariaRepository;

@Service
public class CuentaBancariaServiceImpl implements ICuentaBancariaService {
	
	@Autowired
	private ICuentaBancariaRepository bancariaRepository;

	@Override
	public void crear(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepository.insertar(cuentaBancaria);
		
	}

	@Override
	public void actualizar(CuentaBancaria cuentaBancaria) {
		// TODO Auto-generated method stub
		this.bancariaRepository.actualizar(cuentaBancaria);
		
	}

	@Override
	public CuentaBancaria buscar(String id) {
		// TODO Auto-generated method stub
		return this.bancariaRepository.buscar(id);
	}

	@Override
	public void eliminar(String id) {
		// TODO Auto-generated method stub
		this.bancariaRepository.eliminar(id);
		
	}

}
