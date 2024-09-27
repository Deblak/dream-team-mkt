package co.simplon.dreamteam.mkt.business.services;

import co.simplon.dreamteam.mkt.business.dtos.ContactFormDto;

public interface MailService {

	void sendContactMail(ContactFormDto inputs);
}
