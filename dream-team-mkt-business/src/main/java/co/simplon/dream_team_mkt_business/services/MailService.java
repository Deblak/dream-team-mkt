package co.simplon.dream_team_mkt_business.services;

import co.simplon.dream_team_mkt_business.entities.ContactForm;

public interface MailService {

	void sendContactMail(ContactForm inputs);
}
