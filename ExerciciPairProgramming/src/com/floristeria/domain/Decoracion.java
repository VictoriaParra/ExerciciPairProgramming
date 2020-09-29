package com.floristeria.domain;

import com.floristeria.excepciones.CampoVacioException;

public class Decoracion {

	private String nombre;

	private String material;

	private double precio;

	public Decoracion(String nombre, String material, double precio)
			throws CampoVacioException, IllegalArgumentException {

		if (nombre.isEmpty()) {
			throw new CampoVacioException("Ha dejado el campo nombre vacio");
		}

		this.nombre = nombre;

		if (!material.equalsIgnoreCase("Pl�stico") && !material.equalsIgnoreCase("Madera")) {

			throw new IllegalArgumentException("El material solo puede ser madera o plastico");
		}

		this.material = material;

		if (precio < 0) {

			throw new IllegalArgumentException("Ha introducido un n�mero inferior a 0");
		}

		this.precio = precio;
	}

	@Override
	public String toString() {
		return "\t Nombre: " + nombre + ", Material: " + material + ", Precio: " + precio;
	}

}
