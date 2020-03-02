package org.tdgames.agenda.service;

import java.util.List;
import javax.jws.WebService;

import org.tdgames.agenda.model.Contacto;

@WebService
public interface ContactoService {

	Contacto crearContacto(Contacto contacto); //Metodo para crear un contacto
	
	List<Contacto> obtenerContactos(); //Metodo para obtener los contactos
	
}
