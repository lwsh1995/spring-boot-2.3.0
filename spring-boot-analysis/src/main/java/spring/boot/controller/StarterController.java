package spring.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.boot.module.StarterService;

@RestController
@RequestMapping("/starter")
public class StarterController {

	@Autowired
	StarterService starterService;

	@GetMapping("/data")
	public String starter(){
		return starterService.starter();
	}

}
