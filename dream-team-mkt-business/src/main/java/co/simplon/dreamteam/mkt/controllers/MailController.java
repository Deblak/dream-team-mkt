package co.simplon.dreamteam.mkt.controllers;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.dreamteam.mkt.dtos.ContactFormDto;
import co.simplon.dreamteam.mkt.services.MailService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/mail")
public class MailController {

	private final MailService service;

	public MailController(MailService service) {
		this.service = service;
	}

	@PostMapping("/send")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public void sendContactMail(@RequestBody @Valid Map<String, ContactFormDto> inputs) {
		service.sendContactMail(inputs.get("data"));
	}
}
