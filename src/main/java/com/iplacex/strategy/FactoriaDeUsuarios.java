/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.strategy;

import com.iplacex.tesoreria.CuentaUsuario;

/**
 *
 * @author Us
 */
 public class FactoriaDeUsuarios {
        public static Usuario creaUsuarioAfiliado(String id, String nombre,String apellido, int edad,double contribucion, double pension,String afp,CuentaUsuario cuentaUsuario, Estrategia estrategia){
        return new UsuarioAfiliadoImpl(id, nombre, apellido, edad, contribucion, pension, afp, cuentaUsuario,estrategia, new UsuarioAfiliado());
        
        }
        public static Usuario creaUsuarioPensionado(String id, String nombre,String apellido, int edad,double pension,String afp,Estrategia estrategia){
        return (Usuario) new UsuarioPensionadoImpl(id, nombre,apellido, edad,pension,afp,estrategia, new UsuarioPensionado());
        }
        
        public static Usuario creaUsuarioExcluido(String id, String nombre,String apellido, String exclusion,int edad,double pension,String afp, Estrategia estrategia){
        return (Usuario) new UsuarioExcluidoImpl(id, nombre,apellido,exclusion, edad,pension,afp,estrategia, new UsuarioExcluido());
        }
   
    }
    
    