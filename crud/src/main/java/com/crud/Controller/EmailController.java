package com.crud.Controller;

import com.crud.Model.StudentEmailDetails;
import com.crud.Model.StudentEmailResponse;
import com.crud.Service.StudentEmailService;

import jakarta.mail.MessagingException;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
public class EmailController {

    @Autowired
    private StudentEmailService studentEmailService;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/testemail", method = RequestMethod.GET)
    public ResponseEntity<String> testApi() {
        return ResponseEntity.status(HttpStatus.OK).body("Email API is working!");
    }


    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(value = "/Testdep1", method = RequestMethod.GET)
    public ResponseEntity<String> Testdep1() {
        String res =studentEmailService.Testdep1();
        return ResponseEntity.status(HttpStatus.OK).body(res);
    }


    @RequestMapping(value = "/sendemail", method = RequestMethod.POST)
    public ResponseEntity<StudentEmailResponse> sendEmail(@RequestBody StudentEmailDetails emailDetails) {
        try {
            String[] recipients = emailDetails.getTo().toArray(new String[0]);
            System.out.println(Arrays.toString(recipients));
            studentEmailService.sendEmail(recipients, emailDetails.getSubject(), emailDetails.getText(), emailDetails.getAttachmentPath());
            StudentEmailResponse response = new StudentEmailResponse("Email sent successfully with attachment", true);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (MessagingException e) {
            StudentEmailResponse response = new StudentEmailResponse("Failed to send email with attachment: " + e.getMessage(), false);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
