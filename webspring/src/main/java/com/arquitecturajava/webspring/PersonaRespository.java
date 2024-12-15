package com.arquitecturajava.webspring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.arquitecturajava.webspring.models.Persona;

@Component
public class PersonaRespository {
	
	private List<Persona> personas = new ArrayList();
	
	public PersonaRespository() {
		
		personas.add(new Persona("Ana"));
	}
	
	public void add(Persona persona) {
		personas.add(persona);
	}
	
	public List<Persona> buscarTodos(){
		return personas;
	}
	
	

}
