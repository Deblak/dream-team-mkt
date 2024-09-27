package co.simplon.dreamteam.mkt.business.services;

import co.simplon.dreamteam.mkt.business.entities.ContactForm;

public interface MailService {

	void sendContactMail(ContactForm inputs);
}
