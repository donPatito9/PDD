/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.categorias;


import com.iplacex.strategy.Usuario;
import java.util.List;

/**
 *
 * @author Equipo
 */
public interface Categoria {

    Usuario getUsuario();

    String getIdCategoria();

    List<Categoria> getListaCategorias();

    

    String getNombreCategoria();

    void setUsuario(Usuario usuario);

    void setIdCategoria(String id);

    void setListadoUsuarios(List<Usuario> listadoUsuarios);

    void setNombreCategoria(String nombreCategoria);
    
    boolean addUsuario(Usuario usuario);
    
    boolean removeUsuario(Usuario usuario);
    
    boolean creaUsuario(String nombre, double monto);
    
    @Override
    String toString();
    
}
