package com.anahuac.desarrollo.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anahuac.desarrollo.crud.dao.UsuarioRepository;
import com.anahuac.desarrollo.crud.entities.Usuario;

@Service
public class UsuarioCRUDServiceImpl implements UsuarioCRUDService {
	
	
	@Autowired
	private UsuarioRepository userRepository;
	
	public List<Usuario> findAll(){
		return userRepository.findAll();
	}
	
	public Optional<Usuario> getUsuarioById(Integer id) {
		return userRepository.findById(id);
	}

	@Override
	public void deleteUser(Integer id) {
		userRepository.deleteById(id);
	}

	@Override
	public Usuario crearUsuario(Usuario usuario) {
		System.out.println("usuario>>>"+usuario.toString());
		return userRepository.save(usuario);
	}
}
