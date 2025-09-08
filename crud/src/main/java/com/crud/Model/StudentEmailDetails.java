package com.crud.Model;

import java.util.List;

public class StudentEmailDetails {

    private List<String> to;
    private String subject;
    private String text;
    private String attachmentPath; // Optional, if you want to include attachments

    // Getters and Setters

    public List<String> getTo() {
        return to;
    }

    public void setTo(List<String> to) {
        this.to = to;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAttachmentPath() {
        return attachmentPath;
    }

    public void setAttachmentPath(String attachmentPath) {
        this.attachmentPath = attachmentPath;
    }

	@Override
	public String toString() {
		return "StudentEmailDetails [to=" + to + ", subject=" + subject + ", text=" + text + ", attachmentPath="
				+ attachmentPath + "]";
	}
    
    
}




