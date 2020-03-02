package org.tdgames.agenda.service;

import java.util.List;

import javax.jws.WebService;

import org.tdgames.agenda.model.Contacto;
import org.tdgames.agenda.repository.ContactoRepository;
import org.tdgames.agenda.repository.ContactoRepositoryImpl;

@WebService(endpointInterface = "org.tdgames.agenda.service.ContactoService")
public class ContactoServiceImpl implements ContactoService{

	ContactoRepository contactoRepository = new ContactoRepositoryImpl();
	
	@Override
	public Contacto crearContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		return contactoRepository.crearContacto(contacto);
	}

	@Override
	public List<Contacto> obtenerContactos() {
		// TODO Auto-generated method stub
		return contactoRepository.obtenerContactos();
	}



	
}
