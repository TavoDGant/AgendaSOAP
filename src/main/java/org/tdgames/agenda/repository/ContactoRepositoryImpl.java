package org.tdgames.agenda.repository;

import java.util.ArrayList;
import java.util.List;

import org.tdgames.agenda.model.Contacto;

public class ContactoRepositoryImpl implements ContactoRepository{

	private static List<Contacto> contactoDigital = new ArrayList<Contacto>();
	
	@Override
	public Contacto crearContacto(Contacto contacto) {
		// TODO Auto-generated method stub
		System.out.println("Crear contacto:");
		contactoDigital.add(contacto);
		return contacto;
	}

	@Override
	public List<Contacto> obtenerContactos() {
		// TODO Auto-generated method stub
		System.out.println("Obtener contactos");
		return contactoDigital;
	}

	
}
