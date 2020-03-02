package org.tdgames.agenda.repository;

import java.util.List;

import org.tdgames.agenda.model.Contacto;

public interface ContactoRepository {

	Contacto crearContacto(Contacto contacto); //Metodo para crear un contacto
	
	List<Contacto> obtenerContactos(); //Metodo para obtener los contactos
}
