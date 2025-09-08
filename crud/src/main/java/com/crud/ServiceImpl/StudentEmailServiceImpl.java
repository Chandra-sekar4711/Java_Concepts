package com.crud.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.crud.Service.StudentEmailService;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

import org.springframework.core.io.FileSystemResource;



import java.io.File;

@Service
public class StudentEmailServiceImpl implements StudentEmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendEmail(String[] to, String subject, String text, String attachmentPath) throws MessagingException {
      MimeMessage message = javaMailSender.createMimeMessage();

        MimeMessageHelper helper = new MimeMessageHelper(message, true);
        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText(text);

        // Add attachment if provided
        if (attachmentPath != null && !attachmentPath.isEmpty()) {
            FileSystemResource file = new FileSystemResource(new File(attachmentPath));
            helper.addAttachment(file.getFilename(), file);
        }

        javaMailSender.send(message);
    }

	@Override
	public String Testdep1() {
		
		return "Dependency  API is working! fiine";
	}
}
