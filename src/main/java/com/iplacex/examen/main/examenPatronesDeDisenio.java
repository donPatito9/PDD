/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.examen.main;

import com.iplacex.categorias.Categoria;
import com.iplacex.facade.PreOnline;
import com.iplacex.model.Afiliado;
import com.iplacex.model.Excluido;
import com.iplacex.model.Pensionado;
import com.iplacex.strategy.Usuario;
import java.util.List;

/**
 *
 * @author Robinson Concha
 */
public class examenPatronesDeDisenio {


    public static void main(String[] args) {
        // TODO code application logic here
        Usuario afil = (Usuario) new Afiliado();
        
        Usuario pens = (Usuario) new Pensionado();
        
        Usuario excl = (Usuario) new Excluido();
    
    }
    public static void Usuarios(List<Usuario> listadoUsuarios){
               
        PreOnline app = new PreOnline("PreOnline", "00001");
        
        app.creaUsuarioAfiliado("00001", "Toreto","Dolape", 50, 0.00, 0.00,"Provida");
        
        app.creaUsuarioAfiliado("00002", "Pablo","Pedrovich", 30, 0.00, 0.00,"Provida");
        
        app.creaUsuarioExcluido("000004","Juan", "PacoPedroDeLaMar", "FFAA", 40, 0.00, "Cooperativa");
        
        app.creaUsuarioExcluido("000006","Murio", "Tite", "FALLECIDO",100, 0.00, "Plan Vital XD");
        
        app.creaUsuarioPensionado("00003", "Francisco", "Riado", 60, 0.0, "Cuprum");
        
        Usuario afil1 = app.BuscarUsuario("00001");
        Usuario afil2 = app.BuscarUsuario("00001");
        Usuario pens2 = app.BuscarUsuario("00002");
        Usuario excl3 = app.BuscarUsuario("00003");
        
        //Categoria cat=new Categoria();
        
        Categoria cat1 = app.BuscarCategoria("Afiliado");
        Categoria cat2 = app.BuscarCategoria("Pensionado");
        Categoria cat3 = app.BuscarCategoria("Excluido");
        
        app.getListaCategorias();
        
        afil1.gestionar(afil1, cat1);
        afil1.gestionar(afil2, cat1);
        pens2.gestionar(pens2,cat2);
        excl3.gestionar(excl3, cat3);
       
        afil1.gestionar(afil1, cat1);
        
        System.out.println("---------------------------------------------------");
        System.out.println("Usuario: "+afil1.getCuentaUsuario().getContribucion());
        System.out.println("Usuario: "+afil1.getCuentaUsuario().getPension());
        System.out.println("---------------------------------------------------");
        
        afil2.gestionar(afil2, cat1);
        
        System.out.println("Usuario: "+afil2.getCuentaUsuario().getPension());
        System.out.println("usuario: "+afil1.getCuentaUsuario().getContribucion());
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        
        app.asciendeAfiliado(afil1);
        
        pens2.gestionar(afil1, cat2);
        System.out.println("Usuario: "+afil1.getCuentaUsuario().getContribucion());
        System.out.println("usuario: "+pens2.getCuentaUsuario().getContribucion());
        System.out.println("----------------------------------------------------");
        System.out.println("----------------------------------------------------");
        
        app.asciendeAfiliado(afil1);
        
        afil1.gestionar(afil1, cat1);
        
        System.out.println("Usuario: "+afil1.getCuentaUsuario().getContribucion());
        System.out.println("Usuario:  "+afil2.getCuentaUsuario().getPension());
        System.out.println("Usuario: "+pens2.getCuentaUsuario().getContribucion());
        System.out.println("Usuario: "+excl3.getCuentaUsuario().getContribucion());
        System.out.println("---------------------------------------------------");
        System.out.println("-----------Saldo PreOnline: "+app.getSaldoPreOnline());
        System.out.println("---------------------------------------------------");
        
        

    }
    
}
    
