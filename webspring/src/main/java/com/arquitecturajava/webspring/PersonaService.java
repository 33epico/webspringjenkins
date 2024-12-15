package com.arquitecturajava.webspring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
	
	@Autowired
	private PersonaRespository repositorio;
	
	public void add(Persona persona) {
		repositorio.add(persona);
	}

	public PersonaRespository getRepositorio() {
		return repositorio;
	}

	public void setRepositorio(PersonaRespository repositorio) {
		this.repositorio = repositorio;
	}

	public List<Persona> buscarTodos() {
		return repositorio.buscarTodos();
	}
	
	

}
