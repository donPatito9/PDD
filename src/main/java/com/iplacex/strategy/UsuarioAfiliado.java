package com.iplacex.strategy;

import com.iplacex.categorias.Categoria;
import com.iplacex.tesoreria.CuentaUsuario;

/*
 *
 * @author Robinson Concha
 */
public  class UsuarioAfiliado implements Estrategia{

    public void gestionar(Categoria c, Usuario u, CuentaUsuario cu) {
        restarDinero(u, cu);
        sumarDinero(c, u);
        borrarUsuarioCategoria(c, u);
    }
    public void restarDinero(Usuario u, CuentaUsuario cu){
        cu.setBalance(cu.getBalance()-u.getContribucion());
    }
    
    public void sumarDinero(Categoria c, Usuario u){
        c.getUsuario().getCuentaUsuario().setBalance(c.getUsuario().getCuentaUsuario().getBalance()+u.getContribucion());
    }
    public void borrarUsuarioCategoria(Categoria c, Usuario u){
        c.removeUsuario(u);
    }

    @Override
    public void gestionar(Categoria c, Usuario u) {
       borrarUsuarioCategoria(c, u);
    }
      
}