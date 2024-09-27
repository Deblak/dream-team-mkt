package co.simplon.dreamteam.mkt.services.implementations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import co.simplon.dreamteam.mkt.dtos.ContactFormDto;
import co.simplon.dreamteam.mkt.services.MailService;
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
	public void sendContactMail(ContactFormDto inputs) {
		String mailBody = "Companie name: " + inputs.corporateName() + System.lineSeparator() + "Contact Name: " + inputs.firstName() + " " + inputs.lastName()
				+ System.lineSeparator() + "Email: " + inputs.email() + " " + "Phone number: " + inputs.phoneNumber() + System.lineSeparator() + "Message: "
				+ inputs.message();
		String subject = "Message from dream team contact form by " + inputs.firstName() + " " + inputs.lastName();
		try {
			MimeMessage message = sender.createMimeMessage();
			MimeMessageHelper helper = new MimeMessageHelper(message);
			helper.setFrom(emailFrom);
			helper.setReplyTo(emailFrom);
			helper.setTo(inputs.email());
			helper.setSubject(subject);
			helper.setText(mailBody);
			sender.send(message);
		} catch (MessagingException e) {
			System.err.println(e);
		}
	}

}
