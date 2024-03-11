package com.iplacex.singleton;

import com.iplacex.categorias.Categoria;
import com.iplacex.categorias.FactoriaDeCategorias;
import com.iplacex.strategy.FactoriaDeUsuarios;
import com.iplacex.strategy.Usuario;
import com.iplacex.strategy.UsuarioPensionadoImpl;
import com.iplacex.tesoreria.CuentaUsuario;
import com.iplacex.tesoreria.EntidadPreOnline;

/**
 *
 * @author Robinson Concha
 */
public class OrdenadorCentral {
    
    FactoriaDeUsuarios fdUsers;
    public EntidadPreOnline tesoreria;
    FactoriaDeCategorias fdCat;
    
    private static OrdenadorCentral instancia=null;

    private OrdenadorCentral() {
        fdUsers = new FactoriaDeUsuarios();
        tesoreria = new EntidadPreOnline("1", "Central PreOnline", 100000);
        fdCat = new FactoriaDeCategorias();
    }
    
    public static OrdenadorCentral getOrdenadorCentral(){
        //Singleton
        if(instancia==null){
            instancia=new OrdenadorCentral();
        }
        return instancia;
    }
    
    public Usuario creaUsuarioAfiliado(String id, String nombre, String apellido, int edad, double contribucion, double pension,String afp){
        return creaUsuarioAfiliado(id, nombre,apellido, edad,contribucion,pension,afp);
    }
    
    public Usuario creaUsuarioExcluido(String id, String nombre, String apellido,String exclusion, int edad, double pension, String afp){
        return creaUsuarioExcluido(id, nombre, apellido,exclusion, edad,pension,afp);
    }
    public Usuario creaUsuarioPensionado(String id, String nombre, String apellido, int edad, double pension, String afp){
        return creaUsuarioPensionado(id, nombre,apellido, edad,pension,afp);
    }
    
    public CuentaUsuario creaCuentaUsuario(String id, double balance, Usuario usuario){
        return tesoreria.creaCuentaUsuario(id, balance, usuario);
    }
    
    public Categoria creaCategoria(String idCategoria, String nombre, Usuario usuario){
        Categoria c3 = FactoriaDeCategorias.creaCategoria(idCategoria, nombre, usuario);
        UsuarioPensionadoImpl u = (UsuarioPensionadoImpl)usuario;
        u.setCategoria(c3);
        return c3;
    }

   

   
}
