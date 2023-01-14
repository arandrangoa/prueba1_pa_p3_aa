package com.example.demo.uce.service;

import com.example.demo.uce.modelo.CuentaBancaria;

public interface ICuentaBancariaService {
	
	public void crear(CuentaBancaria cuentaBancaria);
	public void actualizar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria buscar(String id);
	public void eliminar(String id);
	

}
