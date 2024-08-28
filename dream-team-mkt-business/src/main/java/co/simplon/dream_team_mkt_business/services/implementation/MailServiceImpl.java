package co.simplon.dream_team_mkt_business.services.implementation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import co.simplon.dream_team_mkt_business.entities.ContactForm;
import co.simplon.dream_team_mkt_business.services.MailService;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class MailServiceImpl implements MailService {

	@Value("${co.simplon.dream-team.email.from}")
	private String emailFrom;

	private final JavaMailSender sender;

	public MailServiceImpl(JavaMailSender sender) {
		this.sender = sender;
	}

	@Override
	public void sendContactMail(ContactForm inputs) {
		try {
			MimeMessage message = sender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message);
			helper.setFrom(emailFrom);
			helper.setReplyTo(emailFrom);
			helper.setTo(inputs.email());
			helper.setSubject("test subject from spring");
			helper.setText("Message: " + inputs.message());
			sender.send(message);
		} catch (MessagingException e) {
			System.err.println(e);
		}
	}

}