package tech.leandroportugal.springmailsender.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
    
    @Autowired
    private JavaMailSender mailSender;

    public void sendSimpleMail(String  recipient, String subject, String body){

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("contato@leandroportugal.com");
        message.setTo(recipient);
        message.setSubject(subject);
        message.setText(body);

        mailSender.send(message);


    }
}
