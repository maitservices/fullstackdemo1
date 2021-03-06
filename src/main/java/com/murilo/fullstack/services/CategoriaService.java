package com.murilo.fullstack.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.murilo.fullstack.domain.Categoria;
import com.murilo.fullstack.repositories.CategoriaRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) throws ObjectNotFoundException {
		Categoria obj = categoriaRepository.findOne(id);
		if(obj==null) {
			throw new ObjectNotFoundException("Objeto não encontrado! Id: "+id+", Tipo: "+Categoria.class.getName());
		}
		return obj;
	}
}
