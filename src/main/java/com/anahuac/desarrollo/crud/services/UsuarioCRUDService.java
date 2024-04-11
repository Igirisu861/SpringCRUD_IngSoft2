package com.anahuac.desarrollo.crud.services;

import java.util.List;
import java.util.Optional;

import com.anahuac.desarrollo.crud.entities.Usuario;

public interface UsuarioCRUDService {
	public Optional<Usuario> getUsuarioById(Integer id);
	public List<Usuario> findAll();
	public void deleteUser(Integer id);
	public Usuario crearUsuario(Usuario usuario);
}
