package com.kazuhiro23.sample.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author arai_kazuhiro
 */
@RestController
@RequestMapping(value = "/")
public class TestController {

	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public String test() {
		return "test";
	}
}
