package com.iplacex.strategy;

import com.iplacex.categorias.Categoria;

/**
 *
 * @author Robinson Concha
 */
public class UsuarioPensionadoImpl extends UsuarioPensionado{
   private Categoria categoria;

    public UsuarioPensionadoImpl(String id, String nombre, String apellido, int edad, double pension, String afp, Estrategia estrategia,UsuarioPensionado usuarioPensionado) {
        super();
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

   
} 

