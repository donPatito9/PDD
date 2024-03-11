/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.tesoreria;

import com.iplacex.strategy.Usuario;


/**
 *
 * @author Equipo
 */
public class CuentaUsuarioImpl implements CuentaUsuario {
    private String id;
    private double contribucion;
    private Usuario usuario;

    public CuentaUsuarioImpl(String id, double contribucion, Usuario usuario) {
        setId(id);
        setContribucion(contribucion);
        setUsuario(usuario);
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public double getContribucion() {
        return contribucion;
    }

    @Override
    public void setContribucion(double contribucion) {
        this.contribucion = contribucion;
    }

    @Override
    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public double getBalance() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setBalance(double balance) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getPension() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

  
}
