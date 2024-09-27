package co.simplon.dreamteam.mkt.services;

import co.simplon.dreamteam.mkt.dtos.ContactFormDto;

public interface MailService {

	void sendContactMail(ContactFormDto inputs);
}
