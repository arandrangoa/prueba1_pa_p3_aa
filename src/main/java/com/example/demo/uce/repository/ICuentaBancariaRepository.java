package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.CuentaBancaria;

public interface ICuentaBancariaRepository {
	
	public void insertar(CuentaBancaria cuentaBancaria);
	public void actualizar(CuentaBancaria cuentaBancaria);
	
	public CuentaBancaria buscar(String id);
	public void eliminar(String id);
	
	

}
