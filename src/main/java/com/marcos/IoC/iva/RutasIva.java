package com.marcos.IoC.iva;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marcos.IoC.iva.servicios.ServicioIva;


@Controller
public class RutasIva {
	

	@Autowired
	@Qualifier("iva")
	ServicioIva servicioIva;
	
	
	@GetMapping("/ivaf/{importe}")
	@ResponseBody
	public String espacioAlumnado(@PathVariable Float importe) {
	
		return ""+servicioIva.generarIvaFrancia(importe);
		
	}	
	
	
	@GetMapping("/ivae/{importe}")
	@ResponseBody
	public String espacioProfesorado(@PathVariable Integer importe) {
	
		return ""+servicioIva.generarIvaEspana(importe);
	}	
}
