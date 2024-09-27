package co.simplon.dreamteam.market.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.dreamteam.market.services.GeneralTermsService;

@RestController
@RequestMapping("/generalterms")
@CrossOrigin("*")
public class GeneralTermsController {
	private final GeneralTermsService service;

	public GeneralTermsController(GeneralTermsService service) {
		this.service = service;
	}

	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public String get() {
		return service.get();
	}

	@PostMapping("/updateData")
	@ResponseStatus(code = HttpStatus.OK)
	public String postMethodName(@RequestBody String inputs) {
		System.out.println(inputs);
		return service.updateData(inputs);
	}
}
