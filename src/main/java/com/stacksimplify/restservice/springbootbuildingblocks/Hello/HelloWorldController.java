package com.stacksimplify.restservice.springbootbuildingblocks.Hello;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stacksimplify.restservice.springbootbuildingblocks.Entity.UserDetails;

//Rest Controller class
@RestController
@RequestMapping("/api")
public class HelloWorldController {

	
	//@RequestMapping(method = RequestMethod.GET , path = "/helloworld")
	@GetMapping("/helloworld1")
	public String heLloWorld() {
		return "Hello World1";
	}
	
	@GetMapping("/helloworld-bean")
	public UserDetails helloWorldBean() {
		return new UserDetails("abc","xyz","blr");
	}
}
