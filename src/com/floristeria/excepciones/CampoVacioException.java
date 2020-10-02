package com.floristeria.excepciones;

import java.lang.Exception;

/**
 * @author Victoria Parra
 * @author Rubén Rodríguez
 */

public class CampoVacioException  extends Exception {

	public CampoVacioException() {
		
	}
	
	public CampoVacioException(String msj_error) {
		
		super(msj_error);
	}
}
