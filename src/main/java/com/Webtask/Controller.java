package com.Webtask;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {

	@GetMapping(value="/webtask")
	public String getname() {
		return "Hello prethivi";
	}
}



