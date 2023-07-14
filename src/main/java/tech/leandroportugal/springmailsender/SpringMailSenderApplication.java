package tech.leandroportugal.springmailsender;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import tech.leandroportugal.springmailsender.services.EmailSenderService;

@SpringBootApplication
public class SpringMailSenderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMailSenderApplication.class, args);
	}


    @Autowired
    private EmailSenderService emailSenderService;

    @EventListener(ApplicationReadyEvent.class)
    public void  sendEmail(){
        emailSenderService.sendSimpleMail("viromi7122@iturchia.com", 
        "Implementando envio de email", 
        "E-mail simples enviado via spring");
    }
}
