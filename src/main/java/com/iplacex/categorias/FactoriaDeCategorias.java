/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.categorias;

import com.iplacex.strategy.Usuario;
/**
 *
 * @author Equipo
 */
public class FactoriaDeCategorias {
    public static Categoria creaCategoria(String idCategoria, String nombreCategoria, Usuario usuario){
        return new CategoriaImpl(idCategoria, nombreCategoria, usuario);
    }
}
