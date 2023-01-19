package com.branko.emailVerification.email;

public interface EmailSender {
    void send(String to, String email);
}
