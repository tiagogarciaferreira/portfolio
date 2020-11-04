package com.tgfcodes.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value = "/curriculo")
public class CurriculoController {
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/visualizar")
	private String visualizar() {
		return "curriculo";
	}
	
}
