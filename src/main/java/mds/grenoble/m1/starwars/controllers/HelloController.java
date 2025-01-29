/**
 * 
 */
package mds.grenoble.m1.starwars.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * Basic controller Hello world
 */
@RestController
public class HelloController {

	@GetMapping
	String HelloWorld() 
	{
		return "Hello World";
	}
}
