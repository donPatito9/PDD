/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.strategy;

import com.iplacex.categorias.Categoria;

/**
 *
 * @author Robinson Concha
 */
public class UsuarioExcluidoImpl extends UsuarioExcluido{

    private Categoria categoria;

  
    UsuarioExcluidoImpl(String id, String nombre, String apellido, String exclusion, int edad, double pension, String afp, Estrategia estrategia, UsuarioExcluido usuarioExcluido) {
        super();
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
}
