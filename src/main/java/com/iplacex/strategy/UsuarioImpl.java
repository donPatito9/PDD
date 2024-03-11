/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.strategy;


import com.iplacex.categorias.Categoria;
import com.iplacex.tesoreria.CuentaUsuario;
import java.util.Objects;


/**
 *
 * @author Equipo
 */
public class UsuarioImpl implements Usuario {
    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    private double contribucion;
    private double pension;
    private String afp;
    private CuentaUsuario cuentaUsuario;
    Estrategia estrategia;
    private Object listadoUsuarios;

    public UsuarioImpl(String id, String nombre, String apellido, int edad, double contribucion, double pension, String afp, CuentaUsuario cuentaUsuario, Estrategia estrategia) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.contribucion = contribucion;
        this.pension = pension;
        this.afp = afp;
        this.cuentaUsuario = cuentaUsuario;
        this.estrategia = estrategia;
    }

    @Override
    public String getAfp() {
        return afp;
    }

    @Override
    public void setAfp(String afp) {
        this.afp = afp;
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
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
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
    public double getPension() {
        return pension;
    }

    @Override
    public void setPension(double pension) {
        this.pension = pension;
    }


   

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioImpl other = (UsuarioImpl) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return nombre;
    }

    @Override
    public CuentaUsuario getCuentaUsuario() {
        return cuentaUsuario;
    }

    @Override
    public void setCuentaUsuario(CuentaUsuario cuentaUsuario) {
        this.cuentaUsuario = cuentaUsuario;
    }

    @Override
    public Estrategia getEstrategia() {
        return estrategia;
    }

    @Override
    public void setEstrategia(Estrategia estrategia) {
        this.estrategia = estrategia;
    }

    @Override
    public Object getListadoUsuarios() {
      return listadoUsuarios;
    }
    @Override
    public Object setListadoUsuarios(Object listadoUsuarios) {
      return listadoUsuarios;
    }

    @Override
    public void getListaCategorias() {
    }

    @Override
    public void gestionar(Usuario u, Categoria c) {
        
    }

  
   

 

   
   

   

    
    
    
    
    
    
}