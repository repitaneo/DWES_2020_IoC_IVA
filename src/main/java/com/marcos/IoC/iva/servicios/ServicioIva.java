package com.marcos.IoC.iva.servicios;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service
@Qualifier("iva")
public class ServicioIva implements IvaFrancia, IvaEspana {

	private static final float ivaFrancia = 0.25f;
	private static final float ivaEspana = 0.21f;
	
	
	@Override
	public float generarIvaEspana(float precio) {
		
		return precio+(precio*ivaEspana);
	}

	
	@Override
	public float generarIvaFrancia(float precio) {
		// TODO Auto-generated method stub
		return precio+(precio*ivaFrancia);
	}

	

}
