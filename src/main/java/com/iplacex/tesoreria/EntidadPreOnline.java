/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.tesoreria;
import com.iplacex.strategy.Usuario;
//import java.util.LinkedList;
import java.util.List;


public class EntidadPreOnline {
    private FactoriaDeCuentas fdc;
    private String idPreonline;
    private String nombreSucursal;
    private double saldoTotalSistema;
    private List<Usuario> ldUsuarios;
    private List<CuentaUsuario> ldCU;
    
    //crea las cuentas bancarias

    public EntidadPreOnline(FactoriaDeCuentas fdc, String idPreonline, String nombreSucursal, double saldoTotalSistema, List<Usuario> ldUsuarios, List<CuentaUsuario> ldCU) {
        this.fdc = fdc;
        this.idPreonline = idPreonline;
        this.nombreSucursal = nombreSucursal;
        this.saldoTotalSistema = saldoTotalSistema;
        this.ldUsuarios = ldUsuarios;
        this.ldCU = ldCU;
    }

    public EntidadPreOnline(String string, String central_Previsiones, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public CuentaUsuario creaCuentaUsuario(String id, double balance, Usuario usuario){
        CuentaUsuario cu= fdc.creaCuentaUsuario(id, balance,usuario);
        ldUsuarios.add(usuario);
        ldCU.add(cu);
        usuario.setCuentaUsuario(cu);
        return cu;
        
    }

    public double getSaldoTotalSistema() {
        return saldoTotalSistema;
    }

    public void setSaldoTotalSistema(double saldoTotalSistema) {
        this.saldoTotalSistema = saldoTotalSistema;
    }
    
    
}
