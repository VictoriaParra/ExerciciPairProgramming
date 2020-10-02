package com.floristeria.domain;

import com.floristeria.excepciones.CampoVacioException;

public class Arboles implements Plantas {

	private String nombre;

	private double altura;

	private double precio;

	/**
	 * Constructor
	 * 
	 * @param nombre nombre del �rbol
	 * 
	 * @param altura altura del �rbol
	 * 
	 * @param precio precio del �rbol
	 */

	public Arboles(String nombre, double altura, double precio) throws CampoVacioException, IllegalArgumentException {

		/**
		 * @throws Lanzar excepci�n si el campo est� vac�o o, si tanto la altura y el
		 *                precio, est�n en negativo.
		 */

		if (nombre.isEmpty()) {

			throw new CampoVacioException("Has dejado el campo nombre vacio");
		} else if (altura < 0 || precio < 0) {

			throw new IllegalArgumentException("Has introducido un n�mero inferior a 0");
		} else {

			this.nombre = nombre;

			this.altura = altura;

			this.precio = precio;
		}
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return "Esto es un �rbol.";
	}

	@Override
	public String toString() {
		return "\t Nombre: " + nombre + ", Altura: " + altura + " cm, Precio: " + precio;
	}

}