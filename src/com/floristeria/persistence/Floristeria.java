package com.floristeria.persistence;

import java.util.ArrayList;
import java.util.List;

import com.floristeria.domain.Arboles;
import com.floristeria.domain.Decoracion;
import com.floristeria.domain.Flores;
import com.floristeria.excepciones.CampoVacioException;

/**
 * @author Victoria Parra
 * @author RubÃ©n RodrÃ­guez
 */

public class Floristeria {

	private String nombre;

	private List<Arboles> listaArboles = new ArrayList<Arboles>();

	private List<Flores> listaFlores = new ArrayList<Flores>();

	private List<Decoracion> listaDecoraciones = new ArrayList<Decoracion>();

	// Constructor sin parámetros
	public Floristeria() {

	}

	/**
	 * Constructor
	 * 
	 * @param nombre nombre de la floristeria
	 */

	public Floristeria(String nombre) throws CampoVacioException {

		/**
		 * @throws CampoVacioException Lanzar excepción si el campo nombre está vacío
		 */

		if (nombre.isEmpty()) {
			throw new CampoVacioException("Ha dejado el campo nombre vacio");
		}

		this.nombre = nombre;

	}

	/**
	 * Método para añadir un árbol a la lista arboles
	 * 
	 * @param arbol
	 */

	public void anadirArbol(Arboles arbol) {
		listaArboles.add(arbol); // Se añade a la listaArboles
	}

	/**
	 * Método para añadir una flor a la lista flores
	 * 
	 * @param flor
	 */

	public void anadirFlor(Flores flor) {
		listaFlores.add(flor);
	}

	/**
	 * Método para añadir decoración a la lista decoracioes
	 * 
	 * @param deco
	 */

	public void anadirDecoracion(Decoracion deco) {
		listaDecoraciones.add(deco);
	}

	/**
	 * @return devuelve lista de arboles
	 */
	public List<Arboles> getListaArboles() {
		return listaArboles;
	}

	/**
	 * @return devuelve lista de flores
	 */
	public List<Flores> getListaFlores() {
		return listaFlores;
	}

	/**
	 * @return devuelve lista de decoraciones
	 */
	public List<Decoracion> getListaDecoraciones() {
		return listaDecoraciones;
	}

}
