package com.udemy.fernando.mymail.Model;

public class Email {
    private String sender;
    private String message;
    private String subject;
    private String date;
    private int color;

    public Email(String sender, String subject, String message, int color, String date) {
        this.sender = sender;
        this.message = message;
        this.subject = subject;
        this.color = color;
        this.date = date;
    }

    public String getSender() {
        return sender;
    }

    public String getMessage() {
        return message;
    }

    public String getSubject() {
        return subject;
    }

    public int getColor() {
        return color;
    }

    public String getDate() {
        return date;
    }
}
