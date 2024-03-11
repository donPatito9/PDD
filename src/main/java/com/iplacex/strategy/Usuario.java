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
 * @author Equipo
 */
public interface Usuario {
    
    String getId();
    String getNombre();
    String getApellido();
    int getEdad();
    double getContribucion();
    double getPension();
    String getAfp();
    
    //int getMonto();
    //void setMonto();
    
    void setId(String id);
    void setNombre(String nombre);
    void setApellido(String apellido);
    void setEdad(int edad);
    void setContribucion(double contribucion);
    void setPension(double pension);
    void setAfp(String afp);
    
    void gestionar(Usuario u, Categoria c);
    
    CuentaUsuario getCuentaUsuario();
    void setCuentaUsuario(CuentaUsuario cuentaUsuario);
    
    Estrategia getEstrategia();
    void setEstrategia(Estrategia estrategia);
    
    @Override
    String toString();

     public Object getListadoUsuarios();   
     public Object setListadoUsuarios(Object listadoUsuarios); 

    public void getListaCategorias();
}

