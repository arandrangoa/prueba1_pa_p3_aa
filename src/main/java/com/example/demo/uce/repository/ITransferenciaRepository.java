package com.example.demo.uce.repository;

import com.example.demo.uce.modelo.Transferencia;

public interface ITransferenciaRepository {
	
	public void insertar(Transferencia transferncia);
	public void actualizar(Transferencia transferencia);
	
	public Transferencia buscar(String id);
	public void eliminar(String id);

}
