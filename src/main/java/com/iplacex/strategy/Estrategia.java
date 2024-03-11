/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.strategy;

import com.iplacex.categorias.Categoria;
/**
 *
 * @author Robinson Concha
 */
public interface Estrategia {
    void gestionar(Categoria c, Usuario u);
    
}
