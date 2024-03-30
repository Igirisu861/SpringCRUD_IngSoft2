package com.anahuac.desarrollo.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.anahuac.desarrollo.crud.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer>{

}
