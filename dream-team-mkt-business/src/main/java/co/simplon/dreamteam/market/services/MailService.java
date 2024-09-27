package co.simplon.dreamteam.market.services;

import co.simplon.dreamteam.market.dtos.ContactFormDto;

public interface MailService {

	void sendContactMail(ContactFormDto inputs);
}
