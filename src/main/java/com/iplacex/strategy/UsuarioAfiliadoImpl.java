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
 * @author Us
 */
public class UsuarioAfiliadoImpl extends UsuarioImpl {
    private Categoria categoria;


    UsuarioAfiliadoImpl(String id, String nombre, String apellido, int edad, double contribucion, double pension, String afp, CuentaUsuario cuentaUsuario, Estrategia estrategia, UsuarioAfiliado usuarioAfiliado) {
       super(id, nombre, apellido, edad, contribucion, pension, afp,cuentaUsuario, estrategia);

    } public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public Estrategia getEstrategia() {
        return estrategia;
    }

    @Override
    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }   
}

