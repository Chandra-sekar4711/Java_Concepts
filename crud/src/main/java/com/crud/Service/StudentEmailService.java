package com.crud.Service;

import jakarta.mail.MessagingException;

public interface StudentEmailService {
    void sendEmail(String[] to, String subject, String text, String attachmentPath) throws MessagingException;

	String Testdep1();
}

