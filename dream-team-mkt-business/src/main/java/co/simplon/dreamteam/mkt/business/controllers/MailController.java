package co.simplon.dreamteam.mkt.business.controllers;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.dreamteam.mkt.business.entities.ContactForm;
import co.simplon.dreamteam.mkt.business.services.MailService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/mail")
@CrossOrigin("*")
public class MailController {

	private final MailService service;

	public MailController(MailService service) {
		this.service = service;
	}

	@PostMapping("/send")
	@ResponseStatus(code = HttpStatus.ACCEPTED)
	public void sendContactMail(@RequestBody Map<String, @Valid ContactForm> inputs) {
		service.sendContactMail(inputs.get("data"));
	}
}
