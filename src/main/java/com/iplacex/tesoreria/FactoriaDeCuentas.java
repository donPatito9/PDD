package com.iplacex.tesoreria;

import com.iplacex.strategy.Usuario;

/**
 *
 * @author Robinson Concha
 */
public class FactoriaDeCuentas {
    public static CuentaUsuario creaCuentaUsuario(String id, double balance, Usuario usuario){
        return new CuentaUsuarioImpl(id, balance,usuario);
    }
}
