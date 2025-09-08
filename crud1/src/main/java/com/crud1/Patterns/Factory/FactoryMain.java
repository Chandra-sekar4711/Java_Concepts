package com.crud1.Patterns.Factory;

import java.util.Scanner;

public class FactoryMain {
    public static void main(String[] args) {
        System.out.println("Enter the mail sending Options");
        Scanner sc = new Scanner(System.in);
        String mailType = sc.nextLine();

        FactoryMail mailtypeobj = new FactoryMail();
        Mail mailService = mailtypeobj.getMail("smtp");


        if (mailService != null) {
            if (mailService instanceof SmtpMail smtp) {
                smtp.setSmtpMail(1, "SMTP Server", 100);
            } else if (mailService instanceof Sendgrid sg) {
                sg.setSendgrid(2, "SendGrid Server", 200);
            }
            mailService.sendmail();
        } else {
            System.out.println("Invalid mail type!");
        }

    }
}


