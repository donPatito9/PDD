/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.strategy;

import com.iplacex.categorias.Categoria;
import com.iplacex.tesoreria.CuentaUsuario;


/**
 *
 * @author Robinson Concha
 */
public class UsuarioExcluido implements Estrategia{
    @Override
    public void gestionar(Categoria c, Usuario u) {
        restarDinero(u);
        sumarDinero(c, u);
        borrarUsuarioCategoria(c, u);
    }
    public void restarDinero(Usuario u){
        u.setPension(u.getPension()-u.getPension()*0.0);
    }
    
    public void sumarDinero(Categoria c, Usuario u){
        c.getUsuario().setPension(c.getUsuario().getPension()+u.getPension()*0.0);
    }
    public void borrarUsuarioCategoria(Categoria c, Usuario u){
        c.removeUsuario(u);
    }
 
}