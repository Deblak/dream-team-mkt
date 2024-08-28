package co.simplon.dream_team_mkt_business.controllers;

import java.util.Map;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.simplon.dream_team_mkt_business.entities.ContactForm;
import co.simplon.dream_team_mkt_business.services.MailService;
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
	public void sendContactMail(@RequestBody Map<String, @Valid ContactForm> inputs) {
		service.sendContactMail(inputs.get("data"));
	}
}