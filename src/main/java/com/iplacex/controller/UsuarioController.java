/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.controller;

import com.iplacex.dao.UsuarioDAOImpl;
import com.iplacex.model.Afiliado;
import com.iplacex.service.UsuarioService;
import com.iplacex.service.UsuarioServiceImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import com.iplacex.strategy.Usuario;



@Named
@ViewScoped
public class UsuarioController implements Serializable {

	private List<Usuario> listadoUsuarios;
	private UsuarioService service;	
	private String motor;
        private List<Afiliado> lista;

	public UsuarioController() {
		motor = "MYSQL";
		listadoUsuarios = new ArrayList<>();
		service = new UsuarioServiceImpl(new UsuarioDAOImpl(motor));
		conectar();
                listar();
	
       
		motor = "ORACLE";
		listadoUsuarios = new ArrayList<>();
		service = new UsuarioServiceImpl(new UsuarioDAOImpl(motor));
                conectar();
		listar();

		motor = "POSTGRESQL";
		listadoUsuarios = new ArrayList<>();
		service = new UsuarioServiceImpl(new UsuarioDAOImpl(motor));
                conectar();
		listar();
                
                motor = "SQLSERVER";
		listadoUsuarios = new ArrayList<>();
		service = new UsuarioServiceImpl(new UsuarioDAOImpl(motor));
                conectar();
		listar();
	}

	public static void listar() {
		//lista = service.listar();
	}
	
	public void seleccionar(String motor) {
		//service = new UsuarioServiceImpl(new UsuarioDaoImpl(motor));
		listar();
	}

	public List<Afiliado> getListar() {
		return lista;
	}

	public void setLista(List<Afiliado> lista) {
		this.lista = lista;
	}	

    private void conectar() {
        
    }
}

