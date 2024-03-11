package com.iplacex.categorias;
import com.iplacex.strategy.Usuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Equipo
 */
public class CategoriaImpl implements Categoria {
    private String idCategoria;
    private String nombreCategoria;
    private Usuario usuario;
    private List<Usuario> listadoUsuarios;
    private List<Categoria> listaCategorias;


    public CategoriaImpl(String idCategoria, String nombreCategoria, Usuario usuario) {
        this.idCategoria=idCategoria;
        this.nombreCategoria = nombreCategoria;
       
        this.usuario=usuario;
        this.listadoUsuarios = new ArrayList<>();
    }

    @Override
    public String getNombreCategoria() {
        return nombreCategoria;
    }

    @Override
    public void setNombreCategoria(String nombreCategoria) {
        this.nombreCategoria = nombreCategoria;
    }

    @Override
    public Usuario getUsuario() {
        return usuario;
    }

    @Override
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Usuario> getListadoUsuarios() {
        return listadoUsuarios;
    }

    @Override
    public void setListadoUsuarios(List<Usuario> listadoUsuarios) {
        this.listadoUsuarios = listadoUsuarios;
    }

    @Override
    public String getIdCategoria() {
        return idCategoria;
    }

    @Override
    public void setIdCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }
     @Override
    public List<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    @Override
    public boolean addUsuario(Usuario usuario) {
        return listadoUsuarios.add(usuario);
    }
    @Override
    public boolean creaUsuario(String nombre, double monto) {
       return listadoUsuarios.add(usuario); 
    }
    @Override
    public boolean removeUsuario(Usuario usuario) {
        return listadoUsuarios.remove(usuario);
    }
    
    @Override
    public String toString() {
        return nombreCategoria ;
    }
   
}

