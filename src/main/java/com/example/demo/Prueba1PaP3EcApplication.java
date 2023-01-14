package com.example.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.uce.modelo.CuentaBancaria;
import com.example.demo.uce.modelo.Transferencia;
import com.example.demo.uce.service.ICuentaBancariaService;
import com.example.demo.uce.service.ITransferenciaService;

@SpringBootApplication
public class Prueba1PaP3EcApplication implements CommandLineRunner{
	
	@Autowired
	private ICuentaBancariaService bancariaService;
	
	@Autowired
	private ITransferenciaService iTransferenciaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Prueba1PaP3EcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		/*CuentaBancaria cuenta1= new CuentaBancaria();
		cuenta1.setCedulaPropietario("1727193847");
		cuenta1.setNumero("20202020");
		cuenta1.setSaldo(new BigDecimal(100));
		cuenta1.setTipoCuenta("Cuenta Ahorros");*/
		//this.bancariaService.crear(cuenta1);
		this.bancariaService.eliminar("20202020");
		
		/*CuentaBancaria cuenta2= new CuentaBancaria();
		cuenta2.setCedulaPropietario("1714458237");
		cuenta2.setNumero("10101010");
		cuenta2.setSaldo(new BigDecimal(200));
		cuenta2.setTipoCuenta("Cuenta Ahorros");
		//this.bancariaService.crear(cuenta2);*/
		this.bancariaService.eliminar("10101010");
		
		/*Transferencia trans=new Transferencia();
		trans.setFechaTransferencia(LocalDateTime.now());
		trans.setComision(new BigDecimal(5));
		trans.setMonto(new BigDecimal(5));
		trans.setNumCuentaDestino(cuenta2.getNumero());
		trans.setNumCuentaOrigen(cuenta1.getNumero());
		
		this.iTransferenciaService.realizar(trans, cuenta1, cuenta2, new BigDecimal(100));*/
		
		
		
		
	}

}
