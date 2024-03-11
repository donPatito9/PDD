/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.facade;

import com.iplacex.categorias.Categoria;
import com.iplacex.singleton.OrdenadorCentral;
import com.iplacex.strategy.Usuario;
import com.iplacex.strategy.UsuarioAfiliado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Robinson Concha
 */

public class PreOnline {
    private final String id;
    private final  String nombre;
    private String idCategoria;
    private String nombreCategoria;
    
    private List<Usuario> ListadoUsuarios;
    private List<Categoria> ListaCategorias;
    
    public static OrdenadorCentral OC;

    public PreOnline(String id,String nombre) {
        this.id = id;
        this.nombre = nombre; 
        this.ListadoUsuarios = new ArrayList<>();
        this.ListaCategorias = new ArrayList<>();
        PreOnline.OC = OrdenadorCentral.getOrdenadorCentral();                
    }

    public List<Usuario> getListadoUsuarios() {
        return ListadoUsuarios;
    }

    public void setListadoUsuarios(List<Usuario> ListadoUsuarios) {
        this.ListadoUsuarios = ListadoUsuarios;
    }

    public List<Categoria> getListaCategorias() {
        return ListaCategorias;
    }

    public void setListaCategorias(List<Categoria> ListaCategorias) {
        this.ListaCategorias = ListaCategorias;
    }
    
    public boolean addUsuario(Usuario u) {
        return ListadoUsuarios.add(u);
    }

    public boolean addCategoria(Categoria c) {
        return ListaCategorias.add(c);
    }
    
    public boolean creaUsuarioAfiliado( String id, String nombre, String apellido, int edad,double contribucion, double pension,String afp){
        Usuario user= OC.creaUsuarioAfiliado(id, nombre, apellido,edad, contribucion,pension, afp);
        boolean p = ListadoUsuarios.contains(user);
        if(!p){
            //OC.creaCuentaUsuario(idCuenta, balance, user);
            addUsuario(user);
        }
        
        return !p;
    }
    
    public boolean creaUsuarioPensionado(String id, String nombre,String apellido, int edad, double pension,String afp){
        Usuario user= OC.creaUsuarioPensionado(id, nombre, apellido, edad, pension, afp);
        boolean p = ListadoUsuarios.contains(user);
        if(!p){
            OC.creaCategoria(idCategoria,nombreCategoria,user);
           // OC.creaCuentaUsuario(idCuenta, balance, user);
            addUsuario(user);
        }
        
        return !p;
    }
    
    public boolean creaUsuarioExcluido(String id, String nombre, String apellido,String exclusion, int edad, double pension, String afp){
        Usuario user= OC.creaUsuarioExcluido(id, nombre,apellido,exclusion, edad, pension, afp);
        boolean p = ListadoUsuarios.contains(user);
        if(!p){
             OC.creaCategoria(idCategoria,nombreCategoria,user);
           // OC.creaCuentaUsuario(idCuenta, balance, user);
            addUsuario(user);
        }
        
        return !p;
    }
    
    public boolean creaCategoria(String idCategoria, String nombreCategoria, Usuario usuario){
        Categoria cat= OC.creaCategoria(idCategoria, nombreCategoria, usuario);
        return addCategoria(cat);
    }
    
    public boolean asciendeAfiliado(Usuario u){
        u.setEstrategia(new UsuarioAfiliado() {
            
            @Override
            public void gestionar(Categoria c, Usuario u) {
                
            }
        });
         {}return true;
    }
    
    public Usuario InicioSesion(String nombre, String id) {
        Usuario usuario = null;
        Usuario res = usuario;
        for (Usuario u : ListadoUsuarios) {
            if (u.getId().equals(id)) {
                if (u.getNombre().equals(nombre)) {
                    res = u;
                }
            }
        }
        return res;
    }
    
    public Usuario BuscarUsuario(String id) {
        Usuario res = null;
        for (Usuario u : ListadoUsuarios) {
            if (u.getId().equals(id)) {
                res = u;
            }
        }
        return res;
    }
    
    public Categoria BuscarCategoria(String idCategoria){
        Categoria res= null;
        for(Categoria c: ListaCategorias){
            if(c.getIdCategoria().equals(idCategoria)){
                res = c;
            }
        }
        return res;
    }
    
    public Usuario InicioSesionUsuario(String nombre, String id, String idCategoria) {
        Usuario res = null;
        for (Usuario u : ListadoUsuarios) {
            if (u.getId().equals(id)) {
                if (u.getNombre().equals(nombre)) {
                    Categoria c = BuscarCategoria(idCategoria);
                    if(c!=null){
                        res = u;
                    }
                }
            }
        }
        return res;
    }
    public String getId() {
        return id;
    }
    
    public double getSaldoPreOnline(){
        return OC.tesoreria.getSaldoTotalSistema();
    }
    
    
}

