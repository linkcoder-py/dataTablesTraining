package com.template.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class mainController {

	@RequestMapping(value = "/")
	public String index() {
		return "index";
	}
}
