package spring.boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/spring/boot")
public class IndexController {

	@GetMapping("/index")
	public String index(){
		return "index";
	}

}
