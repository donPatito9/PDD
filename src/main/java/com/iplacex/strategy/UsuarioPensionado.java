/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.strategy;

import com.iplacex.categorias.Categoria;
import com.iplacex.facade.PreOnline;
/**
 *
 * @author Equipo
 */
public class UsuarioPensionado implements Estrategia{

    @Override
    public void gestionar(Categoria c, Usuario u) {
        restarDinero(u);
        sumarDinero(c, u);
        restaPreonline(u);
        borrarUsuarioCategoria(c, u);
    }
    public void restarDinero(Usuario u){
        u.setPension(u.getPension()-u.getPension());
    }
    
    public void sumarDinero(Categoria c, Usuario u){
        c.getUsuario().setPension(c.getUsuario().getPension()+u.getPension());
    }
    public void restaPreonline(Usuario u){
       PreOnline.OC.tesoreria.setSaldoTotalSistema(PreOnline.OC.tesoreria.getSaldoTotalSistema()-u.getPension());
    }
    public void borrarUsuarioCategoria(Categoria c, Usuario u){
        c.removeUsuario(u);
    }  
}
