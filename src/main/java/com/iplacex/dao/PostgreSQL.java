/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.dao;

/**
 *
 * @author Us
 */
public class PostgreSQL implements Conexion {

    @Override
	public void conectar() {
		System.out.println("Conexión a POSTGRESQL");
	}
    
}
