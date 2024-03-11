/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.tesoreria;

import com.iplacex.strategy.Usuario;

/**
 *
 * @author Robinson Concha
 */
public interface CuentaUsuario {

    double getBalance();
    double getContribucion();
    
    Usuario getUsuario();

    String getId();
    void setId(String id);
    void setContribucion(double contribucion);
    void setBalance(double balance);

    void setUsuario(Usuario usuario);

    public String getPension();
   
    
}
