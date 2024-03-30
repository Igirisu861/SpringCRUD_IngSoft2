package com.anahuac.desarrollo.crud.services;

import java.util.List;

import com.anahuac.desarrollo.crud.entities.Usuario;

public interface UsuarioCRUDService {
	public Usuario findByID(int id);
	public List<Usuario> findAll();
	public void deleteUser(Integer id);
}
