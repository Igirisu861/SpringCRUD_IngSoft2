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
	
	public Usuario findByID(int id) {
		Optional<Usuario> u = userRepository.findById(id);
		System.out.println(u.toString());
		return u.get();
	}

	@Override
	public void deleteUser(Integer id) {
		
	}
}
