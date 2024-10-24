package co.simplon.dreamteam.mkt.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.dreamteam.mkt.services.GeneralTermsService;
import jakarta.validation.constraints.NotBlank;

@RestController
@RequestMapping("/generalterms")
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

	@PatchMapping("/updateData")
	@ResponseStatus(code = HttpStatus.OK)
	public String update(@RequestBody @NotBlank String inputs) {
		return service.updateData(inputs);
	}
}
