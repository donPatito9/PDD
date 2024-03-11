package com.iplacex.dao;

import com.iplacex.strategy.Usuario;
import java.util.ArrayList;
import java.util.List;



public class UsuarioDAOImpl implements UsuarioDAO {

	private Conexion conexion;
	private String motor;

	public UsuarioDAOImpl(String motor) {
		this.motor = motor;
		
		if (motor.equals("MYSQL")) {
			conexion = new MySQL();
		} else if (motor.equals("POSTGRESQL")) {
			conexion = new PostgreSQL();
		}
		conexion.conectar();
	}

	@Override
	public List<Usuario> listar() {
		
		List<Usuario> listadoUsuarios = new ArrayList<>();
		
		/*if (motor.equals("MYSQL")) {
			Usuario afil = new Usuario();
			afil.setId(1);
			afil.setNombre("Nombre");
			afil.setApellido("Apellido");
                        afil.setEdad(40);
			afil.setContribucion(100.000);
                        afil.setPension(200.000);
			afil.setAfp("Habitat");
			listaAfiliados.add(afil);
                        
                        afil = new Usuario();
                        
			afil.setId(2);
			afil.setNombre("Nombre");
			afil.setApellido("Apellido");
                        afil.setEdad(40);
			afil.setContribucion(100.000);
                        afil.setPension(200.000);
			afil.setAfp("Capital");
			listaAfiliados.add(afil);

			

		} else if (motor.equals("POSTGRESQL")) {
			/*Usuario afil = new UsuarioDao();
                        afil.setId(1);
			afil.setNombre("Nombre");
			afil.setApellido("Apellido");
                        afil.setEdad(40);
			afil.setContribucion(100.000);
                        afil.setPension(200.000);
			afil.setAfp("Habitat");
			listaAfiliados.add(afil);
                        
                        afil = new Afiliado();
                        
			afil.setId(2);
			afil.setNombre("Nombre");
			afil.setApellido("Apellido");
                        afil.setEdad(40);
			afil.setContribucion(100.000);
                        afil.setPension(200.000);
			afil.setAfp("Capital");
			listaAfiliados.add(afil);*/
			
		
		//conexion.listarAfiliados();
				
		return listadoUsuarios;
	}
}
