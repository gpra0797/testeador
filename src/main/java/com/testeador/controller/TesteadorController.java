package com.testeador.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.testeador.model.Prueba;
import com.testeador.utils.Validacion;

@RestController
public class TesteadorController {
	
	@Autowired
	private Validacion validacion;
	
	@GetMapping(value = "/probarValidador")
	public String probarValidador(@RequestParam(name = "campoProbar") String campoProbar) {
		Prueba p = new Prueba();
		p.setDescripcion("JEJE");
		p.setFechaCreacion(new Date());
		p.setId(15);
		
		List<Prueba> pruebas = new ArrayList<>();
		pruebas.add(p);
		
		Map<String,String> map = new HashMap<>();
		
		Prueba p2 = null;
		
		String cadena= String.valueOf(validacion.isEmpty(p.getDescripcion()));
		String objeto= String.valueOf(validacion.isEmpty(p2));
		String fecha= String.valueOf(validacion.isEmpty(p.getFechaCreacion()));
		String entero= String.valueOf(validacion.isEmpty(p.getId()));
		String listaArray= String.valueOf(validacion.isEmpty(pruebas));
		String mapa= String.valueOf(validacion.isEmpty(map));
		return String.join(" | ", cadena , objeto, fecha, entero , listaArray , mapa) + "\n" + p.toString();
	}
}
