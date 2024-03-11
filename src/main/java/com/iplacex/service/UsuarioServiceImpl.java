/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.service;



import com.iplacex.dao.UsuarioDAO;
import com.iplacex.strategy.Usuario;
import java.util.List;

/**
 *
 * @author Us
 */
public class UsuarioServiceImpl implements UsuarioService{

	private final UsuarioDAO dao;
	
	public UsuarioServiceImpl(UsuarioDAO dao) {
		this.dao = dao;
	}

    public UsuarioServiceImpl(String motor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
	@Override
	public List<Usuario> listar() {		
		return dao.listar();
	}

} 
    

